// WAP to calculate an angle between hour and minute hand. (Hours and minutes should be taken from user).
public class Code_14 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the hour: ");
        int hour = sc.nextInt();
        System.out.print("Enter the minute: ");
        int minute = sc.nextInt();

        if (hour < 0 || minute < 0 || hour > 12 || minute > 60)
            System.out.println("Wrong input");

        if (hour == 12)
            hour = 0;
        if (minute == 60) {
            minute = 0;
            hour += 1;
            if (hour > 12)
                hour = hour - 12;
        }

        int angle = Math.abs((int) ((hour * 60 + minute) * 0.5) - (int) (minute * 6));
        angle = Math.min(360 - angle, angle);
        System.out.println("The angle between hour and minute hand is: " + angle);
        sc.close();
    }
}
