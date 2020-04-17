class Switch

{
  public static void main (String[] args){

      int i=8;
      switch(i){

        case(0):
            System.out.println("Monday");
        case(1):
            System.out.println("Tuesday");
        case(2):
            System.out.println("Wednesday");
            break;
        case(3):
            System.out.println("Thursday");   
        case(4):
            System.out.println("Friday");    
        case(5):
            System.out.println("Saturday");    
        case(6):
            System.out.println("Sunday");         
        default:
            System.out.println("Enter Correct Number");
            break;                   
      }
  }

}