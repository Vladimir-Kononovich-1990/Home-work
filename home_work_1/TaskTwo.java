package Home_work_1;

public class TaskTwo {

	public static void main(String[] args) {
	     int a;
	     a = 8;
	     int b = 2;
	     int r1;
	     int r2;
	     int r3;
	     int r4;
	     int r5;
	     int r6;
	     int r7;
	     boolean r8;
	     boolean r9;
	     r1 = 5 + 2 / a ; // r1 = 5 : ����� ����������� �������� "/"(2 / � = 0) ����� "+"(5 + 0 = 5);
	     System.out.println(r1);
	     
	     r2 = (5 + 2) / a; // r2 = 0 : ������ ����������� �������� � ������� ( 5 + 2 = 7), ����� (7 / � = 0);
	     System.out.println(r2);
	     
	     r3 = (5 + 2++) / a; // ��������� : ������  
	     r3 = (5 + b++) / a;  // r3 = 0: ��� ������ � ���� 2 �� ���������� b = 2 - ��������� ����������� 	
	     System.out.println(r3);
	     
	     r4 = (5 + 2++) / --a; // ��������� : ������
	     System.out.println(r4); 
	     
	     r5 = (5 * 2 >> 2++) / --a; // ��������� ������
	     
	     
	     r6 = (5 + 7 > 20 ? 68 : 22 * 2 >> a++) / --a; // r6 = 0;
	     System.out.println(r6);
	     
	     r7 = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> b++) / --a;// ��������� ������
	     
	     r8 = 6 - 2 > 3 && 12 * 12 <= 119; //r8 = false 
	     System.out.println(r8);
	     
	     r9 = true && false; // r9 = false
	     System.out.println(r9);

	}

}
