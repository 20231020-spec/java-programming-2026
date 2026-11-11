package todo;

// 추상클래스
public abstract class Todo {

	
	private int todoNo;
	private String title;
	private String assignee;
	
	public Todo(int todoNo, String title, String assignee) {
		this.todoNo = todoNo;
		this.title = title;
		this.assignee = assignee;
	}
	// 추상 메서드
	public abstract void abstractPrint();
	
	public void print() {
		System.out.println("번호: " + todoNo);
		System.out.println("제목: " + title);
		System.out.println("담담자: " + assignee);
	}
}
