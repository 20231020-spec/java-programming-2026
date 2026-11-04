package week10.todo;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		TodoLIst todoList = new TodoLIst(5);
		todoList.addTodo(new ScheduledTodo(1, "프로젝트", "me", LocalDate.now()));
		todoList.addTodo(new PriorityTodo(2, "할일 2", "me", PriorityTodo.Priority.HIGH));
		todoList.addTodo(new RecurringTodo(3, "할일 3", "me", Week.MONDAY, 15));
		// 우선순위 할일 생성
		// 반복 할일 생성해서 추가
		
		todoList.printAll();
		
		
	}

}
