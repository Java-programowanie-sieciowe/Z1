import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamCopyFile {

	public static void main(String[] args) {
		try(FileInputStream fis=new FileInputStream("Expressive power of SQL.pdf");
				FileOutputStream fos=new FileOutputStream("kopia1.pdf")){
			int c;
			int buffsize= 1000;
			byte[] bufor=new byte[buffsize];
			while((c=fis.read(bufor,0,buffsize))>-1) {
				fos.write(bufor, 0, c);
			}
			System.out.println("KOniec");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
