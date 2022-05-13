package edu.n5.exercise_4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialitzarCommand {

	private String path;

	public SerialitzarCommand() {
		path = (System.getProperty("user.dir") + File.separator + "persona.ser");
	}

	public void run() {
		Person person = new Person();
		serialize(person);
	}

	private void serialize(Serializable person) {
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream exit = null;
		File file = new File(path);

		if (file.exists() && file.isFile()) {
			file.delete();
		}

		try {
			fileOutputStream = new FileOutputStream(path);
			exit = new ObjectOutputStream(fileOutputStream);
			exit.writeObject(person);

		} catch (IOException e) {
			System.out.println("Error: " + e);
		} finally {

			try {
				if (fileOutputStream != null) {
					fileOutputStream.close();
				}
				if (exit != null) {
					exit.close();
				}
			} catch (IOException e) {
				System.out.println("Error: " + e);
			}
		}
	}
}
