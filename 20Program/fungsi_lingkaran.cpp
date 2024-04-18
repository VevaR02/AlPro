#include <iostream>
using namespace std;

double luas_lingkaran(double r);

main(){
    double x, y;
    cout<<"Masukkan jari-jari   : "; cin>>x;
    y = luas_lingkaran(x);
    cout<<"Luas Lingkaran       = "<<y;

}

double luas_lingkaran (double r){
    double luas;
    luas = 3.14 * (r * r);
    return (luas);
}