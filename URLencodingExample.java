import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLencodingExample {
    public static void main(String[] args) {
       try {
        String url="https://chat.openai.com/";
       String url1=URLEncoder.encode(url, "UTF-8") ;
       System.out.println("URL1: "+url1);

       String decodedurl=URLDecoder.decode(url1, "UTF-8");

       System.out.println("Decoded :"+decodedurl);
        
       } catch (UnsupportedEncodingException e) {
        e.printStackTrace();
       }

    }
}
