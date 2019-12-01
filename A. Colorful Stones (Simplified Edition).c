 #include <bits/stdc++.h>
 
using namespace std;
int c;
string str ,ins;
int main(){
 
cin>>str>>ins;
for(int i=0,j=0;i<ins.length();++i){
    if(str[j]==ins[i]){
        ++j;
        ++c;
    }
 
}
    cout<<++c;
 
    return 0;
}
 