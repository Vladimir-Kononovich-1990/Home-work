package Home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Task5IEI {

	public static void main(String[] args) {
		System.out.print(">>");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		//System.out.println(s);
		String s1 = "����";
		String s2 = "���������";
		
		if (Objects.equals(s,s1)) {
			System.out.println("������!");
		    System.out.println("� ���� ��� ����� ����");
		    } else   if (Objects.equals(s,s2)) {
			         System.out.println("� ���� ��� ����� ����");	
		}            else     if (Objects.equals(s,s1)==false && Objects.equals(s,s2)==false)
			                  System.out.println("������ ����, � �� ���?");
 
	}

}
