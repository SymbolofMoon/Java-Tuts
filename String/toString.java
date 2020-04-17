class tostrings{
    public static void main(String ... args){
       Student s1 = new Student(56,"Prateek" );
       System.out.println(s1.toString());
    }
}

class Student{

    int rollno;
    String sname;
    public  Student(int rollno, String sname){
        this.rollno=rollno;
        this.sname=sname;

    
        
    }
}