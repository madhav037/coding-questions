/*print 1 to n without using loop
input : 10
output : 1 2 3 4 5 6 7 8 9 10*/
#include<iostream>

using namespace std;

int i = 1;
// CODE : no_loop
void no_loop(int n) {
    if (i == n+1){
        return;
    }
    cout << i << " ";
    i = i + 1;
    return no_loop(n);
}

int main() {
    int n = 10;
    no_loop(n);
}
