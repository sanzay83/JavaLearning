package Sanjay.JavaCodesChallenges.HacRan;

public class isBalanced {
    public static void main(String[] args) {
        String str = "{{[[(())]]}}";
        System.out.printf("Given parenthesis is %s \n", str);
        System.out.printf("isBalanced? %s", checkBalanced(str));
    }

    private static String checkBalanced(String s) {
        String newString = s;
        boolean flag = true;
        String[] arr = {"()", "[]", "{}"};
        while (flag) {
            if (newString.contains("()")) {
                newString = removeString(arr[0], newString);
            } else if (newString.contains("[]")) {
                newString = removeString(arr[1], newString);
            } else if (newString.contains("{}")) {
                newString = removeString(arr[2], newString);
            } else {
                return "NO";
            }
            if (newString.isEmpty()) {
                flag = false;
            }
        }
        return "YeS";
    }

    private static String removeString(String type, String str) {
        int length = 0;
        int stringLength = str.length();
        StringBuilder newString = new StringBuilder();

        while (length < stringLength - 1) {
            if (!type.equals(str.substring(length, length + 2))) {
                newString.append(str.charAt(length));
                length++;
            } else {
                length += 2;
            }
            if (length == stringLength - 1) {
                length++;
                newString.append(str.charAt(length - 1));
            }
        }
        return newString.toString();
    }
}
