package com.Asignment.diary;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Diary {
    private Database database;
    private Scanner input = new Scanner(System.in);

    public Diary(Database database){
        database = new Database();
    }
    public static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("M/d/y HH:mm");
    public  static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("M/d/Y");

    private LocalDateTime readDateTime(){
        System.out.println("Enter date and time as mm/dd/yyyy hh:mm");
        LocalDateTime dateTime;
        try {
            dateTime = LocalDateTime.parse(input.nextLine(), dateTimeFormatter);
        }catch (DateTimeParseException e){
            System.out.println("Error please input correct format");
            return readDateTime();
        }
        return dateTime;
    }
//    private LocalDate readDate(){
//
//    }
}
