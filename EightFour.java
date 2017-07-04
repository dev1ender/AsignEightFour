import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EightFour {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//input and out stream created
		FileInputStream instream =null;
		FileOutputStream outstream =null;
		
		//input file location and the output file loaction is specified
		File infile = new File("C:\\Users\\anonm\\Desktop\\infile.txt");
		File outfile = new File("C:\\Users\\anonm\\Desktop\\outfile.txt");
		
		//file giving to streams
		instream = new FileInputStream(infile);
		outstream = new FileOutputStream(outfile);
		byte[] buffer = new byte[1024];
		int length;
		
		//writing the output file
		while ((length=instream.read(buffer)) > 0){
			outstream.write(buffer, 0, length);
		}
		
		//closing the streams 
		instream.close();
		outstream.close();
		
		System.out.println("successful");
	}

}
