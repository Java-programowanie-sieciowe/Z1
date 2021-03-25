import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileInputStreamEx {

	public static void main(String[] args) {
		try(FileInputStream fis=new FileInputStream("ludzie.dat");
				Scanner sc=new Scanner(fis)){
			while(sc.hasNextLine())
				System.out.println(sc.nextLine());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
