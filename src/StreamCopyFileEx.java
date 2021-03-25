import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamCopyFileEx {

	public static void main(String[] args) {
		try(FileInputStream fis=new FileInputStream("Expressive power of SQL.pdf");
				FileOutputStream fos=new FileOutputStream("kopia.pdf")){
			int c;
			while((c=fis.read())>-1) {
				fos.write(c);
			}
			System.out.println("koniec");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
