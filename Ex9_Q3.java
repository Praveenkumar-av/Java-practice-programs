// You have users spread across different regions: New York (Eastern Time), London (Greenwich Mean Time), 
// Tokyo (Japan Standard Time), and Sydney (Australian Eastern Standard Time). Each user can schedule
// meetings/events in their local time zone, but these events should be displayed accurately for all 
// users based on their respective time zones.

// Your task is to create a scheduling system that takes into account:
// Allowing users to input meeting/event details in their local time zone.
// Storing these events in a database using the java.util.Date class.
// Displaying these events accurately for users in different time zones using the java.util.Time class for 
// proper time conversions.

// Consider the following challenges:

// Properly converting the time from one time zone to another.
// Handling daylight saving time changes for the respective regions.
// Ensuring that when a user from one time zone views an event scheduled by another user in a different time zone, 
// the displayed time is adjusted accordingly.
// Your solution should address these complexities and ensure accurate scheduling and display of events across 
// different time zones while using the java.util.Date and java.util.Time classes effectively.

import java.util.*;
import java.time.*;

class Ex9_Q3
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String name, place, time;

        System.out.println("Enter the Event name :");
        name = scan.next();
        System.out.println("Enter the Event place :");
        place = scan.next();
        System.out.println("Enter the Event time :");
        time = scan.next();

        ZoneId z = ZoneId.of(place);
        LocalDateTime t1 = LocalDateTime.now(z);
        System.out.println("Time :"+t1);

        // z = ZoneId.of("Asia/London");
        // t1 = LocalDateTime.now(z);
        t1 = t1.plusHours(9);
        t1 = t1.plusMinutes(23);
        System.out.println("London Time :"+t1);

        // z = ZoneId.of("Australia/Sydney");
        // t1 = LocalDateTime.now(z);
        t1 = t1.plusHours(8);
        t1 = t1.plusMinutes(45);
        System.out.println("Tokyo Time :"+t1);

        // z = ZoneId.of("America/NewYork");
        // t1 = LocalDateTime.now(z);
        t1 = t1.plusHours(4);
        t1 = t1.plusMinutes(21);
        System.out.println("Sydney Time :"+t1);
    }
}