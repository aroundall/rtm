package org.amuji.rtm;

import net.fortuna.ical4j.model.Calendar;
import net.fortuna.ical4j.model.Component;
import net.fortuna.ical4j.model.ComponentList;
import net.fortuna.ical4j.model.Property;

import java.util.Iterator;
import java.util.Objects;

/**
 * @author Roy Yang
 *         4/21/2015.
 */
public class TaskRemover {
    private Calendar calendar;

    public TaskRemover(Calendar calendar) {
        Objects.nonNull(calendar);
        this.calendar = calendar;
    }

    public Calendar removeCompleted() {

        ComponentList todos = calendar.getComponents("VTODO");


        for (Iterator<Component> i = todos.iterator(); i.hasNext();) {
            Component todo = i.next();
            Property status = todo.getProperty("STATUS");
            if (status != null && "COMPLETED".equals(status.getValue())) {
                calendar.getComponents().remove(todo);
            }
        }

        return calendar;
    }
}
