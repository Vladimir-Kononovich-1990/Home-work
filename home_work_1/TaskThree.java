package Home_work_1;

public class TaskThree {

	public static void main(String[] args) {
		int a;
		int b;
		a = -2;
		b = 3;
		double c;
		
		/* Класс Math насчитывает большое количество функций.
		 Рассмотрим наиболее встречающиеся из них:*/
		
		a = Math.abs (a); // модуль числа а. Функция применима ко всем примитивным типам
		System.out.println(a);
		
		c = Math.pow(a, b); // возведение a числа в степень b
		System.out.println(c); 
		
		c= Math.sqrt(16);  // извлечение квадратного корня из числа
		System.out.println(c);
		
		c = Math.min(a,b); // определение минимума из двух  чисел
		System.out.println(c);
		
		int d = Math.max(a, b);// определение максимума двух чисел
		System.out.println(d);
		
		double sin = Math.sin(0); // синус угла . Аналогично записывается для cos, tan, ctg и пр. триг-е фун-и
		System.out.println(sin);
		
		double x = Math.random(); // в переменную х записывается произвольное значение из промежутка [0,1]
		System.out.println(x);
		
		double y = Math.round(x); //возвращает ближайшее целое число 
		System.out.println(y);
		
		
		
		
		

	}

}
