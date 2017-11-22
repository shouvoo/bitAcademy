package homeWork_20170912;

import java.util.ArrayList;
import java.util.TreeMap;

import javax.swing.JOptionPane;

class ExamTimer extends Thread
{
	ExamManager em;
	boolean timeBln = false;
	public ExamTimer(ExamManager em) 
	{
		super();
		this.em = em;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		for (int i = 20; i >= 0; i--) 
		{
			if(em.bln) break;
			try 
			{
				System.out.println("======= 시험시간 " + i + " 초 남았습니다!");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		timeBln = true;
		System.out.println("시간초과 시험종료");
	}
}

class Exam
{
	String question, answer;

	public Exam(String question, String answer) 
	{
		super();
		this.question = question;
		this.answer = answer;
	}
	
}

class ExamManager
{
	int subjectTotal, subjectNumber, allExamTotal = 100, 
	rightCnt, worngCnt, total, average, examCnt = 0;
	ArrayList<Integer> singleExamTotal = new ArrayList<>();
	TreeMap<String, ArrayList<Exam>> qnaMap;
	TreeMap<Integer, String> examOrder = new TreeMap<>();
	int [] singleTotal;
	int[][] rnoCnt;
	boolean bln = false;
	ExamTimer et;
	
	public ExamManager(TreeMap<String, ArrayList<Exam>> qnaMap) 
	{
		this.qnaMap = qnaMap;
		et = new ExamTimer(this);
		et.start();
		init();
	}
	
	public void init()
	{
		examOrder.put(0, "국어");
		examOrder.put(1, "영어");
		examOrder.put(2, "수학");
		singleTotal = new int[this.qnaMap.size()];
		rnoCnt = new int[this.qnaMap.size()][this.qnaMap.size()];
		for (int i = 0; i < this.qnaMap.size(); i++) 
		{
			if(et.timeBln) break;
			subjectTotal = 0;
			rightCnt = 0;
			worngCnt = 0;
			subjectNumber += i;
			allExamTotal += this.qnaMap.get(examOrder.get(i)).size();
			
			singleExamTotal.add(this.qnaMap.get(examOrder.get(i)).size());
			//System.out.println(this.qnaMap.get(examOrder.get(i)).size());
			System.out.println(examOrder.get(i) + "시험");
			for (int j = 0; j < singleExamTotal.get(i); j++) 
			{	
				if(et.timeBln) break;
				Exam em = this.qnaMap.get(examOrder.get(i)).get(j);
				String input = JOptionPane.showInputDialog(em.question);
				System.out.print(em.question + " :   \t");
				if(em.answer.equals(input))
				{
					rightCnt += 1;
					subjectTotal += 20;
					rnoCnt[i][0] = rightCnt;
					System.out.println("  정답 : " + input);
				} else 
				{
					worngCnt += 1;
					rnoCnt[i][1] = worngCnt;
					System.out.println("  오답 : " + input);
				}
				examCnt++;
			}
			
			singleTotal[i] = subjectTotal;
			total += singleTotal[i];
			average = total / singleTotal.length;
		}
		
		bln = true;
		
		print();
	}

	public void print() 
	{
		System.out.println("국어\t" + "영어\t" + "수학\t" + "총점\t" + "평균\t" );
		String res = "";
		rightCnt = 0;
		worngCnt = 0;
		for (int i = 0; i < singleTotal.length; i++) 
		{
			res += singleTotal[i] + "\t";
		}
		
		res += total + "\t" + average;
		
		System.out.println(res);
		
		for (int i = 0; i < singleTotal.length; i++) 
		{
			System.out.println(examOrder.get(i) + ", 정답 : " + rnoCnt[i][0] + ", 오답 : " + rnoCnt[i][1]);
			rightCnt += rnoCnt[i][0];
			worngCnt += rnoCnt[i][1];
		}
		
		System.out.println("토탈, 정답 : " + rightCnt + ", 오답 : " + worngCnt);
	}
	
}

public class HomeWorkMain 
{

	private static final ExamManager ExamManager = null;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ArrayList<Exam> korExam = new ArrayList<>(); 
		korExam.add(new Exam("국어문제1", "1"));
		korExam.add(new Exam("국어문제2", "2"));
		korExam.add(new Exam("국어문제3", "3"));
		korExam.add(new Exam("국어문제4", "4"));
		korExam.add(new Exam("국어문제5", "5"));
		
		ArrayList<Exam> engExam = new ArrayList<>(); 
		engExam.add(new Exam("영어문제1", "1"));
		engExam.add(new Exam("영어문제2", "2"));
		engExam.add(new Exam("영어문제3", "3"));
		engExam.add(new Exam("영어문제4", "4"));
		engExam.add(new Exam("영어문제5", "5"));
		
		ArrayList<Exam> matExam = new ArrayList<>(); 
		matExam.add(new Exam("수학문제1", "1"));
		matExam.add(new Exam("수학문제2", "2"));
		matExam.add(new Exam("수학문제3", "3"));
		matExam.add(new Exam("수학문제4", "4"));
		matExam.add(new Exam("수학문제5", "5"));
		
		TreeMap<String, ArrayList<Exam>> qnaMap = new TreeMap<>();
		qnaMap.put("국어", korExam);
		qnaMap.put("영어", engExam);
		qnaMap.put("수학", matExam);
		
		ExamManager em = new ExamManager(qnaMap);
		

	}

}
