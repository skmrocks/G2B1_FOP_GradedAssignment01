/*----------------------------------------------------------------------------------------
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

 package com.group.gradedassignments.assignment01;

 /**
  * TechDepartment class for adding tech department functionalities.
  */
public class TechDepartment extends SuperDepartment {

    private static final String DEPARTMENTNAME = "Tech Department";
    private static final String TODAYSWORK = "Complete coding of module 1";
    private static final String WORKDEADLINE = "Complete by EOD";
    private static final String TECHSTACKINFORMATION = "Core Java";

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
     * Get method for tech stack information.
     * @return tech stack information.
     */
    public String getTechStackInformation() {
        return TECHSTACKINFORMATION;
    }
}
