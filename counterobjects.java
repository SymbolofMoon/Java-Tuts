

class Counter_Objects
{

    public static void main(String ... args ){

        Counting_obj obj1 = new Counting_obj();
        Counting_obj obj2 = new Counting_obj();
        Counting_obj obj3 = new Counting_obj();
        obj3.show();


    }
}

class Counting_obj{
    
    public static void  main(String...args){
        System.out.print("Hello");
    } 
    static int i;
    public Counting_obj(){
        i++;

    }
    public void show(){
        System.out.println(i);
    }
}