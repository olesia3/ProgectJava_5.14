package Package;
import java.util.Scanner;
public class Task1 {
	public static void main(String[] args) {
		String z = "";
		String d;
		int i=0;
		Scanner sc = new Scanner(System.in);		
		while(i<5) {
			System.out.print("¬вед≥ть слово: ");
		if (sc.hasNext()) {
			d=sc.nextLine();
			z=z.concat(d);
		}
		i++;
		}
		System.out.println("–еченн€: "+z);
	
	
	

	}
}
