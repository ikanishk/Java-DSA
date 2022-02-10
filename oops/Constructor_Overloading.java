package oops;

public class Constructor_Overloading {
	// Constructors overloading = Constructors with different arguments.
	public static class Cuboid{
		int l,b,h;
		public Cuboid(){
		this.l=0;
		this.b=0;
		this.h=0;
		}
		
		public Cuboid(int l){
		this.l= this.b= this.h=l;
		}
		
		public Cuboid(int l,int b, int h){
		this.l=h;
		this.b=b;
		this.h=h;
		}
		
		
		public int volume() {
			int vol=(l*b*h);
			return vol;
		}
		
		public int surfAr() {
			int surfAr=2*(l*b+h);
			return surfAr;
		}
	}
	
	public static void test() {
		Cuboid c1=new Cuboid(5,6,7); // Parameterized constructor is triggered
		System.out.println(c1.volume());
		System.out.println(c1.surfAr());
		
		Cuboid c2=new Cuboid(); // Default constructor is triggered
		System.out.println(c2.volume());
		System.out.println(c2.surfAr());
		
		Cuboid c3=new Cuboid(10); // Default constructor is triggered
		System.out.println(c3.volume());
		System.out.println(c3.surfAr());
	}
	
	public static void main(String[] args) {
	test();
	}
}


