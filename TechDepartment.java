package com.group.gradedassignments.assignment01;

public class TechDepartment extends SuperDepartment {
    private static final String DEPARTMENTNAME = "Tech Department";
    private static final String TODAYSWORK = "Complete coding of module 1";
    private static final String WORKDEADLINE = "Complete by EOD";
    private static final String TECHSTACKINFORMATION = "core Java";

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

    public String getTechStackInformation() {
        return TECHSTACKINFORMATION;
    }
}
