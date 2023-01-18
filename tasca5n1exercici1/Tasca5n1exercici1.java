package tasca5n1exercici1;

import java.io.File;
import java.util.Arrays;

public class Tasca5n1exercici1 {

	public static void main(String[] args) {
		
//		File path = new File("/Users/promusic/eclipse-workspace/Sprint1/src/tasca5n1exercici1/java_io/");

		File path = new File(args[0]);
		
		sorting(path);
		
	}
	
	public static void sorting(File path) {
		
		File path1 = path;
		
		String[] fileNames = path1.list();
		Arrays.sort(fileNames);
		
		for (String fileName : fileNames) {
			System.out.println(fileName);
		}
		
	
	}

}
