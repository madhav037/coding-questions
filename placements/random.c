#include<stdio.h>
#include <time.h>


unsigned long long int multiply(int count){
    unsigned long long int a = 2;
    while(count--){
        a *= 2;
    }
    return a;
}

void main() {
    clock_t start, end;
    start = clock();
    unsigned long long int len = multiply(64);
    end = clock();

    double time_taken = ((double)(end - start)) / CLOCKS_PER_SEC;
	printf("%llu %f", len, time_taken);
}