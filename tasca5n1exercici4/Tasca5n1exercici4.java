package tasca5n1exercici4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Tasca5n1exercici4 {
	public static void main(String[] args) throws IOException {
		
//		File path = new File("/Users/promusic/eclipse-workspace/Sprint1/src/tasca5n1exercici1/java_io/");

		File path = new File(args[0]);

//		sorting(path);
		sortingTreeForReading(path);

	}
	
public static void sorting(File path) {
		
		File path1 = path;
		
		String[] fileNames = path1.list();
		Arrays.sort(fileNames);
		
		for (String fileName : fileNames) {
			System.out.println(fileName);
		}
		
	
	}
	
	public static void sortingTreeForReading(File path) throws IOException {

		if (path.isDirectory()) {
			File[] files = path.listFiles();
			Arrays.sort(files);

			for (int i = 0; i < files.length; i++) {
				if (files[i].isFile() && (files[i].getAbsolutePath()).contains(".txt")) {
					readTxt(files[i]);
				} else {
					sortingTreeForReading(files[i]);
				}
			}
		} else {
				if(path.isFile() && (path.getAbsolutePath()).contains(".txt")) {
					readTxt(path);
				}
		}

	}

	

	public static void readTxt(File str) throws IOException {
		
		File ovo = str;
		try {
			FileReader fr = new FileReader(ovo);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			while ((linea = br.readLine()) != null) {
				
				System.out.println(linea);
				}
			
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("problem reading the txt doc");
		}
		
	}

}
