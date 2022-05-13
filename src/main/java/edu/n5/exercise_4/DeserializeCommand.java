package edu.n5.exercise_4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeCommand {

	private String path;

	public DeserializeCommand() {
		path = (System.getProperty("user.dir") + File.separator + "persona.ser");
	}

	public void run() {
		Person person = deserialize();

		if (person != null) {
			printPerson(person);
		}
	}

	private Person deserialize() {
		FileInputStream fileInputStream = null;
		ObjectInputStream input = null;
		File file = new File(path);
		Person person = null;

		if (!file.exists() || !file.isFile()) {
			file.delete();
		}
		try {

			fileInputStream = new FileInputStream(path);
			input = new ObjectInputStream(fileInputStream);
			person = (Person) input.readObject();

		} catch (Exception e) {
			System.out.println("Error: " + e);
		} finally {
			
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}
				if (input != null) {
					input.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}

		return person;
	}

	private void printPerson(Person person) {
		System.out.println("Nom: " + person.getName());
		System.out.println("Cognom: " + person.getLastName());
		System.out.println("DNI: " + person.getDni());

	}
}
