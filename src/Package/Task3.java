package Package;
import java.util.Scanner;
public class Task3 {
	public static void main(String[] args) {
		double a=0;
		double b=0;
		double c=0;
		Scanner sc=new Scanner(System.in);
		 System.out.print("Введіть перше дробове число: ");
		    if (sc.hasNextDouble()) {
		      a=sc.nextDouble();
		      System.out.print("Введіть друге дробове число: ");
		    }else {System.out.println("Ви ввели не дробове число");}
		    if (sc.hasNextDouble()) {
		      b=sc.nextDouble();
		      System.out.print("Введіть третє дробове число: ");
		    }else {System.out.println("Ви ввели не дробове число");}
		    if (sc.hasNextDouble()) {
		      c=sc.nextDouble();
		    }else {System.out.println("Ви ввели не дробове число");}
		 if(a>b&&a>c) {System.out.println("Найбільше дробове число: "+a);}  
		 if(b>a&&b>c) {System.out.println("Найбільше  дробове число: "+b);
		 }else {System.out.println("Найбільше дробове число: "+c);}  
	}
}
