#include <iostream>

using namespace std;

int main() {
  double jumlahBilangan = 0;
  double totalBilangan = 0;
  double rataBilangan = 0;

for (double bilangan; bilangan != 0;)
{
    cout << "Masukkan bilangan (0 untuk keluar): ";
    cin >> bilangan;

    totalBilangan++;
    jumlahBilangan+= bilangan;
    
}
    rataBilangan = jumlahBilangan/(totalBilangan-1);
    cout<<endl;
    cout << "Total bilangan yang diinputkan adalah: " << totalBilangan-1<< endl;
    cout << "Jumlah bilangan yang diinputkan adalah: " << jumlahBilangan<< endl;
    cout << "Rata-rata bilangan yang diinputkan adalah: "<< rataBilangan<<endl;

  return 0;
}
