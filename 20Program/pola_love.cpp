#include <iostream>

using namespace std;

int main() {
    int tinggi_bawah = 9;
    int tinggi = 3;
    for (int baris_atas = 1; baris_atas <= tinggi; ++baris_atas) {

        for (int spasi = 1; spasi <= tinggi - baris_atas; ++spasi) {
            cout << "  ";
        }

        for (int bintang = 1; bintang <= baris_atas; ++bintang) {
            cout << " * ";
        }

        for (int spasi = 1; spasi <=2*(tinggi - baris_atas); ++spasi) {
            cout << " ";
        }

        for (int bintang = 1; bintang <= baris_atas; ++bintang) {
                cout << " * ";
        }

        cout << endl; 
    }


    for (int baris = tinggi_bawah; baris >= 1; --baris) {
        
        for (int spasi = 1; spasi <= tinggi_bawah - baris; ++spasi) {
            cout << " ";
        }

        
        for (int bintang = 1; bintang <= baris; ++bintang) {
                cout << "* "; 
        }

        cout << endl; 
    }

    return 0;
}
