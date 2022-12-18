/*----------------------------------------------------------------------------------------
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.group.gradedassignments.assignment01;

/**
 * SuperDepartment class for adding primary department functionalities.
 */
public class SuperDepartment {

    private static final String DEPARTMENTNAME = "Super Department";
    private static final String TODAYSWORK = "No Work as of now";
    private static final String WORKDEADLINE = "Nil";
    private static final String TODAYAHOLIDAY = "Today is not a holiday";

    /**
     * Get method for department name.
     * @return department name.
     */
    public String departmentName() {
        return DEPARTMENTNAME;
    }

    /**
     * Get method for today`s work.
     * @return today`s work.
     */
    public String getTodaysWork() {
        return TODAYSWORK;
    }

    /**
     * Get method for work deadline.
     * @return work deadline.
     */
    public String getWorkDeadline() {
        return WORKDEADLINE;
    }

    /**
     * Get method for checking whether today is holiday or not.
     * @return today a holiday.
     */
    public String isTodayAHoliday() {
        return TODAYAHOLIDAY;
    }
}
