package Chapter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SM111_file {
    public static void main(String[] args) {
        // code to create a new file
        /*
        File myfile = new File("SM1.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            throw new RuntimeException(e);
        }


        // COde to write to a file
        try {
            FileWriter fileWriter = new FileWriter("SM1.txt");
            fileWriter.write("This is a first file from java course\nokay now bye");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Reading a file
        File myfile = new File("SM1.txt");
        try {
            Scanner sc = new Scanner(myfile);
            while(sc.hasNextLine()){
                String line  = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
     */
        // Deleting a file
        File myfile = new File("SM1.txt");
        if (myfile.delete()){
            System.out.println("I have deleted: "+ myfile.getName());
        }
        else {
            System.out.println("Some error occured while deleting file");
        }

    }
}
