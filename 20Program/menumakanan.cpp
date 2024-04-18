#include <iostream>
using namespace std;
int main()
{
    int menu;
    cout<<endl;
    cout<<"=========================================================="<<endl;
    cout<<"                          MENU MAKANAN                    "<<endl;
    cout<<"=========================================================="<<endl;
    cout<<endl;
    cout<<"1 Nasi Goreng   harga Rp. 11.000,-"<<endl;
    cout<<"2 Nasi Kuning   harga Rp. 8.000,-"<<endl;
    cout<<"3 Nasi Uduk     harga Rp. 7.500,-"<<endl;
    cout<<"4 Nasi Padang   harga Rp. 15.000,-"<<endl;
    cout<<endl;
    cout<<"Pilih menu makanan: ";
    cin>>menu;
    cout<<endl;
    switch (menu)
    {
    case 1:
        cout<<"Anda memilih Nasi Goreng..."<<endl;
        cout<<"Harga Rp. 11.000,-"<<endl;
        break;
    
    case 2:
        cout<<"Anda memilih Nasi Kuning..."<<endl;
        cout<<"Harga Rp. 8.000,-"<<endl;
        break;

    case 3:
        cout<<"Anda memilih Nasi Uduk..."<<endl;
        cout<<"Harga Rp. 7.500,-"<<endl;
        break;

    case 5:
        cout<<"Anda memilih Nasi Padang..."<<endl;
        cout<<"Harga Rp. 15.000,-"<<endl;
        break;

    default:
        cout<<"Pilihan anda tidak valid."<<endl;
        break;
    }
    cout<<endl;
    return 0;
}
