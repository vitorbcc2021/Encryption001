public class App {
    public static void main(String[] args) throws Exception {
        String encText = Encryption.encrypt("helloworldz", "ccccccccccc");
        System.out.println("Encrypted text: " + encText);

        String decText = Encryption.decrypt(encText, "ccccccccccc");
        System.out.println("Decrypted text: " + decText);
    }
}
