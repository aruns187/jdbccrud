package dfhfd;
import java.io.File;
import java.io.IOException;


public class Ggh {
	public static void main(String[]args) {
		try {
			File obj = new File("H:/file/simple.txt");
			if(obj.createNewFile()) {
				System.out.println("file is creted"+obj.getName());
			}else {
				System.out.println("file exists");
			}
		}catch(IOException e) {
			System.out.println("an error occured");
			e.printStackTrace();
		}
	}

}


