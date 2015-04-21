package org.amuji.rtm;

import net.fortuna.ical4j.model.Calendar;

/**
 * @author Roy Yang
 *         4/21/2015.
 */
public class App {
    public static void main(String[] args) {
        Calendar calendar = new TaskRemover(CalendarReader.getInstance().getCalendar()).removeCompleted();
        CalendarSaver.getInstance().save(calendar);
    }
}
