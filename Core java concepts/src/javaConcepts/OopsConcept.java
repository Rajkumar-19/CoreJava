package javaConcepts;

class One {
	int numtest = 20;
	static int num = 10;
	final int numFinal = 25;

	public void display() {
		System.out.println("parent display" + this.numtest);
//this.numFinal =30; unable to change the value 
	}

}

//single inheritance & method overriding - polymorphism

class Two extends One {

	public void display() {
		System.out.println("child display");
		super.display(); // calling parent class from child class
	}

	public int add(int x, int y) {
		return x + y;
	}

//method Overloading - Polymorphism

	public double add(double x, double y) {
		return x + y;
	}
}

//encapsulation example

class EncapTest {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

}

//abstraction

abstract class TwoWheeler {
	public abstract void run();
}

class Honda extends TwoWheeler {

	public void run() {
		System.out.println("\nbike is Running..");
	}

}

class OopsConcept {

	public static void main(String[] args) {

		One a = new One();
		a.display();
		Two b = new Two();
		b.display();
		System.out.println(b.add(4, 2));
		System.out.println(b.add(5.0, 2.0)); // polymorphism
		EncapTest encap = new EncapTest();
		encap.setName("Raj kumar");
		System.out.print("Name : " + encap.getName());
		TwoWheeler test = new Honda();
		test.run();
		System.out.println(One.num);
		One.num++;
		System.out.println(Two.num);
	}

}
