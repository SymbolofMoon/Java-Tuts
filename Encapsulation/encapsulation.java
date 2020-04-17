class A{

    private int i;//private only works under mention class not in another class 
    public void setI(int j){
        i=j;
    }
    public int getI(){
        return i;
    }
}

class encapsulation{
    public static  void main (String ... args ){
        A obj = new A();
        obj.setI(5);
       System.out.println( obj.getI());
    }
}