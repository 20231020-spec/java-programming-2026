package todo;

import java.time.LocalDate;

// 속성 : 마감일 추가
// Todo를 상속
public class ScheduledTodo extends Todo {
	private LocalDate dueDate;
	
	
	public ScheduledTodo(int todoNo, String title, String assignee, LocalDate dueDate) {
		super(todoNo, title, assignee);
		this.dueDate = dueDate;
		
	}
		
	@Override
	public void print() {
		super.print();
		System.out.println("마감일: " + dueDate);
	}

	@Override
	public void abstractPrint() {
		print();
		
	}
	
	
}
