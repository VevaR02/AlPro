#include <iostream>
using namespace std;
int main()
{
    int T;
    cout<<endl;
    cout<<"=========================================================="<<endl;
    cout<<" Program Wujud Air dari Standard Temperature and Pressure "<<endl;
    cout<<"=========================================================="<<endl;
    cout<<endl;
    cout<<"Masukkan temperatur air (dalam celcius) T : ";
    cin>>T;
    
    if (T <= 0){
        cout<<"Wujud air adalah Padat"<<endl;
    }else if(T>0 && T<100){
        cout<<"Wujud air adalah Cair"<<endl;
    }
    else if (T>=100)
    {
        cout<<"Wujud air adalah Gas"<<endl;
    }
    cout<<endl;
    return 0;
}
