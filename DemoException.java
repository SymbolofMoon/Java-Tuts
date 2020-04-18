
class Demo_Exception{
    public static void main(String ... args){
        int i =4,j=2,k=0;
        int a[]= new int[4];
        try {
             k= i/j;
             if(k<10){
                 throw new ArithmeticException();
             }
             for (int c=0;c<=4;c++){
                 a[c]=c+1;
             }
             for (int value :a){
                 System.out.println(value);//ctrl+l  //alt //ctrl+d
             }

        }
        catch(ArithmeticException e){
              // System.out.println("zero is not divisible");
              System.out.println("Maximum no for output is 10");//alt + down
              
              
              
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Maximum no of array is 4");
        }
        finally{
            System.out.print("Bye");
        }
        System.out.println(k);
        
    }
} 

