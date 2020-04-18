class A{
    int rollno;
    String sname;
    class B{
        public void show(){
            System.out.println("Hello");

        }
    }
}

class Memberdemo{
    public static void main(String ... args){
        A a = new A();
        A.B obj = a.new B();
        obj.show();
    }
}