package Interface;

class Interface {

    public static void main(final String... args) {
        // B obj=new B();
        // suppose you wants to display B's memory but not want to display its content
        // like display so that it can be done further
        final A obj = new B();
         obj.show();
         //  obj.display();
    }
}


interface A{
     public void show();
}

class B implements A{// can use multiple inheritence i.e b implements A,c

  public void show(){
      System.out.println("It is a show method");
  }
  public void display() {
      System.out.println("It is a display method");
  }    
  }


