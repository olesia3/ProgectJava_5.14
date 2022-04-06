package Package;
import java.util.Scanner;
public class Task5 {
	public static void main(String[] args) {
		String a="";
		String b="";
		Scanner sc=new Scanner(System.in);
		System.out.print("Введіть перший рядок: ");
		if (sc.hasNext()) {
			a=sc.nextLine();
			System.out.print("Введіть другий рядок: ");
		}
		if (sc.hasNext()) {
			b=sc.nextLine();
			}
		if(a.length()>b.length()) {System.out.print("Найбільша кількість символів у рядку а");
		}else {System.out.print("Найбільша кількість символів у рядку b");}
		
	}
}
