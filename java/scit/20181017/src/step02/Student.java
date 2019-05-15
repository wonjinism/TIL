package step02;

public class Student {
	private String name;
	private NoteBook notebookID;
	public Student() {}
	public Student(String name, NoteBook notebookID) {
		this.name = name;
		this.notebookID = notebookID; 
	} 
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the notebookID
	 */
	public NoteBook getNotebookID() {
		return notebookID;
	}
	/**
	 * @param notebookID the notebookID to set
	 */
	public void setNotebookID(NoteBook notebookID) {
		this.notebookID = notebookID;
	}
}