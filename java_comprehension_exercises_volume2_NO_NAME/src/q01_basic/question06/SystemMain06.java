package q01_basic.question06;

import java.io.IOException;

public class SystemMain06 {

	public static void main(String[] args) {

		ConsoleReader cr = new ConsoleReader();
		int inputId = 0;
		String inputPassword = null;
		String name = "Miura Manabu";
		int age = 28;
		int rank = 2;
		try {
			System.out.println("---CREATE MEMBER DATA---");
			//TODO ここから実装する

			System.out.print("input id>>");
			inputId = cr.inputNumber();
			System.out.print("input password>>");
			inputPassword = cr.inputString();

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("error");
			e.printStackTrace();
			return;
		}

		Member m = new Member(inputId, inputPassword, name, age, rank);
		m.showMember();

	}
}
