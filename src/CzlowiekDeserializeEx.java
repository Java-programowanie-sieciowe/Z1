import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CzlowiekDeserializeEx {

	public static void main(String[] args) {
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("czlowiek.ser"))){
			Czlowiek c=(Czlowiek)ois.readObject();
			System.out.println(c);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
