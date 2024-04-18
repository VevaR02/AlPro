#include <iostream>
using namespace std;
int main()
{
    int tinggiLaki, tinggiPerempuan;
    char jenis_kelamin;
    cout<<endl;
    cout<<"=========================================================="<<endl;
    cout<<"                    Program Kelulusan Kerja               "<<endl;
    cout<<"=========================================================="<<endl;
    cout<<endl;
    cout<<"Pilih jenis kelamin anda Laki-Laki atau Perempuan (L/P): ";
    cin>>jenis_kelamin;
    cout<<endl;
    switch (jenis_kelamin)
    {
    case 'L':
        cout<<"------Syarat Kelulusan Laki-Laki------"<<endl;
        cout<<"Masukkan tinggi badan anda (dalam cm): ";
        cin>>tinggiLaki;
        if (tinggiLaki>=165)
        {
            cout<<"Selamat anda dinyatakan lulus."<<endl;
        }else{
            cout<<"Maaf anda tidak memenuhi syarat kelulusan."<<endl;
        }
        break;
    
    case 'P':
        cout<<"------Syarat Kelulusan Perempuan------"<<endl;
        cout<<"Masukkan tinggi badan anda (dalam cm): ";
        cin>>tinggiPerempuan;
        if (tinggiPerempuan>=160)
        {
            cout<<"Selamat anda dinyatakan lulus."<<endl;
        }else{
            cout<<"Maaf anda tidak memenuhi syarat kelulusan."<<endl;
        }
        break;

    default:
        cout<<"Masukkan anda tidak valid."<<endl;
        break;
    }
    cout<<endl;
    return 0;
}
