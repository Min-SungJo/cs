package org.example.test;

public class HHMMSS {
    public static void main(String[] args) {
        String time = "234800";
        int ss = 25*60+1;
        System.out.println(112233+ss);
        System.out.println(execute(time, ss));
        System.out.println("===========");
        System.out.println(execute2(time, ss));
    }

    private static String execute(String time, int ss) {
        int totalSeconds = ss
                + Integer.parseInt(time.substring(4, 6))
                + Integer.parseInt(time.substring(2, 4)) * 60
                + Integer.parseInt(time.substring(0, 2)) * 3600;

        int hours = totalSeconds / 3600 % 24;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.println("Total seconds: " + totalSeconds);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);

        return String.format("%02d%02d%02d", hours, minutes, seconds);
    }

    private static String execute2(String time, int ss) {
        int total = ss
                + Integer.parseInt(time.substring(0, 2)) * 60 * 60
                + Integer.parseInt(time.substring(2, 4)) * 60
                + Integer.parseInt(time.substring(4, 6));
        int h = total / 3600 % 24;
        int m = total % 3600 / 60;
        int s = total % 60;
        System.out.println("Total seconds: " + total);
        System.out.println("Hours: " + h);
        System.out.println("Minutes: " + m);
        System.out.println("Seconds: " + s);
        return String.format("%02d%02d%02d", h, m, s);
    }
}
