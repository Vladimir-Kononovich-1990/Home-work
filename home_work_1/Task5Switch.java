package Home_work_1;

//import java.util.Objects;
import java.util.Scanner;

public class Task5Switch {

	public static void main(String[] args) {
		System.out.print(">>");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		//System.out.println(s);
		//String s1 = "����";
		//String s2 = "���������";
		
		switch (s) {
		case  "����":
		    System.out.println("������!");
		    System.out.println("� ���� ��� ����� ����");
		    break;
		    
		
		case "���������" :
			System.out.println("� ���� ��� ����� ����");	
		     break;
		
		default :
			System.out.println("������ ����, � �� ���?");
		}

	}

}
