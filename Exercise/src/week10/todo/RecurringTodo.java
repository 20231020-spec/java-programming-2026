package week10.todo;


public class RecurringTodo extends Todo {

	private Week weekday;
	private int cycle;
	
	public RecurringTodo(int todoNo, String title, String assignee, 
			Week weekday, int cycle) {
		super(todoNo, title, assignee);
		this.weekday = weekday;
		this.cycle =cycle;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("요일: " + weekday);
		System.out.println("횟수: " + cycle);
	}
	
}
