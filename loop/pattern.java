import java.util.Scanner;

class Pattern{

    public static void main (String[] args){


        for (int i=1;i<6;i++){
            for (int j =1;j<=i;j++){
                if ((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                 System.out.print("0");
                }
                
            }
            System.out.println("");
        
        }

        for (int k=1;k<6;k++){
            for (int l =1;l<=k;l++){
                
                    System.out.print(k);
                
                
            }
            System.out.println("");
        
        }
        
        int a,b=1,c=1;
        a=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any Nymber");
        int n=sc.nextInt();
        System.out.print("1 1 ");
        while(a<=n){
            a=b+c;
            System.out.print(a + " ");
            b=c;
            c=a;
        }

    }
}