package com.group.gradedassignments.assignment01;

public class AdminDepartment extends SuperDepartment {
    private static final String DEPARTMENTNAME = "Admin Department";
    private static final String TODAYSWORK = "Complete your documents Submission";
    private static final String WORKDEADLINE = "Complete by EOD";

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
}
