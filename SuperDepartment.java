package com.group.gradedassignments.assignment01;

public class SuperDepartment {

    private static final String DEPARTMENTNAME = "Super Department";
    private static final String TODAYSWORK = "No Work as of now";
    private static final String WORKDEADLINE = "Nil";
    private static final String TODAYAHOLIDAY = "Today is not a holiday";

    public String departmentName() {
        return DEPARTMENTNAME;
    }

    public String getTodaysWork() {
        return TODAYSWORK;
    }

    public String getWorkDeadline() {
        return WORKDEADLINE;
    }

    public String isTodayAHoliday() {
        return TODAYAHOLIDAY;
    }
}
