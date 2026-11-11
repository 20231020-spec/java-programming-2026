package todo;


public class PriorityTodo extends Todo {
	enum Priority { LOW, NORMAL, HIGH };
	private Priority Priority;
	
	public PriorityTodo (int todoNo, String title, String assignee, Priority Priority) {
		super(todoNo, title, assignee);
		this.Priority = Priority;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("우선순위: " + Priority);
	}

	@Override
	public void abstractPrint() {
		print();
		
	}
	
	
}
