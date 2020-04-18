

enum Mobile{
    APPLE(100),SAMSUNG(80),HUWAVI(120);
    int price;
    Mobile(int p){
        price = p;
    }
    public int getprice(){
        return price;
    }
}
class EnumExample{
    public static void main(String ... args){
     //   System.out.println(Mobile.APPLE);
     /*
     Mobile m = Mobile.APPLE;
     switch(m){
        case APPLE:
            System.out.println("Apple is best");
            break;
        case SAMSUNG:
            System.out.println("Samsung Galaxy 7");
            break;    
     }
     System.out.println(Mobile.APPLE.getprice());
     */
    Mobile m[]= Mobile.values();//value is automatically given by jvm
    for( Mobile mobile: m){
        System.out.println(mobile+"'s price is "+ mobile.getprice());
    }
    }
}
