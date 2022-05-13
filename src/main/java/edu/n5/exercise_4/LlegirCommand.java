package edu.n5.exercise_4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LlegirCommand {
	File file;

	public LlegirCommand(String path) {
		this.file = new File(path);
	}

	public void run() {

		if (file.exists() && file.isFile()) {
			
			try {
				print();
			} catch (IOException e) {		
				System.out.println("Error: " + e);
			}
		} else {
			System.out.println("Arxiu no trobat.");
		}
	}

	private void print() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		String line = bufferedReader.readLine();
		
		while(line != null)
		{
		  System.out.println(line);
		  line = bufferedReader.readLine();
		}
		
		bufferedReader.close();
	}
}
