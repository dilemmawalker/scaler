bool check(vector<int> &abc)
{
    for(int i=1;i<abc.size();i++)
    {
        if(abc[i]!=i && abc[i]!=0)
            return false;
    }
    return true;
}

bool traverse(string strr,int &falgg,string &ans,int s,int idx, vector<int> &abc)
{
    if(s==idx)
        return check(abc);
    int i=0;
    if(!falgg){
        i=strr[idx]-'0';
    }
    else{
        i=1;
    }
    for(i=i;i<=9;i++)
    {
        if(abc[i]<i)
            break;
    }

    for(;i<=s && i<=9;i++)
    {
        ans.push_back(i+'0');
        abc[i]++;

        if(i>strr[0])
            falgg=1;

        bool temp=traverse(strr,falgg,ans,s,idx+1,abc);
        if(temp )
            return true;

        ans.pop_back();
        abc[i]--;
    }
    return false;
}

long long beautifulNumber (long long N) {
    string strr=to_string(N);
    int s=strr.size();
    if(stol(maxx(s),nullptr,10)<=N)
        return stol(minn(s+1),nullptr,10);

    int falgg=0;
    vector<int> abc(s+1,0);
    string ans="";

    for(int i=strr[0]-'0'; i<=s && i<=9;i++)
    {
        ans.push_back(i+'0');
        abc[i]++;

        if(i>strr[0])
            falgg=1;

        bool temp=traverse(strr,falgg,ans,s,1,abc);
        if(temp)
            return stol(ans);

        ans.pop_back();
        abc[i]--;
    }
    return -1;
}














string maxx(int n)
{
    string str="";
    if(n>9)
    {
        for(int i=0;i<9;i++)
        {
            str.push_back('9');
        }
        int m=n-9;
        for(int i=0;i<m;i++)
        {
            str.push_back(m+'0');
        }
        return str;
    }
    for(int i=0;i<n;i++)
    {
        str.push_back(n+'0');
    }
    return str;


}

string minn(int n)
{
    string str="";

    if(n==2)
    {
        return "22";
    }
    else if(n<11)
    {
        str.push_back('1');
        int m=n-1;
        for(int i=0;i<m;i++)
        {
            str.push_back(m+'0');
        }
        return str;
    }
    else if(n==11)
    {
        str.push_back('1');
        str.push_back('2');
        str.push_back('2');
        for(int i=0;i<8;i++)
        {
            str.push_back('8');
        }
    }

    else if(n==12)
    {
        str.push_back('1');
        str.push_back('2');
        str.push_back('2');
        for(int i=0;i<9;i++)
        {
            str.push_back('9');
        }
    }
    else if(n==13)
    {
        str.push_back('1');
        str.push_back('3');
        str.push_back('3');
        str.push_back('3');
        for(int i=0;i<9;i++)
        {
            str.push_back('9');
        }
    }

    return str;


}