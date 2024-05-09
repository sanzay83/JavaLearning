package Santosh;

import java.util.Scanner;
public class NextDate {


    public static String readDateStr() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a date in mm/dd/yyyy format: ");
        String dateStr = input.nextLine();
        return dateStr;
    }
    public static Date parseDate(String dateString) {

        String[] parts = dateString.split("/");
        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);
        return new Date(day, month, year);
    }

    public static Date readDate() {
        Date dateRcd = null;
        while (dateRcd == null) {
            String dateStr = readDateStr(); // read date as string
            dateRcd = parseDate(dateStr); //convert the date string to date record
            // Validate the date
//            if (!isValidDate(dateRcd)) {
//                System.out.println("Invalid date. Please enter a valid date.");
//                dateRcd = null; // Reset date record to null for re-prompting
//            } else {
//                System.out.println("Date is valid.");
//            }
        }
        return dateRcd;
    }
    public static void printDate(Date date) {
        System.out.printf("%02d/%02d/%d%n", date.month, date.day, date.year);
    }
    public static boolean leap(int year) {
        if ((year % 4 != 0) || ((year % 100 == 0) && (year % 400 != 0))) {
            return false; // Not a leap year
        } else if (year % 400 == 0) {
            return true; // Leap year divisible by 400
        } else {
            return true; // Leap year divisible by 4 and not a century year
        }
    }
    public static int daysInMonth(int month, int year) {
        switch (month) {
            // Months with 31 days
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            // Months with 30 days
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            // February (handling leap years)
            case 2:
                if (leap(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1;
        }
    }
    public static Date nextDate(Date date) {
        int day = date.day;
        int month = date.month;
        int year = date.year;
        if (day < daysInMonth(month, year)) {
            return new Date(++day, month, year);
        } else {
            day = 1;
            if (month < 12) {
                return new Date(day, month + 1, year);
            } else {
                day = 1;
                month = 1;
                year++;
                return new Date(day, month, year);
            }
        }
    }
    public static void main(String[] args) {
        Date givenDate = readDate();
        System.out.print("Given Date is: ");
        printDate(givenDate);
        Date next = nextDate(givenDate);
        System.out.print("Next Date is: ");
        printDate(next);
    }
    public record Date(int day, int month, int year) {
    }
}