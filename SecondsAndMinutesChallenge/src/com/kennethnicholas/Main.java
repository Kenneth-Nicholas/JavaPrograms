package com.kennethnicholas;

public class Main {

    public static void main(String[] args) {
        int mins = 1_111;
        int secs = 11;
        String duration = getDurationString(mins, secs);
        System.out.println(duration);
        mins = -1_111;
        secs = -11;
        duration = getDurationString(mins, secs);
        System.out.println(duration);
        secs = 111_111;
        duration = getDurationString(secs);
        System.out.println(duration);
        secs = -111_111;
        duration = getDurationString(secs);
        System.out.println(duration);
        mins = 65;
        secs = 45;
        duration = getDurationString(mins, secs);
        System.out.println(duration);
        secs = 3945;
        duration = getDurationString(secs);
        System.out.println(duration);

    }

    public static String getDurationString(int minutes, int seconds) {
        String durationString;

        if ((minutes >= 0) && (seconds >= 0) && (seconds <= 59)) {

            System.out.print(minutes + " minutes and " + seconds + " seconds is equal to ");
            int hours = minutes / 60;
            minutes = minutes % 60;

            if (hours <= 9) {
                if (minutes <= 9) {
                    if (seconds <= 9) {
                        durationString = "0" + hours + "h 0" + minutes + "m 0" + seconds + "s";
                    } else {
                        durationString = "0" + hours + "h 0" + minutes + "m " + seconds + "s";
                    }
                } else {
                    if (seconds <= 9) {
                        durationString = "0" + hours + "h " + minutes + "m 0" + seconds + "s";
                    } else {
                        durationString = "0" + hours + "h " + minutes + "m " + seconds + "s";
                    }
                }
            } else {
                if (minutes <= 9) {
                    if (seconds <= 9) {
                        durationString = hours + "h 0" + minutes + "m 0" + seconds + "s";
                    } else {
                        durationString = hours + "h 0" + minutes + "m " + seconds + "s";
                    }
                } else {
                    if (seconds <= 9) {
                        durationString = hours + "h " + minutes + "m 0" + seconds + "s";
                    } else {
                        durationString = hours + "h " + minutes + "m " + seconds + "s";
                    }
                }
            }
        } else {
            durationString = "Invalid value";
        }
        return durationString;
    }

    public static String getDurationString(int seconds) {
        String durationString;

        if (seconds >= 0) {
            int minutes = seconds / 60;
            seconds = seconds % 60;
            durationString = getDurationString(minutes, seconds);
        } else {
            durationString = "Invalid value";
        }
        return durationString;
    }

}
