class Abc{
 public static void main(String ... args){
     SureshPhone obj = new SureshPhone();
     obj.move();
     obj.call();
     obj.dance();
     obj.cook();
 }

}


abstract class MaheshPhone{// abstract class

    public void call(){
        System.out.print("calling...");
    }
    public abstract void move();
    public abstract void dance();
    public abstract void cook();
}

abstract class Rameshphone extends MaheshPhone{ // abstract class

    public void move(){
        System.out.print("Moving..");
    }
}

class SureshPhone extends Rameshphone{

    public void dance(){
        System.out.print("Dancing...");
    }
    public void cook(){
        System.out.print("Cooking....");
    }
}