package edu.n5.exercise_4;

public class Iu {

	public static void main(String[] args) {

		switch (args.length) {

		case 1:

			switch (args[0]) {

			case "list":
				System.out.println("list: Cal ruta.");
				break;

			case "savelist":
				System.out.println("savelist: Cal ruta.");
				break;

			case "llegir":
				System.out.println("llegir: Cal ruta.");
				break;

			case "serialitzar":
				SerialitzarCommand serialitzarCommand = new SerialitzarCommand();
				serialitzarCommand.run();
				break;

			case "deserialitzar":
				DeserializeCommand deserializeCommand = new DeserializeCommand();
				deserializeCommand.run();
				break;
			default:
				System.out.println("Comanda desconeguda.");
			}

			break;

		case 2:

			switch (args[0]) {

			case "list":
				ListCommand listCommand = new ListCommand(args[1]);
				listCommand.run();
				break;

			case "savelist":
				SaveListCommand saveListCommand = new SaveListCommand(args[1]);
				saveListCommand.run();
				break;

			case "llegir":
				LlegirCommand llegirCommand = new LlegirCommand(args[1]);
				llegirCommand.run();
				break;

			default:
				System.out.println("Comanda desconeguda.");
			}

			break;

		default:
			System.out.println("Comanda desconeguda.");
		}
	}
}
