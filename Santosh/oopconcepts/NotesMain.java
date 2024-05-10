package Santosh.oopconcepts;

import java.util.Scanner;

public class NotesMain {
    public static void main(String[] args) {
        //create a note file to store notes if it doesnt exist at first run
        Logic.createNote();
        //sorts active and expired notes
        Logic.checkNotes();
        //Prints active aganedas
        System.out.println("Current agendas");
        Logic.getNotes();
        //Prints expired agendas
        System.out.println("Expired agendas");
        Logic.getExpiredNotes();
        

        Scanner sc = new Scanner(System.in);
        System.out.println("type a TODO and press enter");
        String note = sc.nextLine();
        Logic.addNote(note, "note");


//        String aaja;
//        System.out.println(note);
//        LocalDate today = LocalDate.now();
//        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMdd");
//        aaja = today.format(format);
//        System.out.println(aaja);

    }
}
