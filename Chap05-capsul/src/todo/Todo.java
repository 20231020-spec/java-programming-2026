package todo;

import java.time.LocalDate;

//할일 : 번호 제목 마감일 담당자
public class Todo {
	
	private int todoNo;
	private String title;
	private LocalDate dueDate;
	private String assignee;
	
	
	public Todo(int todoNo, String title, LocalDate dueDate, String assignee) {
		this.todoNo = todoNo;
		this.title = title;
		this.dueDate = dueDate;
		this.assignee = assignee;
	}


	public int getTodoNo() {
		return todoNo;
	}


	public void setTodoNo(int todoNo) {
		this.todoNo = todoNo;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public LocalDate getDueDate() {
		return dueDate;
	}


	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}


	public String getAssignee() {
		return assignee;
	}


	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}
	
	
	public void print()
	{
		System.out.println(this.title);
		System.out.println(this.dueDate);
		System.out.println(this.assignee);
	}

	
}
