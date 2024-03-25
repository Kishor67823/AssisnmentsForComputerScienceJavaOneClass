public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void increment(int numberOfSeconds) {
        int countMinutes = numberOfSeconds / 60;
        int countHours = numberOfSeconds / 3600;
        while (countHours >= 1) {
            this.hours += 1;
            countHours = countHours - 1;
            numberOfSeconds = numberOfSeconds - 3600;
            countMinutes = countMinutes - 60;
        }
        while (countMinutes >= 1) {
            this.minutes += 1;
            countMinutes = countMinutes - 1;
            numberOfSeconds = numberOfSeconds - 60;
            if (this.minutes == 60) {
                this.hours += 1;
                this.minutes = 0;
            }
        }
        while (numberOfSeconds >= 1) {
            this.seconds += 1;
            numberOfSeconds = numberOfSeconds - 1;
            if (this.seconds == 60) {
                this.minutes += 1;
                this.seconds = 0;
            }
        }

    }

    public void print(boolean military) {
        if (military) {
            System.out.printf("%02d:%02d:%02d\n", this.hours, this.minutes, this.seconds);
        } else {
            if (this.hours > -1 && this.hours < 12) {
                String amOrPM = "AM";
                System.out.printf("%02d:%02d:%02d %s\n", this.hours, this.minutes, this.seconds, amOrPM);
            } else if (this.hours >= 12 && this.hours < 24) {
                this.hours -= 12;
                String amOrPM = "PM";
                System.out.printf("%02d:%02d:%02d %s\n", this.hours, this.minutes, this.seconds, amOrPM);
            }
        }
    }

    public static Time fromString(String timeInStringFormat) {
        String[] strArray = timeInStringFormat.split(":");
        int hours = Integer.parseInt(strArray[0]);
        int minutes = Integer.parseInt(strArray[1]);
        int seconds = Integer.parseInt(strArray[2]);
        return new Time(hours, minutes, seconds);
    }

    public static void main(String args[]) {
        Time t1 = new Time();              // midnight
        Time t2 = new Time(17, 30, 0);     // 5:30 PM
        Time t3 = Time.fromString("14:15:56");

        // add an hour onto t1, then print it in both formats
        t1.increment(3600);
        t1.print(true);
        t1.print(false);

        // add an hour and a half, and 30 seconds onto t2
        t2.increment(5430);

        // print t2 in both formats
        t2.print(true);
        t2.print(false);

        // add 5 seconds to t3, then prints it in both formats
        t3.increment(5);
        t3.print(true);
        t3.print(false);
    }
}