#include <iostream>
#include <string>
#include <cstdlib>

using namespace std;

string generateCaptcha(int length) {
    string captcha;
    const string characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    for (int i = 0; i < length; ++i) {
        captcha += characters[rand() % characters.length()];
    }
    return captcha;
}

int main() {
    const string username = "veva";
    const string password = "veva12345";

    string inputUsername, inputPassword, inputCaptcha, generatedCaptcha;
    int login;
    int attempts = 0;

    bool keluar = false;
    do
    {
        cout<<endl;
        cout<<"====================================================================="<<endl;
        cout<<"1. LOGIN     \n2. KELUAR       \nPilih: ";
        cin>>login;

        switch (login)
        {
        case 1:
            while (attempts < 3) {
            cout<<endl;
            cout<<"====================================================================="<<endl;
            cout<<"                                 LOGIN                               "<<endl;
            cout<<"====================================================================="<<endl;
            generatedCaptcha = generateCaptcha(6);
            cout << "Kode Captcha       : " << generatedCaptcha << endl;
            cout<<endl;
            cout << "Masukkan username  : ";
            cin >> inputUsername;
            cout << "Masukkan password  : ";
            cin >> inputPassword;
            cout << "Masukkan captcha   : ";
            cin >> inputCaptcha;

            if (inputUsername == username && inputPassword == password && inputCaptcha == generatedCaptcha) {
                cout << "Login berhasil!Terima kasih." << endl;
                keluar=true;
                break;
            } else {
                cout << "Username, password, atau captcha salah. Silakan coba lagi." << endl;
                attempts++;
            }
        }

        if (attempts == 3) {
            cout << "Anda telah mencoba dan gagal 3 kali. Program keluar." << endl;
        }
            break;

        case 2:
            keluar=true;
            break;
        
        default:
            cout<<"Pilihan tidak valid."<<endl;
            break;
        }
    } while (!keluar);

    cout<<endl;
    cout<<"====================================================================="<<endl;
    cout<<endl;
    
    return 0;
}
