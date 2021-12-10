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
		boolean a = true;  // рабочий день
		boolean b = false;   // нерабочий день
		boolean c = sleepIn(a,b);
			if (c)
				System.out.println("спим дальше");
				
			else 
				System.out.println("пора на работу");
				
		
			

	}

}
