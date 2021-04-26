package serializationpractice;

//import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeTest 
{
	public static void main(String[] args) 
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("E:\\java practice programs\\serialize");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Test t = new Test(1,"rama",25);
			oos.writeObject(t);
			System.out.println("done");
			
			oos.close();
			fos.close();
			
		}
		catch(Exception e)
		{e.getMessage();}
		
		
		
	}

}
