import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

class FHVowelsConsonants {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character(not string): ");

        char c = scanner.next().toLowerCase().charAt(0);
        BufferedWriter bw;
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            bw = new BufferedWriter(new FileWriter("vowels.txt", true));
            bw.write(c);
            System.out.println("Vowel, written to vowels.txt!");
        }
        else {
            bw = new BufferedWriter(new FileWriter("consonants.txt", true));
            bw.write(c);
            System.out.println("Consonant, written to consonants.txt!");
        }
        bw.close();

        scanner.close();

    }
}