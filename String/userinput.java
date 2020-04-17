import java.io.BufferedReader;
import java.io.InputStreamReader;

class UserInput{
    public static void main(String ... args ) throws Exception{
        System.out.println("Enter a number");
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int n = Integer.parseInt( br.readLine());
        System.out.println(n);
     
    } 
}