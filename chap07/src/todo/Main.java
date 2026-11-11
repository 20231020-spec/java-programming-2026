package todo;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Todo todo = new ScheduledTodo(1, "추상 할일", "me", LocalDate.parse("2026-11-11"));
		todo.abstractPrint();
	}

}
