package CTF01.Java.part1.No2_2;

public class BasicSyntax2
{
	
	public static void bark() {
		String dogName = "Jame";
		System.out.println("The Dog name = " + dogName + " bark");
	}

	public static void main(String[] args)
	{
//		1.ปรกาศ method ชื่อว่า bark ขึ้นมา แล้วเอา method main ไปเรียก method bark โดย 
//		method bark ให้มี local variable ชื่อ dogName ที่กำหนดชื่อหมาเป็นอะไรก็ได้ แล้วก็ให้
//		print ว่า "The Dog name = xxx bark"
		
		bark();
		
//		2.ให้ลองเปลี่ยนค่า primitive แล้ว print ออกมา โดยให้เปลี่ยนจาก
		
//			a. float -> int
		float myFloat = 1.67f;
		int myInt = (int) myFloat;
		System.out.println("myFloat value: " + myFloat);
		System.out.println("myInt value: " + myInt);
		
//			b. int -> float
		int my1Int= 15;
		float my1Float = my1Int;
		System.out.println("my1Int value: " + my1Int);
		System.out.println("my1Float value: " + my1Float);
		
//			c. double -> float
		double myDouble = 5.72;
		float my2Float = (float) myDouble;
		System.out.println("myDouble value: " + myDouble);
		System.out.println("my2Float value: " + my2Float);
		
//			d. char -> int
		char myChar = 'a';
		int my2Int = (int) myChar;
		System.out.println("myChar value: " + myChar);
		System.out.println("my2Int value: " +  my2Int);
		
//		3.ทดลองประกาศ final variable ชื่อ hello ให้มีค่า = "Hello" แล้วบรรทัดถัดมาลองไป
//		Assign ค่าใหม่ ให้ตัวแปรนี้เป็นค่า "World" แล้วลองดู run แล้วดูว่าเกิดอะไรขึ้น ?
		
		final String hello = "Hello";
		System.out.println(hello);
		
//		hello = "World";
//		System.out.println(hello);
		
//		เมื่อ assign hello = "World" ผลคือ
//		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//			The final local variable hello cannot be assigned. It must be blank and not using a compound assignment
//
//			at CTF01.Java.part1.BasicSyntax2.main(BasicSyntax2.java:50)


	}
	
}
