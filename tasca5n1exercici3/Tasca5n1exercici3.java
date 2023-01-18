package tasca5n1exercici3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class Tasca5n1exercici3 {
	public static void main(String[] args) {

//		File path = new File("/Users/promusic/eclipse-workspace/Sprint1/src/tasca5n1exercici1/java_io/");

		File path = new File(args[0]);

//		sorting(path);
		sortingTree(path);

	}
	
public static void sorting(File path) {
		
		File path1 = path;
		
		String[] fileNames = path1.list();
		Arrays.sort(fileNames);
		
		for (String fileName : fileNames) {
			System.out.println(fileName);
		}
		
	
	}

	public static void sortingTree(File path) {

		long lastModified = path.lastModified();
		Date date = new Date(lastModified);

		if (path.isDirectory()) {
			write("D: " + path + " " + date);
			File[] files = path.listFiles();
			Arrays.sort(files);

			for (int i = 0; i < files.length; i++) {
				if (files[i].isFile()) {
					write("F: " + files[i] + " " + date);
				} else {
					sortingTree(files[i]);
				}
			}
		} else {
			write("F: " + path.getAbsolutePath() + " " + date);
		}

	}

	public static void write(String str) {

		try {
			File ono = new File("/Users/promusic/Desktop/test.txt");
			FileWriter fw = new FileWriter(ono, true);
			BufferedWriter wrt = new BufferedWriter(fw);
			wrt.newLine();
			wrt.write(str);

//			System.out.println("line added");

			wrt.close();

		} catch (IOException e) {
			System.out.println("an error ocurred");
		}

	}
}
