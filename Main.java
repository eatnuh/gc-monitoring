import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		ArrayList<String> buf = new ArrayList<>();
		for(int i  = 0; true; i++) {
			if(i > 0 && i % 100000 == 0) {
				System.out.println(green("Current Buf.size() = "  + buf.size()));
				Thread.sleep(1000);
			}
			buf.add(new String("abcddfdfgasdfhh"));
		}
	}

	private static String green(String s) {
		return "\u001B[32m" + s + "\u001B[0m";
	}

}
