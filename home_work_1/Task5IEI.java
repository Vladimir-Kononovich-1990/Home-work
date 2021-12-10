package Home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Task5IEI {

	public static void main(String[] args) {
		System.out.print(">>");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		//System.out.println(s);
		String s1 = "Вася";
		String s2 = "Анастасия";
		
		if (Objects.equals(s,s1)) {
			System.out.println("Привет!");
		    System.out.println("Я тебя так долго ждал");
		    } else   if (Objects.equals(s,s2)) {
			         System.out.println("Я тебя так долго ждал");	
		}            else     if (Objects.equals(s,s1)==false && Objects.equals(s,s2)==false)
			                  System.out.println("Добрый день, а вы кто?");
 
	}

}
