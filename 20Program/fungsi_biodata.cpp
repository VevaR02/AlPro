#include <iostream>
#include <string>

using namespace std;

void input(), output();

string nim;
string nama;
string jurusan;
string alamat;
string jenkel;

int main() {
 cout<<"INPUT BIODATA"<<endl;
 cout<<"=========================================="<<endl;
 input();
 cout<<"=========================================="<<endl;
 cout<<endl;
 cout<<"BIODATA"<<endl;
 cout<<"=========================================="<<endl;
 output();
 cout<<"=========================================="<<endl;
 return 0;
}

void input() {
 cout<<"Input NIM anda  : "; getline(cin,nim);;
 cout<<"Input Nama anda : "; getline(cin,nama);
 cout<<"Input Jurusan   : "; getline(cin,jurusan);
 cout<<"Input Alamat    : "; getline(cin,alamat);
 cout<<"Input JenKel    : "; getline(cin,jenkel);
}

void output(){
    cout<<"NIM      : "<<nim<<endl;
    cout<<"Nama     : "<<nama<<endl;
    cout<<"Jurusan  : "<<jurusan<<endl;
    cout<<"Alamat   : "<<alamat<<endl;
    cout<<"JenKel   : "<<jenkel<<endl;
    
}
