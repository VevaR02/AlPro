#include <iostream>

using namespace std;

int main() {
  int jumlahBilangan = 0;
  int totalBilangan = 0;
  int bilangan;

  while (bilangan != 0)
  {
    cout << "Masukkan bilangan genap (0 untuk keluar): ";
    cin >> bilangan;

    if (bilangan%2==0)
    {
        totalBilangan++;
        jumlahBilangan+= bilangan;
    }else{
        cout<<"Harap masukkan bilangan genap!"<<endl;
    }
  }

    cout << "Total bilangan genap yang diinputkan adalah: " << totalBilangan-1<< endl;
    cout << "Jumlah bilangan genap yang diinputkan adalah: " << jumlahBilangan<< endl;

  return 0;
}
