import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CzlowiekSerializeEx {

	public static void main(String[] args) {
		Czlowiek c=new Czlowiek("Jan", "Kowalski");
		try(FileOutputStream fos=new FileOutputStream("czlowiek.ser");
				ObjectOutputStream oos=new ObjectOutputStream(fos)){
			
			oos.writeObject(c);
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
