import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		ArrayList<Czlowiek> ludzie=new ArrayList<>();
		ludzie.add(new Czlowiek("Jan", "Kowalski"));
		ludzie.add(new Czlowiek("Zbiegniew", "Nowak"));
		try(FileOutputStream fos=new FileOutputStream("ludzie1.dat");
			PrintWriter pw=new PrintWriter(fos,true)){
			for(Czlowiek c: ludzie)
				pw.println(c);
			
			System.out.println("Koniec");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
