c-=2;
        n=(int)Math.pow(10,c);
        int a=0;
        while(n>0){
         a+=(no/n)*(n/10);
        a+=Math.min(Math.max((no%n -(n/10)+1),0),10);
        no/=10;
        n/=10;
        }