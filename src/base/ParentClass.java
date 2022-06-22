package base;

public class ParentClass extends GrandParent {

	int a = 10;
	int b = 20;

	public void eat() {
		System.out.println("I am eating");
	}

	public void sleep() {
		System.out.println("I am sleeping");
	}

	public static void main(String[] args) {
		ParentClass parent = new ParentClass();
		parent.eat();
		parent.sleep();
		System.out.println(parent.a);
		System.out.println(parent.b);

	}

}
