/* File Not Found Exception Handling
Write a program to read a filename from the user and display its 
content. The program should handle the situation where the file 
does not exist.
Key Points:
• Use Scanner to read the filename from the user.
• Use FileReader to read the file content.
• Implement a try-catch block to handle FileNotFoundException.
• Display a message informing the user if the file is not found.
 */

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileNotFoundExceptionDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        try {
            FileReader fr = new FileReader(fileName);
            int ch;

            System.out.println("File contents:");
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please check the file name.");

        } catch (IOException e) {
            System.out.println("Error: Unable to read the file.");

        } finally {
            sc.close();
        }
    }
}
