package Deitel.chapter_15.iostreams;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterSample {
    public static void main(String[] args) {
        try(var file = new FileWriter("C:\\Users\\user\\Desktop\\test.txt")){
            file.write("just do it");



        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
