class Encrypt {
    static void encrypt(String message, int cypherKey) {
        int numericValueOfMessage;
        char messageEncrypt;
        String sequenceEncrypt = "";
        int alphabterLength = 26;
        for (int i = 0; i < message.length(); i++) {
            if (Character.isLowerCase(message.charAt(i))) {
                numericValueOfMessage = message.charAt(i) - 'a';
                messageEncrypt = (char) ('a' + ((numericValueOfMessage + cypherKey) % alphabterLength));
                sequenceEncrypt += messageEncrypt;
            } else if (Character.isUpperCase(message.charAt(i))) {
                numericValueOfMessage = message.charAt(i) - 'A';
                messageEncrypt = (char) ('A' + ((numericValueOfMessage + cypherKey) % alphabterLength));
                sequenceEncrypt += messageEncrypt;
            } else if (Character.isWhitespace(message.charAt(i))) {
                sequenceEncrypt += message.charAt(i);
            }
        }
        System.out.println(sequenceEncrypt);
    }
}