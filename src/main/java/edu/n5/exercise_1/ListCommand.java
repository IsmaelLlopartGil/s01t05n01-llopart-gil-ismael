package edu.n5.exercise_1;

import java.io.*;

public class ListCommand {

	File file;
	File[] fileList;

	public ListCommand(String file) {
		this.file = new File(file);
	}

	public void run() {

		if (file.exists() && file.isDirectory()) {
			fillFileList();
			showList();
		} else {
			System.out.println("Directori no trobat.");
		}
	}

	private void fillFileList() {

		fileList = file.listFiles();

	}

	private void showList() {

		for (File file : fileList) {
			System.out.println(String.format("%-22s", file.getName()));
		}

	}
}
