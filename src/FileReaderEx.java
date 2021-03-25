import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("ludzie.dat");
			try {
				int c;
				while((c=fr.read())>-1)
					System.out.print((char)c);
			}finally {
			fr.close();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
