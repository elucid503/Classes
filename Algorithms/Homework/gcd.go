package main

import "fmt";

func my_gcd(m int, n int) int {

	if n == 0 {

		return m;

	}

	return my_gcd(n, m % n);

}

func main() {

	fmt.Println(my_gcd(60, 24)) // 12
	fmt.Println(my_gcd(48, 18)) // 6

}