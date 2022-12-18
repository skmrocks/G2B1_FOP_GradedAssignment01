package com.group.gradedassignments.assignment01;

public class HrDepartment extends SuperDepartment {
    private static final String DEPARTMENTNAME = "Hr Department";
    private static final String TODAYSWORK = "Fill today`s timesheet and mark your attendance";
    private static final String WORKDEADLINE = "Complete by EOD";
    private static final String ACTIVITY = "team Lunch";

    @Override
    public String departmentName() {
        return DEPARTMENTNAME;
    }

    @Override
    public String getTodaysWork() {
        return TODAYSWORK;
    }

    @Override
    public String getWorkDeadline() {
        return WORKDEADLINE;
    }

    public String doActivity() {
        return ACTIVITY;
    }
}
