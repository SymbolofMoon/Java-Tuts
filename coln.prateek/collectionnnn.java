
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;



class Coln1{

    public static void main( String... args) {
    // Collection <Integer>values = new ArrayList<Integer>();
     List <Integer>values = new ArrayList<Integer>();
  
       values.add(385);
       values.add(852);
       values.add(791);
       values.add(987);
       Comparator <Integer> com = new Comparator<Integer>() {
        
    
    

		@Override
		public int compare(Integer arg0, Integer arg1) {
            if (arg0%10>arg1%10)
                    return 1;
			// TODO Auto-generated method stub
			return -1;//reverse order
		}};
       Collections.sort(values,com);
       //Collections.reverse(values);
     
       

        for ( Integer i : values) {
            System.out.println(i);
        }


    }
}