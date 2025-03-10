#include<iostream>
#include<algorithm>
using namespace std;

int main() {
    int count = 0;
    string name;
    cin >> name;
    sort(name.begin(), name.end());
    for (int i = 0; i < name.length()-1; i++) {
        if(name[i] != name[i+1]){
            count++;
        }
    }
    count++;
    if (count % 2 == 0) {
        cout << "CHAT WITH HER!";
    }else{
        cout << "IGNORE HIM!";
    }   
}