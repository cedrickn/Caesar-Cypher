class Decrypt {
    static void decrypt(String message, int cypherKey) {
        int numericValueOfMessage;
        char messageDecrypt;
        String sequenceDecrypt = "";
        int alphabterLength = 26;
        for (int i = 0; i < message.length(); i++) {
            if (Character.isLowerCase(message.charAt(i))) {
                numericValueOfMessage = message.charAt(i) - 'a';
                messageDecrypt = (char) ('a'
                        + (((numericValueOfMessage - cypherKey) % alphabterLength) + alphabterLength)
                                % alphabterLength);
                sequenceDecrypt += messageDecrypt;
            } else if (Character.isUpperCase(message.charAt(i))) {
                numericValueOfMessage = message.charAt(i) - 'A';
                messageDecrypt = (char) ('A'
                        + (((numericValueOfMessage - cypherKey) % alphabterLength) + alphabterLength)
                                % alphabterLength);
                sequenceDecrypt += messageDecrypt;
            } else if (Character.isWhitespace(message.charAt(i))) {
                sequenceDecrypt += message.charAt(i);
            }
        }
        System.out.println(sequenceDecrypt);
    }
}