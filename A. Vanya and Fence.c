#include <iostream>
 
using namespace std;
int n, h,x,c;
int main()
{
    cin>>n;
    cin>>h;
while(n--){
    cin>>x;
    if(x>h)++c;
    ++c;
}
cout<< c;
  return 0;
}