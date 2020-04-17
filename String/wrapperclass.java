

class Wrapper{

    public static void main(final String... args) {
        final int i = 5;
        final Integer ii = new Integer(i);// Boxing
        Integer jj = i;// auto Boxing
        System.out.print(ii);
        int j = jj.intValue(); //Unboxing
        int k = jj; //Auto Unboxing
    } 
}