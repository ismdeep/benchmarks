import sys
import time


def fibonacci(n: int):
    if n <= 1:
        return 1
    else:
        return fibonacci(n - 1) + fibonacci(n - 2)


def main():
    for i in range(1, 46):
        start_time = time.time()
        ans = fibonacci(i)
        end_time = time.time()
        print("fib,py3,%d,%d" % (i, (end_time - start_time) * 1000))


if __name__ == '__main__':
    main()
