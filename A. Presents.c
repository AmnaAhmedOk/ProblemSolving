#include <iostream>
using namespace std;
int main() {
	int n,arr[109],x;
     scanf("%d",&n);
     for(int i =1; i<=n;++i){
         scanf("%d",&x);
    	 arr[x]=i;
     }
     for(int i =1; i<=n;++i)
         printf("%d ",arr[i]);
	    return 0;
}