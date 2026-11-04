package week10.todo;

// Todo 클래스
// 속성 : 번호, 제목, 담당자

public class Todo {

	
	private int todoNo;
	private String title;
	private String assignee;
	
	public Todo(int todoNo, String title, String assignee) {
		this.todoNo = todoNo;
		this.title = title;
		this.assignee = assignee;
	}
	
	public void print() {
		System.out.println("번호: " + todoNo);
		System.out.println("제목: " + title);
		System.out.println("담담자: " + assignee);
	}
}
