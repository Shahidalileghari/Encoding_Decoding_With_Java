import java.util.Base64;

public class Base64EncodingExample {
    public static void main(String[] args) {
        String Originaldata="Shahid Ali Leghari";
        byte[] str=Originaldata.getBytes();
         String bytetocodeded=Base64.getEncoder().encodeToString(str);

         System.out.println("Encoded data:"+bytetocodeded);

         String newdata="U2hhaGlkIEFsaSBMZWdoYXJp";
         byte[] decodedbyte=Base64.getDecoder().decode(newdata);
         String str1=new String(decodedbyte);
         System.out.println("Decoded data :"+str1);
    }
    
}
