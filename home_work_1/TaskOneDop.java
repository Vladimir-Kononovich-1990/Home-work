package Home_work_1;

public class TaskOneDop {

	public static void main(String[] args) {
		int a;
		int b;
        
		a = -42;//11010110
		b = -15;//11110001
		
		       System.out.println(a + " " + ~ a) ; // 11010110  00101001
	           System.out.println(b + " " + ~ b) ; // 11110001  00001110
	           System.out.println(a & b) ;         // 11010110 & 11110001 = 11010000
	        // System.out.println(a &= b) ;        //11010110 &= 11110001 = 11010000 ���������� �������� a
	        // System.out.println( a | b) ;        // 11010110| 11110001 = 11110111
	        // System.out.println(a |= b) ;        // 11010110 |= 11110001 = 11110111 ���������� �������� a
	        // System.out.println(a ^ b) ;         // 11010110 ^ 11110001 = 11100111
	        // System.out.println(a ^= b) ;        // 11010110 ^= 11110001 = 11100111  ���������� �������� a
	        // System.out.println(a>>2) ;          // 11010110 >> 00000010 = 11110101 
	        // System.out.println(b>>2) ;          // 11110001 >> 00000010 = 11111100
	        // System.out.println(a>>=2) ;         // 11010110 >>= 00000010 = 11110101 ���������� �������� a
	        // System.out.println(b>>=2) ;         //  11110001>>= 00000010 = 11111100 ���������� �������� b
	        // System.out.println(a >>> 2) ;       // 11010110 >>> 00000010 = 11110101
	        // System.out.println(b >>> 2) ;       // 11110001 >>> 00000010 = 11111100
	        // System.out.println(a<<2) ;          // 11010110 << 00000010 = 01011000 
	        // System.out.println(b<<2) ;          // 11110001 << 00000010 = 11000100
	        // System.out.println(a<<=2) ;         // 11010110 <<= 00000010 = 01011000 ���������� �������� a
	        // System.out.println(b<<=0) ;         //  11110001<<= 00000000 = 11000100  ���������� �������� b
	        // System.out.println(a >>>= 2) ;      // 11010110 >>>= 00000010 = 11110101  ���������� �������� a
	        // System.out.println(b >>>= 2) ;      //  11110001>>>= 00000010 = 11111100  ���������� �������� b
	         
	         System.out.println(a + " " + b); // ��� �������� �������� a , b ; 
	}

}
