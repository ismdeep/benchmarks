#include <stdio.h>
#include <sys/time.h>

int fibonacci(int n) {
    if (n <= 1) {
        return 1;
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

long get_unix_time_ms() {
    struct timeval tm;
    gettimeofday(&tm, NULL);
    return tm.tv_sec * 1000 + tm.tv_usec / 1000;
}

int main() {
    for (int i = 1; i <= 45; ++i) {
        long start_time = get_unix_time_ms();
        int fib_val = fibonacci(i);
        long end_time = get_unix_time_ms();
        printf("fib,c,%d,%ld\n", i, end_time - start_time);
    }
    return 0;
}
