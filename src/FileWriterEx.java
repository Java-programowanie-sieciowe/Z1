import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	private static final char[] znaki= {'a','b','d','e','g','r'};
	public static void main(String[] args) {
		try(FileWriter fw=new FileWriter("znaki.dat")){
			for(int c: znaki)
				fw.write(c);
			System.out.println("Koniec");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
