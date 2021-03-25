import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamEx {

	public static void main(String[] args) {
		try(DataInputStream dis=new DataInputStream(new FileInputStream("dane.dat"))){
			int c;
			while(true) {
				c=dis.readInt();
				System.out.println(c);
			}
		}
			catch(EOFException e) {
				System.out.println("koniec danych");
			}
		 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
