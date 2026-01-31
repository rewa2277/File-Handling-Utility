import java.io.*;


public class FileOperationsDemo {

    public static void main(String[] args) {

        String fileName = "sample.txt";

        // 1. Write to a file
        writeFile(fileName);

        // 2. Read from the file
        readFile(fileName);

        // 3. Modify (append) the file
        modifyFile(fileName);

        // 4. Read again after modification
        readFile(fileName);
    }

    // Method to write data into a file
    public static void writeFile(String fileName) {
        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("This is the first line in the file.");
            bw.newLine();
            bw.write("Java File Handling Example.");

            bw.close();
            System.out.println("File written successfully.\n");

        } catch (IOException e) {
            System.out.println("Error while writing file.");
            e.printStackTrace();
        }
    }

    // Method to read data from a file
    public static void readFile(String fileName) {
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("Reading file content:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            System.out.println();

        } catch (IOException e) {
            System.out.println("Error while reading file.");
            e.printStackTrace();
        }
    }

    // Method to modify (append) data to the file
    public static void modifyFile(String fileName) {
        try {
            FileWriter fw = new FileWriter(fileName, true); // true enables append mode
            BufferedWriter bw = new BufferedWriter(fw);

            bw.newLine();
            bw.write("This line is added later (file modified).");

            bw.close();
            System.out.println("File modified successfully.\n");

        } catch (IOException e) {
            System.out.println("Error while modifying file.");
            e.printStackTrace();
        }
    }
}
