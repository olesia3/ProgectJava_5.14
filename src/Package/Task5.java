package Package;
import java.util.Scanner;
public class Task5 {
	public static void main(String[] args) {
		String a="";
		String b="";
		Scanner sc=new Scanner(System.in);
		System.out.print("������ ������ �����: ");
		if (sc.hasNext()) {
			a=sc.nextLine();
			System.out.print("������ ������ �����: ");
		}
		if (sc.hasNext()) {
			b=sc.nextLine();
			}
		if(a.length()>b.length()) {System.out.print("�������� ������� ������� � ����� �");
		}else {System.out.print("�������� ������� ������� � ����� b");}
		
	}
}
