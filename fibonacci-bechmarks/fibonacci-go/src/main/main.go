package main

import (
	"fmt"
	"time"
)

func fibonacci(n int) int {
	if n <= 1 {
		return 1
	} else {
		return fibonacci(n - 1) + fibonacci(n - 2)
	}
}

func main() {
	for i := 0; i < 44; i++ {
		startTime := time.Now().UnixNano() / 1000000
		ans := fibonacci(i)
		endTime := time.Now().UnixNano() / 1000000
		fmt.Printf("| %d | %d | %d |\n", i, ans, endTime-startTime)
	}
}
