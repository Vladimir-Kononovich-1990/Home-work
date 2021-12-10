package Home_work_1;

public class TaskOne {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a;
         int b;
       
         
         a = 42;
         b = 15;
       
         
         System.out.println(a + " " + ~ a) ; // 00101010  11010101
         System.out.println(b + " " + ~ b) ; // 00001111  11110000 
         System.out.println(a & b) ;         // 00101010 & 00001111 = 00001010
        // System.out.println(a &= b) ;        // 00101010 &= 00001111 = 00001010 изменяется значение a
        // System.out.println( a | b) ;      // 00101010 | 00001111 = 00101111
         //System.out.println(a |= b) ;      // 00101010 |= 00001111 = 00101111 изменяется значение a
         //System.out.println(a ^ b) ;       // 00101010 ^ 00001111 = 00100101
        // System.out.println(a ^= b) ;      // 00101010 ^= 00001111 = 00100101 
         //System.out.println(a>>2) ;        // 00101010 >> 00000010 = 00001010 
         //System.out.println(b>>2) ;        // 00001111 >> 00000010 = 00000011
         //System.out.println(a>>=2) ;       // 00101010 >>= 00000010 = 00001010 изменяется значение a
         //System.out.println(b>>=2) ;       // 00001111 >>= 00000010 = 00000011 изменяется значение b
         //System.out.println(a >>> 2) ;     // 00101010 >>> 00000010 = 00001010
         //System.out.println(b >>> 2) ;     // 00001111 >>> 00000010 = 00000011
         //System.out.println(a<<2) ;        // 00101010 << 00000010 = 10101000 
         //System.out.println(b<<2) ;        // 00001111 << 00000010 = 00111100
         //System.out.println(a<<=2) ;       // 00101010 <<= 00000010 = 10101000 изменяется значение a
         //System.out.println(b<<=0) ;       // 00001111 <<= 00000000 = 00001111 изменяется значение b
         //System.out.println(a >>>= 2) ;    // 00101010 >>>= 00000010 = 00001010 изменяется значение a
         //System.out.println(b >>>= 2) ;    // 00001111 >>>= 00000010 = 00000011 изменяется значение b
         
         System.out.println(a + " " + b); // для проверки значений a , b ;     
	}

}
