package abstractex;

public class Notebook extends Computer{

	@Override
	public void display() {
		System.out.println("Notebook display()");
	}

	@Override
	public void typing() {
		System.out.println("Notebook typing()");
	}
}
