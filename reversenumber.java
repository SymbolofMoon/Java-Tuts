import java.util.Scanner;
/*Armstrong number= 1 5 3
                    1*1*+5*5*5+3*3*3=153
                    3 7 0=3*3*3+7*7*7+0*0*0
*/

class Reverse
{
    public static void main (String[] args){
        //palindrome -> 121= reverse(121)
        //not palindrome -> 321 not equal to reverse (321)
        int s=0,r;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any Nymber");
        int n=sc.nextInt();
        int t=n;
        while(n>0){
            r=n%10;
            n=n/10;
            s=s*10+r;
        } 
        System.out.println(s+" is reverse of "+t);
        if (t==s){
          System.out.println(" it is palindrome");   
        }
        else{
           System.out.println(" it is not a palindrome");   
        }

        int l=153;
        int temp=l;
        int d,sum=0;

        while(l>0){
            d=l%10;
            l=l/10;
            sum=sum+d*d*d;
        }

        System.out.println(sum); 
    }
}