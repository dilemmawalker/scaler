
// int a=0;
// while(input3>0){
//     a=Math.min(a,input3%10);
//     input3/=10;
// }

// int ans=(input1/1000 * (input2/100)%10)+a;
// return ans;

int n=input1.length;
int m=input2.length;
HashMap<Integer,Integer>map=new HashMap<>();
ArrayList<Integer>ar=new ArrayList<>();
for(int i=0;i<n;i++){
    int a=input1[i];
    if(map.containsKey(a)){
        map.put(a,2);
    }
    else{
        map.put(a,1);
        ar.add(a);
    }
}
for(int i=0;i<m;i++){
    int a=input2[i];
    if(map.containsKey(a)){
        map.put(a,2);
    }
    else{
        map.put(a,1);
        ar.add(a);
    }
}

long sum=0l;
for(int i=0;i<ar.size();i++){
    int a=ar.get(i);
    if(map.containsKey(a)==1){
        sum+=a;
    }
}

while(sum>0 && sum>=10){

    long a=0l;
    while(sum>0){
        a+=sum%10;
        sum/=10;
    }
    sum=a;
}

return (int)dum;