#include <stdio.h>
#include <stdlib.h>
#include <sys/time.h>

int fibonacci(int n) {
    if (n <= 1) {
        return 1;
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}


long get_time() {
    struct timeval tm;
    gettimeofday(&tm,NULL);
    return tm.tv_sec * 1000 + tm.tv_usec / 1000;
}


int main() {
    for (int i = 0; i < 44;i ++) {
        long start_time = get_time();
        int ans = fibonacci(i);
        long end_time = get_time();
        printf("| %d | %d | %ld |\n", i, ans, end_time - start_time);
    }
    return 0;
}
