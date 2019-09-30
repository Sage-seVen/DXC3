
public class secjava {

	static int x;

	static
	{
	x=10;
	System.out.println("static block");
	Thread.currentThread().setName("MY MAIN in staic block");
	}

	public static void main(String[] args) {
	System.out.println("main ->"+Thread.currentThread().getName());
	System.out.println(x);
	}
}