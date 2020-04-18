import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.text.Annotation;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Smartphone {// khali @interface smartphone is marker annotation

    String os();
    int version();
   
}

@Smartphone(os="Android",version=6)

class NokiaSeries{
   String model;
   int size;

   public NokiaSeries(String model, int size){
       this.model=model;
       this.size=size;
   }
}




class CreatingAnnotation{
    public static void main (String ... args){
        NokiaSeries obj = new NokiaSeries("Fire", 5);

        Class c =  obj.getClass();
      //  System.out.println(c);
        Annotation an = (Annotation) c.getAnnotation(Smartphone.class);
        Smartphone s = (Smartphone) an;
        System.out.println(s.os());

        
    }
}