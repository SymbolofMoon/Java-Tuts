interface P{
// This khali interface is called marker interface used for the permission to use a method in class.

}

class Demo implements P{

    void show(){
        System.out.println("I am show");


    }
}

class MarkerInterface{
    public static void main(String ... args){
       Demo obj = new Demo();
       if (obj instanceof P){
           obj.show();
       }
       else{
           System.out.println("No Permission");
       }
    }
}