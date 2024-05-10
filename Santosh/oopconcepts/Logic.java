package Santosh.oopconcepts;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Logic {
    public static void addNote(String note, String filename) {

        try {
            FileWriter writenote = new FileWriter("Notes.txt", true);
            FileWriter writeTnote = new FileWriter("TNotes.txt", true);
            FileWriter writeEnote = new FileWriter("ENotes.txt", true);
            if (filename.equals("note")) {
                writenote.append(DateUtil.aajaKoDin() + "," + note + "\n");
                writenote.close();
            } else if (filename.equals("temp")) {
                writeTnote.append(DateUtil.aajaKoDin() + "," + note + "\n");
                writeTnote.close();
            } else {
                writeEnote.append(DateUtil.aajaKoDin() + "," + note + "\n");
                writeEnote.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //get notes from the db
    public static void checkNotes() {

        //read each line
        try {
            Scanner s = new Scanner(new File("Notes.txt"));
            while (s.hasNext()) {
                //read each line
                String[] noteParts = s.nextLine().split(",");
                if ((Integer.parseInt(noteParts[0]) / 7) == (Integer.parseInt(DateUtil.aajaKoDin()) / 7)) {
                    addNote(noteParts[1], "temp");
                } else {
                    addNote(noteParts[1], "");
                }
            }

            //after all validation, delete old db with active and expired agendas
            //refactor temp file to be the new db

        } catch (IOException e) {
            System.out.println("error");
        }




    }

    public static void getNotes() {
        //get active notes
    }

    public static void getExpiredNotes() {
        //read each line
        //print notes

    }


    public static void createNote() {
        File myDb = new File("Notes.txt");
        File myTempDb = new File("TNotes.txt");
        File myExpiredDb = new File("ENotes.txt");

    }
}
// file xa ki nai check garne
// file xa vane aaja ko day liyera, each line lai check garne ani aaja ko din


