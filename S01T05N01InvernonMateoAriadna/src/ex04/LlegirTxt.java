package ex04;

import java.io.File;
import java.util.Scanner;
public class LlegirTxt
{
    public static void llegirTxt(String directori) throws Exception
    {
		File doc = new File(directori);
		try (Scanner obj = new Scanner(doc)) {
			while (obj.hasNextLine())
				System.out.println(obj.nextLine());
		}
	}
}
