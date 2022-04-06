package Package;
import java.util.Scanner;
public class Task4 {
	public static void main(String[] args) {
		int i=0;
		String a="";
		String b="";
		Scanner sc=new Scanner(System.in);
		System.out.print("¬вед≥ть перше ≥м'€: ");
		if(sc.hasNext()) {
			a=sc.nextLine();
			System.out.print("¬вед≥ть  друге ≥м'€: ");
		}
		if(sc.hasNext()) {
			b=sc.nextLine();
		}
		if (a.equalsIgnoreCase(b)) {
			System.out.println("≤дентичн≥ ≥мена");
		}else {System.out.println("≤мена р≥зн≥");}
		

	}
}
