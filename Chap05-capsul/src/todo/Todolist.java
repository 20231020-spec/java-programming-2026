package todo;

public class Todolist {
	
	static final int TODO_SIZE = 10;
	
	private Todo[] todos;
	private int todoCount =0;
	private final int todoSize;
	
	public Todolist() {
		this.todos = new Todo[TODO_SIZE];
		this.todoSize = TODO_SIZE;
	}
	
	public Todolist(int todoSize) {
		this.todos = new Todo[todoSize];
		this.todoSize = todoSize;
	}
	
	public void addTodo(Todo todo) {
		
		this.todos[this.todoCount++] = todo;
		
	}
	
	
	public void printAll() {
//		for(Todo todo : todos) {
//			todo.print();
//		}
		for(int i = 0;i<todoCount;i++) {
			todos[i].print();
		}
	}
	
	
}
