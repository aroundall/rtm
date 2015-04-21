package org.amuji.rtm;

import net.fortuna.ical4j.data.CalendarBuilder;
import net.fortuna.ical4j.data.ParserException;
import net.fortuna.ical4j.model.Calendar;
import net.fortuna.ical4j.model.ComponentList;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Roy Yang
 *         4/21/2015.
 */
public class CalendarReader {
    private static final String filePath = "/rtm.ics";

    public static CalendarReader getInstance() {
        return new CalendarReader();
    }

    public Calendar getCalendar() {
        InputStream in = App.class.getResourceAsStream(filePath);

        Calendar calendar;
        try {
            calendar = new CalendarBuilder().build(in);
            in.close();
        } catch (IOException | ParserException e) {
            e.printStackTrace();
            throw new RtmException("Failed to read or parse file");
        }

        return calendar;
    }

    public ComponentList getComponents() {
        return getCalendar().getComponents();
    }
}
