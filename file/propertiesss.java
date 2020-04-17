import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

class App {

    public static void main(final String... args) throws Exception{
       final Properties p = new Properties();
  
  /*     final OutputStream os = new FileOutputStream("dataConfig.properties");
        p.setProperty("url", "localhost:8080/myDb");
        p.setProperty("uname", "Prateek");
        p.setProperty("pass", "1234");

        p.store(os,null);
        */
        InputStream is = new FileInputStream("dataConfig.properties");
        p.load(is);

        p.list(System.out);

    }
}