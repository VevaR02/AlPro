#include <iostream>

using namespace std;

int main() {
  int total = 0;
  int jumlah = 0;
  cout<<endl;
  int i = 0;
  while (i<=50)
  {
    if (i%2==0)
    {
        cout<<i<<" ";
        jumlah += i;
        total++;
    }
    i++;
  }
  
  cout<<endl;
  cout<<endl;
  cout << "Total bilangan genap dari 0 sampai dengan 50 adalah: " << total-1 << endl;
  cout << "Jumlah bilangan genap dari 0 sampai dengan 50 adalah: " << jumlah << endl;
  cout<<endl;
  return 0;
}