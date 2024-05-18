package Sanjay.JavaCodesChallenges.HacRan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextEditor {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        List<String> last = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < Q; i++) {
            String strInput = sc.nextLine();
            String[] arr = strInput.split(" ");
            if (arr[0].equals("1")) {
                str.append(arr[1]);
                last.add(strInput + " " + arr[1].length());
            } else if (arr[0].equals("2")) {
                String sub = str.substring(str.length() - Integer.parseInt(arr[1]), str.length());
                str.delete(str.length() - Integer.parseInt(arr[1]), str.length());
                last.add(strInput + " " + sub);
            } else if (arr[0].equals("3")) {
                System.out.println(str.charAt(Integer.parseInt(arr[1]) - 1));
            } else if (arr[0].equals("4")) {
                String[] prev = last.getLast().split(" ");
                if (prev[0].equals("1")) {
                    str.delete(str.length() - Integer.parseInt(prev[2]), str.length());
                } else if (prev[0].equals("2")) {
                    str.append(prev[2]);
                }
                last.removeLast();

            }
        }
    }
}
