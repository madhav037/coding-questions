// WAP to calculate an angle between hour and minute hand. (Hours and minutes should be taken from user).
import java.util.Scanner;

public class _14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt();
		int minute = sc.nextInt();

		 if (hour < 0 || minute < 0 || hour > 12 || minute > 60) {
            System.out.println("Wrong input");
			return;
		 }

		if (hour == 12)
            hour = 0;
        if (minute == 60) {
            minute = 0;
            hour += 1;
            if (hour > 12)
                hour = hour - 12;
        }

		double angle = Math.abs(((hour * 60 + minute) * 0.5) - (minute * 6));
		angle = Math.min(360-angle, angle);

		System.out.print(angle);
	}
}