
public class methodOverloading_2 {

	public static void main(String[] args) {
		System.out.println(getDurationString(3945)); // 1h 5m 45s
        System.out.println(getDurationString(3600)); // 1h 0m 0s
        System.out.println(getDurationString(60));   // 0h 1m 0s
        System.out.println(getDurationString(-5));   // Invalid input
        System.out.println(getDurationString(65, 45)); // 1h 5m 45s
	}

	public static String getDurationString(int seconds) {
		if (seconds < 0) {
            return "Invalid input";
        }

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        return String.format("%dh %dm %ds", hours, minutes, remainingSeconds);
	}

	public static String getDurationString(int minutes, int seconds) {
		if (minutes < 0 || seconds < 0 || seconds >= 60) {
            return "Invalid input";
        }
        return getDurationString(minutes * 60 + seconds);
	}
}
