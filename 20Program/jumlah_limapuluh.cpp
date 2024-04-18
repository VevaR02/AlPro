#include <iostream>

using namespace std;

int main() {
  int jumlah = 0;
  int total = 0;
  cout<<endl;
  for (int i = 0; i <= 50; i++) {
    cout<<i<<" ";
    total++;
    jumlah += i;
  }
  cout<<endl;
  cout<<endl;
  cout << "Total bilangan bulat positif dari 0 sampai dengan 50 adalah: " << total-1 << endl;
  cout << "Jumlah bilangan bulat positif dari 0 sampai dengan 50 adalah: " << jumlah << endl;
  cout<<endl;
  return 0;
}