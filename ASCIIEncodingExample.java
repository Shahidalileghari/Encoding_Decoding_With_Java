
public class ASCIIEncodingExample {
    public static void main(String[] args) {
        
        String originalData = "Hello, World!";

        // Encoding
        byte[] encodedBytes = originalData.getBytes();
        System.out.println("Encoded ASCII: " + new String(encodedBytes));

        // Decoding
        String decodedData = new String(encodedBytes);
        System.out.println("Decoded data: " + decodedData);
    }
    
}
