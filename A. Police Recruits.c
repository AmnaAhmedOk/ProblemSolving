#include <iostream>
 
using namespace std;
int n,x,c,pos;
int main()
{
    cin>>n;
while(n--){
    cin>>x;
    if (x==-1){
        if(pos>0)--pos;
        else ++c;
    }
    else
        pos +=x;
}
 
cout<<c;
    return 0;
}