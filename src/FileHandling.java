import java.io.*;
import java.util.*;

class FileHandling {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Source?(abc1.txt) : ");
        String readMsg = scanner.nextLine();
        File inputFile = new File(readMsg);

        System.out.print("Destination?(xyz1.txt): ");
        String writeMsg = scanner.nextLine();
        File outputFile = new File(writeMsg);

        copyContent(inputFile, outputFile);
        scanner.close();
    }

    public static void copyContent(File ip, File op) throws Exception {
        FileInputStream in = new FileInputStream(ip);
        FileOutputStream out = new FileOutputStream(op);
        int buffer;
        while ((buffer = in.read()) != -1) {
            out.write(buffer);
        }
        System.out.println("File Copied");
        in.close();
        out.close();
    }

}
