import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
   Used to test the BlankLinesRemover class.
*/
public class InputOutputFiles
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner consoleIn = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the file path for the input file (Ex: C://Downloads/lines.txt): ");
			String path = consoleIn.next();
			try {
				File inputFile = new File(path);
				PrintWriter outputFile = new PrintWriter("outlines.txt");
				
				Scanner in = new Scanner(inputFile);
				while (in.hasNext())
				{
					String line = in.next();
					outputFile.println(line);
				}
				in.close();
				outputFile.close();
				//System.out.println("File is valid");
				break;
			} catch (FileNotFoundException e) {
				System.out.println("File was not found, please try again.");
			}
		}
		consoleIn.close();
	}
}