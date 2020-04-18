
@FunctionalInterface // only one method will be there
interface C{

    void show();
   // void uu();
}

class A{
    public void showdatafromlastyeardatabase(){
              System.out.println("In A");
    }
}

class B extends A{
    @SuppressWarnings("unchecked")
    @Override
    public void showdatafromlastyeardatabase(){//<-- this error we want
        System.out.println("In B");
} 
}

class Annotationbasic{
    public static void main (String ... args){

        B obj = new B();
        obj.showdatafromlastyeardatabase();
    }
}