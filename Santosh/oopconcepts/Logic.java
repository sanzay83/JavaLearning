package Santosh.oopconcepts;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logic {
    public static void addNote(String note) {
        try {
            FileWriter writenote = new FileWriter("Notes.txt", true);
            writenote.append(DateUtil.aajaKoDin() + "," + note + "\n");
            writenote.close();

        } catch (IOException e) {
            System.out.println("error");
        }
    }

    public static void addExpiredNote(String note) {
        try {
            FileWriter writenote = new FileWriter("ExpiredNotes.txt", true);
            writenote.append(DateUtil.aajaKoDin() + "," + note + "\n");
            writenote.close();

        } catch (IOException e) {
            System.out.println("error");
        }
    }

    //get notes from the db
    public static void checkNotes() {
        //read each line
        //check with DateUtil if agenda is expired or not
        // if(DateUtil.aaja/7 > getDateFromNote/7){
        // add to expired}
        //else{
        // write to new temp file}
        //Store expired in an "expired" db
        //

        //after all validation, delete old db with active and expired agendas
        //refactor temp file to be the new db

    }

    public static void getNotes() {
        //get active notes
    }

    public static void getExpiredNotes() {
        //read each line
        //check with DateUtil if note is expired or not
        //OPTIONAL: Store expired in an "expired" db
        // print not expired notes

    }


    // file ma note lekhne kaam esle garxa
    public static void createNote() {
        try {
            File myObj = new File("notes.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (
                IOException e) {
            System.out.println("error");
        }
    }
}
// file xa ki nai check garne
// file xa vane aaja ko day liyera, each line lai check garne ani aaja ko din


