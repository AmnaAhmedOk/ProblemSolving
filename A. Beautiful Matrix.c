#include <iostream>
#include <cmath>
 
using namespace std;
int n,arr[5][5];
int main()
{
   for(int i=0;i<5;++i){
       for(int j=0;j<5;++j){
           cin>> arr[i][j];
        if(arr[i][j]==1){
            n= abs(j-2)+abs(i-2);
         cout <<n;
 
       }
 
       }
   }
  return 0;
}