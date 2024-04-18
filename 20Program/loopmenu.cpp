#include <iostream>
using namespace std;

int main(){
    int pilih;
    do
    {
        cout<<"-------------------------------------------------------"<<endl;
        cout<<"                       MENU MAKANAN                    "<<endl;
        cout<<"-------------------------------------------------------"<<endl;
        cout<<endl;
        cout<<"1. Nasi Goreng"<<endl;
        cout<<"2. Nasi Uduk"<<endl;
        cout<<"3. Mie Goreng"<<endl;
        cout<<"4. Kwetiaw"<<endl;
        cout<<"5. Keluar"<<endl;
        cout<<endl;
        cout<<"Silakan pilih menu : ";
        cin>>pilih;

        switch (pilih)
        {
        case 1:
            cout<<"Anda memilih Nasi Goreng"<<endl;
            break;
        case 2: 
            cout<<"Anda memilih Nasi Uduk"<<endl;
            break;
        case 3:
            cout<<"Anda memilih Mie Goreng"<<endl;
            break;
        case 4:
            cout<<"Anda memilih Kwetiaw"<<endl;
            break;
        }
        cout<<endl;
    } while (pilih != 5);
    cout<<endl;
    return 0;
}