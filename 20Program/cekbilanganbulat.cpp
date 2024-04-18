#include <iostream>
using namespace std;
int main()
{
    int a;
    cout<<"Masukkan bilangan : ";
    cin>>a;
    
    if (a>0){
        cout<<"Bilangan Positif"<<endl;
    }else if(a<0){
        cout<<"Bilangan Negatif"<<endl;
    }
    else{
        cout<<"Nol"<<endl;
    }
    cout<<endl;
    return 0;
} 