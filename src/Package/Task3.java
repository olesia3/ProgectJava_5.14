package Package;
import java.util.Scanner;
public class Task3 {
	public static void main(String[] args) {
		double a=0;
		double b=0;
		double c=0;
		Scanner sc=new Scanner(System.in);
		 System.out.print("������ ����� ������� �����: ");
		    if (sc.hasNextDouble()) {
		      a=sc.nextDouble();
		      System.out.print("������ ����� ������� �����: ");
		    }else {System.out.println("�� ����� �� ������� �����");}
		    if (sc.hasNextDouble()) {
		      b=sc.nextDouble();
		      System.out.print("������ ���� ������� �����: ");
		    }else {System.out.println("�� ����� �� ������� �����");}
		    if (sc.hasNextDouble()) {
		      c=sc.nextDouble();
		    }else {System.out.println("�� ����� �� ������� �����");}
		 if(a>b&&a>c) {System.out.println("�������� ������� �����: "+a);}  
		 if(b>a&&b>c) {System.out.println("��������  ������� �����: "+b);
		 }else {System.out.println("�������� ������� �����: "+c);}  
	}
}
