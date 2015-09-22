package ca.ubc.cpsc210.todo.test;

import ca.ubc.cpsc210.todo.model.ScheduledTodoItem;
import ca.ubc.cpsc210.todo.model.UnscheduledTodoItem;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class ScheduledTodoItemTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testGetDueDate() throws Exception {
        Date currentDateTime = new Date();

        ScheduledTodoItem todoitem = new ScheduledTodoItem("Groceries", "Pick up groceries at the UBC farmer's market.",currentDateTime);
        assertEquals(currentDateTime, todoitem.getDueDate());

    }

    @Test
    public void testSetDueDate() throws Exception {
        ScheduledTodoItem todo = new ScheduledTodoItem("Work","Make pizzas", new Date(2014,2,06));

        todo.setDueDate(new Date(2014,8,8));

        assertEquals(new Date(2014,8,8), todo.getDueDate());

    }

    @Test
    public void testIsCompleted() throws Exception {

        ScheduledTodoItem todo = new ScheduledTodoItem("Work", "Make pizzas", new Date (2, 1, 2000));

        assertTrue(todo.isCompleted());

        ScheduledTodoItem tobedone = new ScheduledTodoItem("Work", "Make pizzas", new Date(2015,8,6));

        assertFalse(tobedone.isCompleted());

    }

    @Test
    public void testIsHighPriority() throws Exception {

        Date newdate = new Date(2014,12,31);


        ScheduledTodoItem todo = new ScheduledTodoItem("Work", "Make pizzas", new Date(2014,10,9));
        assertTrue(todo.isHighPriority());

        ScheduledTodoItem tobedone = new ScheduledTodoItem("Work", "Make pizzas", newdate);
        assertFalse(tobedone.isHighPriority());

    }
}