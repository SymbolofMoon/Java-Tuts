

 class Clone {
    public static void main(String ... args) throws CloneNotSupportedException {
        A obj = new A();
        obj.i = 5;
        System.out.print(obj.i);
        A obj1= obj;
        System.out.print(obj1.i);//Shallow copy, in this if i of obj1 is change , then i of main obj also change
        A obj2= new A();
        System.out.print(obj2.i);
        obj2.i=obj.i;
        System.out.print(obj2.i);// deep copy ,in this if i of obj2 is change , then i of main obj is not change

        A obj3 = (A)obj.clone();
        System.out.println(obj3.i);//Clone but mix of deep and shallow


    }
}
class A implements Cloneable
{

    int i;
    int j;

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}