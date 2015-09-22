package ca.ubc.cpsc210.todo.model;

import java.util.Date;

/**
 * Created by djfwong on 14-10-03.
 */
public class UnscheduledTodoItem extends TodoItem {

    Boolean highpriority;

    public UnscheduledTodoItem(String title, String description, Boolean highpriority) {

        super(title, description);
        this.highpriority = highpriority;
    }

    public boolean isHighPriority() {
        return highpriority;
    }


    public void setHighPriority(boolean highpriority) {
        this.highpriority = highpriority;
    }
}

