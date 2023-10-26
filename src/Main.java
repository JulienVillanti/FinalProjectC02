public class Main {
    public static void main(String[] args) {
        int totalSeconds = 50391;

        // Calculate hours, minutes, and seconds
        int hours = totalSeconds / 3600;        // 1 hour = 3600 seconds
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;    // 1 minute = 60 seconds
        int seconds = remainingSeconds % 60;

        //result
        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
    }
}


