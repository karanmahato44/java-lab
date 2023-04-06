import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

class FHReplaceChar {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("abc2.txt"));
		String word = br.readLine();
		String replacedWord = word.replace('a', 'b');
		BufferedWriter bw = new BufferedWriter(new FileWriter("xyz2.txt", false));
		bw.write(replacedWord);
		System.out.println("Replaced 'a' with 'b' and wrote to xyz2.txt");
		bw.close();
		br.close();
	}
}
