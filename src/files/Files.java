package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * canRead()	Boolean	Tests whether the file is readable or not
 * canWrite()	Boolean	Tests whether the file is writable or not
 * createNewFile()	Boolean	Creates an empty file
 * delete()	Boolean	Deletes a file
 * exists()	Boolean	Tests whether the file exists
 * getName()	String	Returns the name of the file
 * getAbsolutePath()	String	Returns the absolute pathname of the file
 * length()	Long	Returns the size of the file in bytes
 * list()	String[]	Returns an array of the files in the directory
 * mkdir()	Boolean	Creates a directory
 */
public class Files {
    /**
     * There are many available classes in the Java API that can be used to read and write files in Java:
     * FileReader, BufferedReader, Files, Scanner, FileInputStream, FileWriter, BufferedWriter, FileOutputStream, etc.
    * */
    public static void main(String[] args) {
        String pathname = "src/files/file.txt";
        createFile(pathname);
        writeToFile(pathname);
        readFile(pathname);
        getFileInfo(pathname);
        deleteFile(pathname);

        String folderMame = "src/files/Folder";
        createFolder(folderMame);
        deleteFile(folderMame);
    }

    static void createFolder(String pathname) {
        File file = new File(pathname);

        if (file.mkdir()) {
            System.out.println("Folder Created: " + file.getName());
        } else {
            System.out.println("Folder already exists.");
        }
    }
    static void deleteFile(String pathname) {
        File file = new File(pathname);

        if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
    static void getFileInfo(String pathname) {
        File file = new File(pathname);

        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Writeable: " + file.canWrite());
            System.out.println("Readable " + file.canRead());
            System.out.println("File size in bytes " + file.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }
    static void readFile(String pathname) {
        try {
            File file = new File(pathname);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error");
            e.printStackTrace();
        }
    }
    static void writeToFile(String pathname) {
        try {
            FileWriter writer = new FileWriter(pathname);
            writer.write("Primeiro texto escrito.");
            writer.close();
            System.out.println("Successfully write to the file.");
        } catch (IOException e) {
            System.out.println("An error");
            e.printStackTrace();
        }
    }
    static void createFile(String pathname) {
        try {
            File file = new File(pathname);

            if (file.createNewFile()) {
                System.out.println("File Created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error");
            e.printStackTrace();
        }
    }
}
