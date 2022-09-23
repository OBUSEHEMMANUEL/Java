package Deitel.chapter_15.iostreams;

import java.io.*;

public class FileOutputStreamSample {

    public static void main(String[] args) {
        //Writer
       fileOutput();

    }
    public static void fileOutput(){
        try(var fos = new FileOutputStream("test.txt");
            var writer = new PrintWriter(fos)) {
            writer.println("We are Africans!!!!!!");

        }catch (IOException exception){
            System.out.println(exception.getLocalizedMessage());

        }
    }

    }

