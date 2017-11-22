package arr;

class Studented{
	int[] jum;
	int ban, sum, avg;
	String name; 



void meth_1class(String name) {
	
	this.name=name;
}

void meth_2Score(int ban, int Kor, int Eng, int Meth) {
	this.ban= ban;
	this.jum= new int[] {Kor,
						Eng,
						Meth};
	
	for(int i=0; i<jum.length;i++) {
		this.sum+=i;
		}
		this.avg=sum/jum.length;
	
	}
void print() {
	System.out.print(name+"\t"+ban+"\t"+jum[0]+"\t"+jum[1]+"\t"+jum[2]+"\t"+sum+"\t"+avg
			);


}

}

public class Homework8Oops {
	public static void main(String[] args) {
	
	
	
	
	Studented st = new Studented();
	st.meth_1class("아기상어");
	st.meth_2Score(2,70,50,60);
	
	st.print();
		
	
	
}
}



