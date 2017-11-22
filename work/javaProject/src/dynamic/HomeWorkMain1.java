package dynamic;
 
 
class CheckUniversity
{
    String name;
    String gender;
    String universityType;
    int [] score;
    int [] printScoreArr;
    double [] averageNumArr;
    int passingScore;
    int total;
    int average;
    String [] passingSign = {"합격", "불합격", "여자만 입학이 허가됩니다"};
    int passingId = 0;
    
    public CheckUniversity() 
    {
        // TODO Auto-generated constructor stub
    }
    
    void init()
    {
        cal();
        print();
    }
    
    void cal()
    {
        printScoreArr = new int[score.length];
        for (int i = 0; i < score.length; i++) 
        {
            printScoreArr[i] = (int)(score[i] * averageNumArr[i]);
            total += printScoreArr[i];
        }
        
        
        average = total / score.length;
        if(passingId == 0)
        {
            passingId = (average > passingScore) ? 0 : 1;
        }
    }
    
    void print()
    {
        String res = "";
        res += gender + "\t" +  name + "\t" + universityType + "\t" + "\t";
        for (double p : printScoreArr) 
        {
            res += (int)p + "\t";
        }
        
        res += total + "\t" +  average + "\t" + passingSign[passingId];
        System.out.println(res);
    }
}
 
 
class NormalUniversity extends CheckUniversity
{
    String universityType = "일반대학교";
    double [] averageNumArr = {1, 1, 1};
    int passingScore = 40;
    
    public NormalUniversity(String name, String gender, int [] score) 
    {
        // TODO Auto-generated constructor stub
        super.name = name;
        super.gender = gender;
        super.score = score;
        super.universityType = this.universityType;
        super.averageNumArr = this.averageNumArr;
        super.passingScore = this.passingScore;
        super.init();
    }
}
 
class ArtUniversity extends CheckUniversity
{
    String universityType = "예술대학교";
    double [] averageNumArr = {0.6, 0.4, 0.5}; 
    int passingScore = 40;
    
    public ArtUniversity(String name, String gender, int [] score) 
    {
        // TODO Auto-generated constructor stub
        super.name = name;
        super.gender = gender;
        super.score = score;
        super.universityType = this.universityType;
        super.averageNumArr = this.averageNumArr;
        super.passingScore = this.passingScore;
        super.init();
    }
}
 
class WomanUniversity extends CheckUniversity
{
    String universityType = "여자대학교";
    double [] averageNumArr = {0.5, 0.6, 0.4}; 
    int passingScore = 40;
    
    
    public WomanUniversity(String name, String gender, int [] score) 
    {
        // TODO Auto-generated constructor stub
        super.passingId = (gender == "남자") ? 2 : 0;
        super.name = name;
        super.gender = gender;
        super.score = score;
        super.universityType = this.universityType;
        super.averageNumArr = this.averageNumArr;
        super.passingScore = this.passingScore;
        super.init();
    }
}
 
class Student
{
    String name;
    String gender;
    int [] score;
    
    public Student(String name, String gender, int [] score) 
    {
        this.name = name;
        this.score = score;
        new NormalUniversity(name, gender, score);
        new ArtUniversity(name, gender, score);
        new WomanUniversity(name, gender, score);
        
        System.out.println("***********************************************");
        System.out.println("***********************************************");
        System.out.println("***********************************************");
    }
}
 
public class HomeWorkMain1 
{
 
    public static void main(String[] args) 
    {
        // TODO Auto-generated method stub
        
        String [] index = {"성별", "이름", "학교", "국어", "영어", "수학", "총점", "평균", "합격여부"};
        for (int i = 0; i < index.length; i++) 
        {
            if(i == 3) System.out.print("\t");
            System.out.print(index[i] + "\t");
        }
        System.out.println();
        
        String [][] st = {{"브레드", "남자"}, {"레즈너", "남자"}, {"졸리", "여자"}, {"에드거", "남자"},
                           {"엠마", "여자"}, {"코넬리", "여자"},  {"키아누", "남자"}, {"와이즈", "여자"},
                           {"조니뎁", "남자"}, {"노튼", "남자"}};
        
        int [][] scoArr = {{87, 77, 84}, {97, 76, 57}, {84, 65, 98}, {54, 76, 52},
                            {99, 85, 95}, {95, 63, 74}, {25, 64, 95}, {89, 98, 99},
                            {63, 85, 77}, {96, 74, 85}};
         
        
        for (int i = 0; i < st.length; i++) 
        {
            new Student(st[i][0], st[i][1], scoArr[i]);
        }
        
    }
 
}