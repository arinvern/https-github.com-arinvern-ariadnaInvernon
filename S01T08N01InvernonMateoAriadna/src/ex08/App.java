package ex08;

public class App {

	public static void main(String[] args) {

		InterficieFuncional reverse = (str) -> { 
			String result = "";
			for (int i = str.length() - 1; i >= 0; i--)
				result += str.charAt(i);
			return result;
		};
		System.out.println(reverse.reverse("String al revés"));

	}
}