interface Abc{ 
    void show();// not define methods and by default it is a public and abstract 
}

class Interface1{

    public static void main(String ... args){
        Abc obj = () -> System.out.println("In show");// Interface uses this lambda expression for only one method 
        obj.show();
        

    }
}