package com.yaksha.assignment;

public class SwitchCaseAssignment {

    public static void main(String[] args) {

        // Task 1: Day of the week based on the given integer
        int day = 3;
        String dayOfWeek = "";
        switch (day) {
            case 1: dayOfWeek = "Monday"; break;
            case 2: dayOfWeek = "Tuesday"; break;
            case 3: dayOfWeek = "Wednesday"; break;
            case 4: dayOfWeek = "Thursday"; break;
            case 5: dayOfWeek = "Friday"; break;
            case 6: dayOfWeek = "Saturday"; break;
            case 7: dayOfWeek = "Sunday"; break;
            default: dayOfWeek = "Invalid day number"; break;
        }
        System.out.println("Day of the week: " + dayOfWeek);

        // Task 2: Number of days in a month based on the month number
        int month = 2;
        String daysInMonth = "";
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daysInMonth = "31 days"; break;
            case 4: case 6: case 9: case 11:
                daysInMonth = "30 days"; break;
            case 2:
                daysInMonth = "28 or 29 days"; break;
            default:
                daysInMonth = "Invalid month number"; break;
        }
        System.out.println("Number of days in month: " + daysInMonth);

        // Task 3: Grade based on marks using switch-case
        int marks = 82;
        String grade = "";
        switch (marks / 10) {
            case 10: case 9: grade = "Grade: A"; break;
            case 8: grade = "Grade: B"; break;
            case 7: grade = "Grade: C"; break;
            default: grade = "Grade: F"; break;
        }
        System.out.println(grade);

        // Task 4: Month name based on the month number
        month = 5;
        String monthName = "";
        switch (month) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; break;
            default: monthName = "Invalid month number"; break;
        }
        System.out.println("Month name: " + monthName);

        // Task 5: Season based on the month number
        month = 12;
        String season = "";
        switch (month) {
            case 12: case 1: case 2: season = "Winter"; break;
            case 3: case 4: case 5: season = "Spring"; break;
            case 6: case 7: case 8: season = "Summer"; break;
            case 9: case 10: case 11: season = "Fall"; break;
            default: season = "Invalid month number"; break;
        }
        System.out.println("Season: " + season);
    }
}
