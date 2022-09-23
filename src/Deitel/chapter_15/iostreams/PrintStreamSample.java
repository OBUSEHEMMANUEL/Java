package Deitel.chapter_15.iostreams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class PrintStreamSample {
    public static void main(String[] args) {

      String[] cars = {"Honda", "Toyota", "Peugeot"," volvo"};
        try(FileOutputStream fos = new FileOutputStream("Cars.txt");
                PrintStream printStream = new PrintStream(fos)) {
            System.setOut(printStream);
            for (String car:cars) {
                System.out.println(car);

            }
        }catch(IOException exception){
            exception.printStackTrace();
        }
    }
}
