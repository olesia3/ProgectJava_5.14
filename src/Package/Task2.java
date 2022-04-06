package Package;
import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {
		int i=0;
		String a;
		String b="";
		Scanner sc=new Scanner(System.in);
		while(i<5) {
			System.out.print("¬вед≥ть слово: ");
			if (sc.hasNext()) {
				a=sc.nextLine();
				b=a.substring(0,1);
				System.out.println("ѕерша л≥тера: "+b);
			}
			i++;
		}
	}
}
