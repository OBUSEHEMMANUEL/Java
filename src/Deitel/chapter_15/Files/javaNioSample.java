package Deitel.chapter_15.Files;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;

public class javaNioSample {
    public static void main(String[] args) throws IOException {
        // java.nio classes paths and files
        // and interfaces path and DirectoryStream

        Path path = Paths.get("C:\\Users\\user\\Desktop");
        System.out.println("is a directory -> "+ Files.isDirectory(path));
        System.out.println("is a directory -> "+ Files.isHidden(path));

        DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);

        for (Path path1: directoryStream) {
            System.out.println("Is directory ->" + Files.isDirectory(path1));
//            if (!Files.isDirectory(path1)) {
//                BufferedReader bufferedReader = new BufferedReader();
//                bufferedReader.w
//
    }
}}
