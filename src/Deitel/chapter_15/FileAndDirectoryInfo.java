package Deitel.chapter_15;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileAndDirectoryInfo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter directory? ");
        Path path = Paths.get(sc.nextLine());
        if(Files.exists(path)){
            System.out.printf("%n%s exists%n",path.getFileName() );
             System.out.printf("%s a directory%n",Files.isDirectory(path)
                   ? "Is" : "Is not");
             System.out.printf("%s an absolute path%n",path.isAbsolute()
                    ? "Is" : "Is not");
           System.out.printf("Last modified: %s%n",Files.getLastModifiedTime(path));
             System.out.printf("Size: %s%n",Files.size(path));
        }

        if (Files.exists(path) ) { // output directory listing
             System.out.printf("%nDirectory contents:%n");

            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
            for (Path p : directoryStream){
                System.out.println(p);
                 }

        }
 else { // not file or directory, output error message
         System.out.printf("%s does not exist%n", path);
        }
} // end main
} // end class FileAndDirectoryInfo




