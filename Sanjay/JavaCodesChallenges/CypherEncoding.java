package Sanjay.JavaCodesChallenges;

public class CypherEncoding {
    public static void main(String[] args) {
        String encryptedMessage = "ABCX";
        int indexEncrypted = 26;
        String result = decryptMessage(encryptedMessage, indexEncrypted);
        System.out.println(result);
        String resultAnti = decryptMessageAntiClock(encryptedMessage, indexEncrypted);
        System.out.println(resultAnti);
    }

    private static String decryptMessage(String encryptedMessage, int indexEncrypted) {
        StringBuilder result = new StringBuilder();

        indexEncrypted = indexEncrypted % 26;

        int last = 'Y' + 1;
        for (char each : encryptedMessage.toCharArray()) {
            int position = each + indexEncrypted;
            if (position > last) {
                position -= 26;
            }
            result.append((char) position);
        }
        return result.toString();
    }

    private static String decryptMessageAntiClock(String encryptedMessage, int indexEncrypted) {
        StringBuilder result = new StringBuilder();
        indexEncrypted = indexEncrypted % 26;
        int last = 'B' - 1;
        for (char each : encryptedMessage.toCharArray()) {
            int position = each - indexEncrypted;
            if (position < last) {
                position += 26;
            }
            result.append((char) position);
        }
        return result.toString();
    }
}
