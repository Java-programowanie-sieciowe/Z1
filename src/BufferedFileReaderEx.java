import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedFileReaderEx {

	public static void main(String[] args) {
		try(FileReader fr=new FileReader("ludzie.dat");
				BufferedReader br=new BufferedReader(fr)){
			String s;
			while((s=br.readLine())!=null)
				System.out.println(s);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
