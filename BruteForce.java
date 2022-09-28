class BruteForce {
    static void bruteForceDecrypt(String message) {
        int numericValueOfMessage;
        char messageDecrypt;
        String bruteForceDecrypt = "";
        int alphabterLength = 26;
        for (int j = 1; j < alphabterLength; j++) {
            for (int i = 0; i < message.length(); i++) {
                if (Character.isLowerCase(message.charAt(i))) {
                    numericValueOfMessage = message.charAt(i) - 'a';
                    messageDecrypt = (char) ('a'
                            + (((numericValueOfMessage - j) % alphabterLength) + alphabterLength)
                                    % alphabterLength);
                    bruteForceDecrypt += messageDecrypt;
                } else if (Character.isUpperCase(message.charAt(i))) {
                    numericValueOfMessage = message.charAt(i) - 'A';
                    messageDecrypt = (char) ('A'
                            + (((numericValueOfMessage - j) % alphabterLength) + alphabterLength)
                                    % alphabterLength);
                    bruteForceDecrypt += messageDecrypt;
                } else if (Character.isWhitespace(message.charAt(i))) {
                    bruteForceDecrypt += message.charAt(i);
                }
            }
            System.out.println(bruteForceDecrypt + "\n");
            bruteForceDecrypt = "";
        }
    }
}