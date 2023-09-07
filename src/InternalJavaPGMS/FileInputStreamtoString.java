package InternalJavaPGMS;

import java.io.*;
import java.util.Scanner;

public class FileInputStreamtoString {
    public static void main(String args[]){

        byte [] byteArray = new byte[100];
        int count =0;
        try {
            File file = new File("C:\\Users\\Arun\\IdeaProjects\\SampleTest\\input.txt");
            System.out.println("file.getName()--"+file.getName());
            String filename = file.getName();
            System.out.println("filename.lastIndexOf('.')--"+filename.lastIndexOf('.'));
            int i = filename.lastIndexOf('.');
         String subString =   filename.substring(i+1, filename.length());
            System.out.println("subString--"+subString);

            Scanner scn = new Scanner(file);
            while (scn.hasNextLine()){
            scn.nextLine();
            count++;
            }



            InputStream input = new FileInputStream(file);
//            InputStream input = new FileInputStream("input.txt");
            input.available();

            int j = input.read();

            while (j!=-1)
            {
                System.out.println((char)j);
                j = input.read();
            }

//            input.read(byteArray);

            System.out.println("input.read(byteArray)--"+input.read(byteArray));
            String data = new String(byteArray);
            System.out.println("data string"+data);
            input.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
