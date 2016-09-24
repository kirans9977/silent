package com.example.vishal.silent;

/**
 * Created by vishal on 9/24/16.
 */

import java.util.ArrayList;

/**
 *  Look into adding a modify event option (allows user to change start or end time) 
 */


public class Appointment {
    private String name;
    private int startTimeHour; //hour value of the starting time
    private int startTimeMinute; //minute value of the starting time
    private int endTimeHour; //hour value of the ending time
    private int endTimeMinute; //minute value of the ending time
    private int daysOfTheWeek; //Sunday = 1 ... Saturday = 7
    private ArrayList<Appointment> appointmentCollection = new ArrayList<Appointment>();

    //constructor creates a new Appointment object with given attributes
    //An Appointment is an event in the user's schedule
    public Appointment(String name, int startTimeHour, int startTimeMinute, int endTimeHour,
                       int endTimeMinute, int daysOfTheWeek, String startTimeAMPM,
                       String endTimeAMPM) {

        this.name = name;

        //24 hour clock conversion
        if (startTimeAMPM.equals("PM")) {
            this.startTimeHour = startTimeHour + 12;
        } else {
            this.startTimeHour = startTimeHour;
        }

        this.startTimeMinute = startTimeMinute;

        //24 hour clock conversion
        if (endTimeAMPM.equals("PM")) {
            this.endTimeHour = endTimeHour + 12;
        } else {
            this.endTimeHour = endTimeHour;
        }

        this.endTimeMinute = endTimeMinute;
        this.daysOfTheWeek = daysOfTheWeek;

        addToCollection(this);
    }

    //helper method to add an appointment to the collection
    private void addToCollection(Appointment a) {
        appointmentCollection.add(a);
    }

    public void removeAppointment(Appointment a) {
        appointmentCollection.remove(a);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStartTimeHour() {
        return startTimeHour;
    }

    public void setStartTimeHour(int startTimeHour) {
        this.startTimeHour = startTimeHour;
    }

    public int getStartTimeMinute() {
        return startTimeMinute;
    }

    public void setStartTimeMinute(int startTimeMinute) {
        this.startTimeMinute = startTimeMinute;
    }

    public int getEndTimeHour() {
        return endTimeHour;
    }

    public void setEndTimeHour(int endTimeHour) {
        this.endTimeHour = endTimeHour;
    }

    public int getEndTimeMinute() {
        return endTimeMinute;
    }

    public void setEndTimeMinute(int endTimeMinute) {
        this.endTimeMinute = endTimeMinute;
    }

    public int getDaysOfTheWeek() {
        return daysOfTheWeek;
    }

    public void setDaysOfTheWeek(int daysOfTheWeek) {
        this.daysOfTheWeek = daysOfTheWeek;
    }

    public int getStartTimeMinuteCorrected() {
        return startTimeMinute - 1;
    }

    public int getEndTmeMinuteCorrected() {
        return endTimeMinute - 1;
    }


    public static void main(String[] args) {

    }
}
