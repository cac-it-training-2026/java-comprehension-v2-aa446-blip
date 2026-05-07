package q02_advanced.question02;

public class ConsoleReader {
	public String inputString() {
		String str = reader.readLine();
		return str;
	}

	public int inputNumber() {
		String sr = reader.readLine();
		int num = Integer.parseInt(sr);
		return num;
	}
}
