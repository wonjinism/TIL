package step02;

public class TestHasA2 {
	public static void main(String[] args) {
		Student s1 = new Student("Wonjin", new NoteBook("Samsung", "Sense"));
		System.out.println(s1.getName()); // Wonjin
		System.out.println(s1.getNotebookID().getMaker()); // Samsung
		System.out.println(s1.getNotebookID().getModel()); // Sense
	}
}