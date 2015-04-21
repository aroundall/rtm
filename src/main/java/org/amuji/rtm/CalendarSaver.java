package org.amuji.rtm;

import net.fortuna.ical4j.data.CalendarOutputter;
import net.fortuna.ical4j.model.Calendar;
import net.fortuna.ical4j.model.ValidationException;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Roy Yang
 *         4/21/2015.
 */
public class CalendarSaver {
    public static CalendarSaver getInstance() {
        return new CalendarSaver();
    }

    public void save(Calendar calendar) {
        try {
            FileOutputStream out = new FileOutputStream("/eliminated.ics");
            CalendarOutputter calOut = new CalendarOutputter();
            calOut.setValidating(false);
            calOut.output(calendar, out);
        } catch (IOException | ValidationException e) {
            e.printStackTrace();
            throw new RtmException("Failed to save calendar.");
        }
    }
}
