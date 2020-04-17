class SuperDemo{
 public static void main(String args[]){

 B obj= new B();
 obj.show();
 }

}

class A{
    public int i=5;
}
class B extends A {
    public int i=4;
    public void show(){
        System.out.println(super.i);//print A's i
    }
}