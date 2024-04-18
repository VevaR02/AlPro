#include <iostream>

using namespace std;

int main() {
  int total = 0;
  int jumlah = 0;
  cout<<endl;
  int i = 0;
  do
  {
    if (i%2!=0)
    {
        cout<<i<<" ";
        jumlah += i;
        total++;
    }
    i++;
  } while (i<=50);
  
  
  
  cout<<endl;
  cout<<endl;
  cout << "Total bilangan ganjil dari 0 sampai dengan 50 adalah: " << total << endl;
  cout << "Jumlah bilangan ganjil dari 0 sampai dengan 50 adalah: " << jumlah << endl;
  cout<<endl;
  return 0;
}