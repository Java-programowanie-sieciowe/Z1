import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx {

	public static void main(String[] args) {
		try(DataOutputStream dos=new DataOutputStream(new FileOutputStream("dane.dat"))){
			for(int i=0;i<200;i++)
				dos.writeInt(i);
			
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
