public class Giant{

	public static void main(String[] Args){
		char a = '*';
		char b = '*';
		char c = '*';
		char d = '*';

		giantLetter_U (a);
		giantDigit_6(b);
		giantLetter_A(c);
		giantLetter_C(d);
		
	}

	public static void giantLetter_U(char a){
		System.out.println(a+"     "+a);
		System.out.println(a+"     "+a);
		System.out.println(a+"     "+a);
		System.out.println(a+"     "+a);
		System.out.println(a+"     "+a);
		System.out.println(a+"     "+a);
		System.out.println(" "+a+a+a+a+a+" ");
		System.out.println();
	}



	public static void giantDigit_6(char a){
		System.out.println(" "+a+a+a+a+a+" ");
		System.out.println(a+"     "+a);
		System.out.println(a);
		System.out.println("" + a+a+a+a+a+a);
		System.out.println(a+"     "+a);
		System.out.println(a+"     "+a);
		System.out.println(" "+a+a+a+a+a+" ");
		System.out.println();
	}


	public static void giantLetter_A(char a){
	    System.out.println("   "+a+"     ");
		System.out.println("  "+a+" "+a+"  ");
		System.out.println(" "+a+"   "+a+" ");
		System.out.println(""+a+"     "+a+"");
		System.out.println(""+a+a+a+a+a+a+a+"");
		System.out.println(""+a+"     "+a+"");
		System.out.println(""+a+"     "+a+"");
		System.out.println();
	}


	 public static void giantLetter_C(char a){
		 System.out.println(" "+a+a+a+a+a+" ");
		 System.out.println(a+"     "+a);
		 System.out.println(a);
		 System.out.println(a);
		 System.out.println(a);
		 System.out.println(a+"     "+a);
		 System.out.println(" "+a+a+a+a+a+" ");
		 System.out.println();


	 }
}
