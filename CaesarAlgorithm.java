import java.util.Scanner;

public class CaesarAlgorithm {
    Encrypt encrypt;
    Decrypt decrypt;

    public static void main(String args[]) {
        Scanner EncryptOrDecryptChoice = new Scanner(System.in); // Create a Scanner object
        System.out.println("What do you want to do?");
        String EncryptOrDecrypt = EncryptOrDecryptChoice.nextLine(); // Read user input
        while (!EncryptOrDecrypt.equals("encrypt") && !EncryptOrDecrypt.equals("decrypt")) {
            System.out.println("You can only choose encrypt or decrypt");
            EncryptOrDecrypt = EncryptOrDecryptChoice.nextLine(); // Read user input
        }
        Scanner messageInput = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter message");
        String message = messageInput.nextLine(); // Read user input

        Scanner keyInput = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter key");
        int cypherKey = keyInput.nextInt(); // Read user input

        messageInput.close();
        keyInput.close();
        EncryptOrDecryptChoice.close();

        switch (EncryptOrDecrypt) {
            case "encrypt":
                Encrypt.encrypt(message, cypherKey);
                break;

            case "decrypt":
                Decrypt.decrypt(message, cypherKey);
                break;
        }

    }
}
