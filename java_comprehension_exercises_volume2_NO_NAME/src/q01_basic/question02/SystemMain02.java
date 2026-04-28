package q01_basic.question02;

public class SystemMain02 {

	public static void main(String[] args) {
		//TODO ここから実装する
		Member memberMiura = new Member();
		memberMiura.setName("Miura Manabu");
		memberMiura.setAge(30);
		memberMiura.setRank(1);
		memberMiura.showMember();
		memberMiura.rankUp();
		System.out.println("newRank:" + memberMiura.getRank());
	}
}
