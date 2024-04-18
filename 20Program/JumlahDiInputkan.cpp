#include <iostream>

using namespace std;

int main() {
  int jumlahBilangan = 0;
  int totalBilangan = 0;
  int bilangan;

  do {
    cout << "Masukkan bilangan (0 untuk keluar): ";
    cin >> bilangan;
    totalBilangan++;
    jumlahBilangan+= bilangan;
  } while (bilangan != 0);

    cout << "Total bilangan yang diinputkan adalah: " << totalBilangan-1<< endl;
    cout << "Jumlah bilangan yang diinputkan adalah: " << jumlahBilangan<< endl;

  return 0;
}
