package Home_work_1;

//import java.util.Objects;
import java.util.Scanner;

public class Task5Switch {

	public static void main(String[] args) {
		System.out.print(">>");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		//System.out.println(s);
		//String s1 = "Вася";
		//String s2 = "Анастасия";
		
		switch (s) {
		case  "Вася":
		    System.out.println("Привет!");
		    System.out.println("Я тебя так долго ждал");
		    break;
		    
		
		case "Анастасия" :
			System.out.println("Я тебя так долго ждал");	
		     break;
		
		default :
			System.out.println("Добрый день, а вы кто?");
		}

	}

}
