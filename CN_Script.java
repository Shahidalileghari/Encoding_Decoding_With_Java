import java.util.Base64;

public class CN_Script {

    public static void main(String[] args) {
        String base64string="YjRzMzY0X3MzY3IzdEZsNGc=";

        try{
             byte[] decodedbyte=Base64.getDecoder().decode(base64string);
             String newString=new String(decodedbyte);
             System.out.println("Decoded String :"+newString);

        }catch(IllegalArgumentException e)
        {
        System.out.println("Error: invalid base64 string");
        }
        
    }
}
