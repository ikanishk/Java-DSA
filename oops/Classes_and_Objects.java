package oops;

public class Classes_and_Objects {
	
	public static class Person{
		int age;
		String name;
		 void sayhi() {
			System.out.println(name+" "+age);
		}
	}
	
	public static void main(String[] args) {
		Person p1=new Person();
		p1.name="Kanishk";
		p1.age=20;
		p1.sayhi();

	}

}
