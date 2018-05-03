package com.netflix.simianarmy;

import java.util.Calendar;
import java.util.Date;

public interface ICalendar {


    /**
     * Get the current time using whatever timezone is used for monkey date calculations.
     *
     * @return the calendar
     */
    Calendar now();

    /** Gets the next business day from the start date after n business days.
     *
     * @param date the start date
     * @param n the number of business days from now
     * @return the business day after n business days
     */
    Date getBusinessDay(Date date, int n);
}
