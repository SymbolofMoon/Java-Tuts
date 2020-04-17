class Varags{

    public static void main (String ... args)
    {
       Display obj= new Display();
       obj.show(5);
      // obj= null;
       obj.show(6,7,8);
    }
}

class Display{

    public void show(int ... a){
        for (int i : a ){
            System.out.println(i);// extension for loop
        }
    }
    public void show (int a)
    {
        System.out.println(a +" is the result ");
    }
}