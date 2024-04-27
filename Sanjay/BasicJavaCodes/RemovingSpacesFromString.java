package Sanjay.BasicJavaCodes;

public class RemovingSpacesFromString {
    public static void main(String[] args) {
        String s = "This is just a test string.";
        System.out.println(RemoveSpaces(s));
    }

    private static StringBuilder RemoveSpaces(String s) {
        char[] charArr = s.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char each : charArr) {
            if (!Character.isWhitespace(each)) {
                result.append(each);
            }
        }
        return result;
    }
}
