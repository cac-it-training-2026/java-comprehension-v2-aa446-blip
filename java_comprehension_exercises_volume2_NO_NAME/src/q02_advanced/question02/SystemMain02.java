package q02_advanced.question02;

public class SystemMain02 {

	public static void main(String[] args) {

		//TODO ここから実装する
		ConsoleReader cr1 = new ConsoleReader();
		Member.getInstance(1, "Passw0rd", "Miura Manabu", 28, 2);
		Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1);

		MemerManager.showAllMembers();
		System.out.println();
	}

}
