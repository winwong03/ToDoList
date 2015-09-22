package ca.ubc.cpsc210.todo.model;


import java.util.Date;

/**
 * Created by djfwong on 14-10-03.
 */
public class ScheduledTodoItem extends TodoItem {
    Date currentdate = new Date(2014,10,9);
    Date dueDate;
    Date date = new Date(2014,8,06);

    public ScheduledTodoItem(String title, String description, Date dueDate) {

        super(title, description);
        this.dueDate = dueDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCompleted(){
        return (currentdate.after(dueDate));

    }

    public boolean isHighPriority() {
        return (currentdate.equals(dueDate));
    }


}
