/*----------------------------------------------------------------------------------------
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.group.gradedassignments.assignment01;

/**
 * Driver class for printing each department functionalities.
 */
public class Driver {
    
    /**
     * Main method for running the driver application to perform required steps to execute print functionality.
     * @param args arguments for accepting parameters as string array.
     */
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

    /**
     * Print method for welcome message.
     * @param message input message for print.
     */
    private static void doPrintWelcomeMessage(String message) {
        System.out.println(new StringBuilder().append("Welcome to").append(" ").append(message).toString());
    }

    /**
     * Print method for common message.
     * @param message input message for print.
     */
    private static void doPrintMessage(String message) {
        System.out.println(message);
    }
}
