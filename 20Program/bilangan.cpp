#include <iostream>
using namespace std;
int main()
{
    int a, b;
    cout<<"Masukkan bilangan pertama    : ";
    cin>>a;
    cout<<"Masukkan bilangan kedua      : ";
    cin>>b;
    if (a>b){
        cout<<"Bilangan terbesar adalah "<<a<<endl;
    }
        
    else{
        cout<<"Bilangan terbesar adalah "<<b<<endl;
    }
    cout<<endl;
    return 0;
}