package com.group.gradedassignments.assignment01;

public class Driver {
    public static void main(String[] args) {
        AdminDepartment adminDepartment = new AdminDepartment();
        doPrintWelcomeMessage(adminDepartment.departmentName());
        doPrintMessage(adminDepartment.getTodaysWork());
        doPrintMessage(adminDepartment.getWorkDeadline());
        doPrintMessage(adminDepartment.isTodayAHoliday());
        doPrintMessage("");
        HrDepartment hrDepartment = new HrDepartment();
        doPrintWelcomeMessage(hrDepartment.departmentName());
        doPrintMessage(hrDepartment.doActivity());
        doPrintMessage(hrDepartment.getTodaysWork());
        doPrintMessage(hrDepartment.getWorkDeadline());
        doPrintMessage(hrDepartment.isTodayAHoliday());
        doPrintMessage("");
        TechDepartment techDepartment = new TechDepartment();
        doPrintWelcomeMessage(techDepartment.departmentName());
        doPrintMessage(techDepartment.getTodaysWork());
        doPrintMessage(techDepartment.getWorkDeadline());
        doPrintMessage(techDepartment.getTechStackInformation());
        doPrintMessage(techDepartment.isTodayAHoliday());
        doPrintMessage("");
    }

    private static void doPrintWelcomeMessage(String departmentName) {
        System.out.println(new StringBuilder().append("Welcome to").append(" ").append(departmentName).toString());
    }

    private static void doPrintMessage(String message) {
        System.out.println(message);
    }
}
