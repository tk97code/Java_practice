package Basic_OOP;

public class ex02 {

	public static void main(String[] args) {
		String str1 = new String("VKU is one of the best universities in VN");
		String str2 = new String("Prof. Phap is an OOP teacher");
		
		System.out.println("str1 contains "+ str1.length() + " chracter");
		 int n = str1.compareTo(str2);
		 if (n > 0)
		 	System.out.println("str1 is greater than str2");
		 	else if (n==0)
		 		System.out.println("str1 is equal to str2");
		 	else System.out.println("str1 is less than str2");
	}

}
