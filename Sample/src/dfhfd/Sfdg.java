package dfhfd;

import java.io.FileWriter;
import java.io.IOException;
public class Sfdg {
	public static void main(String[]args) {
		try {
			FileWriter writing = new FileWriter("H:/file/simple.txt");
			writing.write("this is a simple program gdfhhghghgfhghgfhghfdhfghfhfdgfdgfdhfdhfhfdhfdhfhhfghfghgfjfgjhffghgfjfg");
			writing.close();
			System.out.println("finish writing");
			
		}catch(IOException e) {
			System.out.println("an error occured");
			e.printStackTrace();

		
		}
}
}