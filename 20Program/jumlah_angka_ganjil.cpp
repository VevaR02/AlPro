#include <iostream>
using namespace std;

int main(){
    int n, jumlah=0;
    cout<<"Masukkan batas angka (Jangan negatif): ";
    cin>>n;

    cout << "Angka ganjil dari 1 hingga " << n << " adalah:" <<endl;

    if (n>=0){
        for (int i = 1; i <= n; i++)
        {
            if (i%2 != 0)
            {
                cout<<i<<" ";
                jumlah += i;
            }
            
        }
        cout<<"\nJika dijumlahkan, jumlahnya adalah "<<jumlah<<endl;

        cout<<endl;
    }else{
        cout<<"Invalid. Tidak boleh negatif!";
        cout<<endl;
    }
    
    return 0;
}
