package Deitel.chapter_15;


import javax.print.DocFlavor;
import java.io.*;
import java.util.Arrays;

public class Streams {
    public static void main(String[] args) throws IOException {
     // dataInputStream();
      resourceNumber();
    }
    public static void dataInputStream(){
        DataInputStream dataInputStream = new DataInputStream(System.in);
        try {
            byte[] bytes = new byte[10];
           // int data =    dataInputStream.read();
            dataInputStream.readNBytes(bytes,0,8);
            System.out.println((Arrays.toString(bytes)));
            System.out.println("Actual String representation::");
            for(byte b : bytes){
                System.out.print((char) b);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void resource() throws  IOException{
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);
      String line =  bufferedReader.readLine();
        System.out.println(line);
        reader.close();
        bufferedReader.close();

    }
    public static void resourceNumber(){
        try (var bufferedReader = new BufferedReader(new InputStreamReader(System.in));){
            String line =  bufferedReader.readLine();
            int number = Integer.decode(line);
            System.out.println("my number is: "+number);
        }catch (IOException| NumberFormatException exception){
            System.out.println(exception.getMessage());
        }

    }

}
