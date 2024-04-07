package Santosh;

import java.util.Scanner;

public class prisonerDilemma {
    static int comp_wins = 0, user_wins = 0, rounds = 0;
    static boolean coop = true;
    static int[] score = new int[2];

    public static void main(String[] args) {
        System.out.println("Welcome to the Prison");
        System.out.println("Your goal is to get as many points as you can");
        System.out.println("Each round you can choose to cooperate or defect");
        System.out.println("if you both agree, you both get 3 points");
        System.out.println("if you both defect, you both get 1 points");
        System.out.println("if one defects and the other cooperates, the one that defects gets 5 points");


        while (rounds <= 20) {
            gameLogic();
            rounds++;
        }
        System.out.println("You won:" + score[0]);
        System.out.println("Comp won:" + score[1]);

    }

    public static void gameLogic() {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Cooperate ot Defect. c/d");
        String choice = myObj.nextLine();

        if (choice.equals("c") && coop) {
            scorecounter(3, 3);
        } else if (choice.equals("d") && coop) {
            coop = false;
            scorecounter(5, 0);
        } else if (choice.equals("c") && !coop) {
            coop = true;
            scorecounter(0, 5);
        } else {
            coop = false;
            scorecounter(1, 1);
        }

    }

    public static void scorecounter(int user_wins, int comp_wins) {
        score[0] += user_wins;
        score[1] += comp_wins;
    }


}



