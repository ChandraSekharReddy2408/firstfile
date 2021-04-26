package serializationpractice;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerialize 
{

	public static void main(String[] args)throws Exception 
	{
		FileInputStream fis = new FileInputStream("E:\\java practice programs\\serialize");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		
		System.out.println(ois.readObject());

	}

}
