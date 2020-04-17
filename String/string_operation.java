import java.util.Scanner;

class StringOp{
    public static void main(String ... args){
        String s1,s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 strings");
        s1 = sc.nextLine();
        s2= sc.nextLine();

        String s3= s1.concat(s2);//s1+s2
        int l1= s3.length();
        String s4= s3.toUpperCase();
        
        System.out.println("Result of Concatation is : "+s3);
        System.out.println(l1);
        System.out.println(s4);
    }
}