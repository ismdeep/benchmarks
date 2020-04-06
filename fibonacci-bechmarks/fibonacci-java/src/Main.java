import java.time.Instant;
import java.util.Date;

public class Main {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static long unix_timestamp_ms() {
        Instant current_time = Instant.now();
        return current_time.getEpochSecond() * 1000 + current_time.getNano() / 1000000;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 44; i++) {
            long start_time_unix_ms = unix_timestamp_ms();
            int ans = fibonacci(i);
            long end_time_unix_ms = unix_timestamp_ms();
            System.out.println(String.format("| %d | %d | %d |", i, ans, end_time_unix_ms - start_time_unix_ms));
        }
    }
}
