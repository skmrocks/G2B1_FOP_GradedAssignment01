/*----------------------------------------------------------------------------------------
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.group.gradedassignments.assignment01;

/**
 * AdminDepartment class for adding admin department functionalities.
 * @see SuperDepartment admin department extends super department.
 */
public class AdminDepartment extends SuperDepartment {

    private static final String DEPARTMENTNAME = "Admin Department";
    private static final String TODAYSWORK = "Complete your documents Submission";
    private static final String WORKDEADLINE = "Complete by EOD";

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
}
