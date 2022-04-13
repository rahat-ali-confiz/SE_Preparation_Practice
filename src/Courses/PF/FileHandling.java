package Courses.PF;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

    public static void main(String[] args) throws IOException {

        String str = "File Handling in Java using "+
                " FileWriter and FileReader";
        FileWriter fileOutput = new FileWriter("D:\\output.txt");
        Scanner in = new Scanner(System.in);
        for (int i=0;i<4;i++){
            fileOutput.write(in.nextLine());
        }
        System.out.println("File Writing Successfully");
        fileOutput.close();

        int ch;
        FileReader fileInput=null;
        try {
            fileInput = new FileReader("D:\\output.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found Exception");
        }

        while((ch=fileInput.read())!=-1){
            System.out.print((char) ch);
        }
        fileInput.close();
    }
}
