package todo;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Todolist todoList = new Todolist();
		todoList.addTodo(new Todo(1,"시험준비",LocalDate.now(),"me"));
		todoList.addTodo(new Todo(1,"다음주 시험준비",LocalDate.parse("2026-10-28"),"me"));
		todoList.printAll();

	}

}
