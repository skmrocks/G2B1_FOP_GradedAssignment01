/*----------------------------------------------------------------------------------------
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.group.gradedassignments.assignment01;

/**
 * HrDepartment class for adding HR department functionalities.
 */
public class HrDepartment extends SuperDepartment {

    private static final String DEPARTMENTNAME = "HR Department";
    private static final String TODAYSWORK = "Fill today`s timesheet and mark your attendance";
    private static final String WORKDEADLINE = "Complete by EOD";
    private static final String ACTIVITY = "team Lunch";

    /**
     * Get method for department name.
     * @return department name.
     */
    @Override
    public String departmentName() {
        return DEPARTMENTNAME;
    }

    /**
     * Get method for today`s work.
     * @return today`s work.
     */
    @Override
    public String getTodaysWork() {
        return TODAYSWORK;
    }

    /**
     * Get method for work deadline.
     * @return work deadline.
     */
    @Override
    public String getWorkDeadline() {
        return WORKDEADLINE;
    }

    /**
     * Get method for activity.
     * @return activity.
     */
    public String doActivity() {
        return ACTIVITY;
    }
}
