#include <iostream>
 
using namespace std;
int n, d,a;
string str;
int main()
{
    cin>>n;
    cin>>str;
    for(int i=0;i<n;++i){
        if(str[i]=='A')++a;
        else ++d;
    }
    if(a>d)
        cout<<"Anton";
    else if(a<d)
        cout<<"Danik";
     else
    cout <<"Friendship";
  return 0;
}