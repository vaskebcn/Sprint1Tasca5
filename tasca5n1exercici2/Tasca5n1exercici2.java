package tasca5n1exercici2;

import java.util.*;
import java.io.File;
import java.util.Arrays;

public class Tasca5n1exercici2 {

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
			System.out.println("D: " + path + " " + date);
			File[] files = path.listFiles();
			Arrays.sort(files);

			for (int i = 0; i < files.length; i++) {
				if (files[i].isFile()) {
					System.out.println("F: " + files[i] + " " + date);
				} else {
					sortingTree(files[i]);
				}
			}
		} else {
			System.out.println("F: " + path.getAbsolutePath() + " " + date);
		}

	}
}
