package Home_work_1;

public class Task4 {
	
	public static boolean sleepIn(boolean weekday, boolean vacation) {
		 if (vacation || !weekday) {
			    return true;
			  } else 
			  return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = true;  // ������� ����
		boolean b = false;   // ��������� ����
		boolean c = sleepIn(a,b);
			if (c)
				System.out.println("���� ������");
				
			else 
				System.out.println("���� �� ������");
				
		
			

	}

}
