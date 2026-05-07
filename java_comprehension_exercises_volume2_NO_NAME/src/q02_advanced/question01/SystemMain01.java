package q02_advanced.question01;

public class SystemMain01 {

	public static void main(String[] args) {

		System.out.println("===会員情報を表示します===");
		//TODO ここから実装する
		Member membermiura = new Member(1, "Passw0rd", "Miura Manabu", 28, 2);
		Member membersato = new Member(2, "aaaAAA", "Sato Keisuke", 43, 1);

		membermiura.showMember();
		membersato.showMember();
	}

}
