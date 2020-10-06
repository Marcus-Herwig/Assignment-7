import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Assignment7 {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/input.dat"));
		ArrayList<String> books = new ArrayList<String>();
		while(input.hasNext())
		{
			books.add(input.nextLine());
		}
		input.close();
		
		for( int i = 0; i < books.size();i++)
		{
			int pos =books.indexOf("Romans:15:Paul summarizes how the gospel of Jesus works in a letter to the churches at Rome, where he plans to visit."); 
			System.out.println(books.get(i));
			if( pos != -1)
			{
				System.out.println(pos);
				//break;
			}
		}
		
		
	}

}
