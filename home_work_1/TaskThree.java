package Home_work_1;

public class TaskThree {

	public static void main(String[] args) {
		int a;
		int b;
		a = -2;
		b = 3;
		double c;
		
		/* ����� Math ����������� ������� ���������� �������.
		 ���������� �������� ������������� �� ���:*/
		
		a = Math.abs (a); // ������ ����� �. ������� ��������� �� ���� ����������� �����
		System.out.println(a);
		
		c = Math.pow(a, b); // ���������� a ����� � ������� b
		System.out.println(c); 
		
		c= Math.sqrt(16);  // ���������� ����������� ����� �� �����
		System.out.println(c);
		
		c = Math.min(a,b); // ����������� �������� �� ����  �����
		System.out.println(c);
		
		int d = Math.max(a, b);// ����������� ��������� ���� �����
		System.out.println(d);
		
		double sin = Math.sin(0); // ����� ���� . ���������� ������������ ��� cos, tan, ctg � ��. ����-� ���-�
		System.out.println(sin);
		
		double x = Math.random(); // � ���������� � ������������ ������������ �������� �� ���������� [0,1]
		System.out.println(x);
		
		double y = Math.round(x); //���������� ��������� ����� ����� 
		System.out.println(y);
		
		
		
		
		

	}

}
