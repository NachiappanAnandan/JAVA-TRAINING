package Day2;

//Students marks

public class StudentsMarks_ex14 {
    public static void main(String[] args) {
        Result R = new Result("Ajay", 1, 45, 90, 87);
        System.out.println( R.totalMarks);
    }
}

class Student{

    String name;
    int rollno;

    Student(String N , int R){
        this.name = N;
        this.rollno = R;
    }

}

class Exam extends Student{
  
    Exam(String N, int R , int S1,int S2, int S3) {
        super(N, R);
        this.sub1 = S1;
        this.sub2 = S2;
        this.sub3 = S3;
        //TODO Auto-generated constructor stub
        
    }


    int sub1 , sub2, sub3;

    public int CalculateTotal(){
        return sub1+sub2+sub3;
    }
    
    

}

class Result extends Exam{
    Result(String N, int R , int S1,int S2, int S3) {
        super(N,R,S1,S2, S3);
        
    }
    int totalMarks = super.CalculateTotal();
    
    
}
