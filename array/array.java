package array;

import java.util.Random;

class Array{
    public static void main (final String[] args) {

        final Random r = new Random();
        final int a[] = new int[20];

        //System.out.println(a[0]);
        
        for (int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt(50);// assigned random number and if not given it will assign all number as 0
           System.out.println(a[i]);
     } 
     }
}