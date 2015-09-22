package ca.ubc.cpsc210.todo.test;

import ca.ubc.cpsc210.todo.model.UnscheduledTodoItem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnscheduledTodoItemTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testIsHighPriority() throws Exception {
        UnscheduledTodoItem todo = new UnscheduledTodoItem("Work", "Make pizzas", true);
        UnscheduledTodoItem todo1 = new UnscheduledTodoItem("Work", "Make pizzas", false);

        assertTrue(todo.isHighPriority());
        assertFalse(todo1.isHighPriority());

    }

    @Test
    public void testSetHighPriority() throws Exception {
        UnscheduledTodoItem todo = new UnscheduledTodoItem("Work", "Make pizzas", false);

        todo.setHighPriority(true);

        assertEquals(true, todo.isHighPriority());

    }
}