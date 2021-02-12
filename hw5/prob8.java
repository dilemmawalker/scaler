public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> arr, Interval inter) {
        int n=arr.size();
        int head=inter.start;
        int tail=inter.end;
        ArrayList<Interval>ans=new ArrayList<>();

        for(int i=0;i<n;i++){
            Interval a=arr.get(i);

            int s=a.start;
            int b=a.end;
            if(i==0 && head<s){
                int nn=arr.get(n-1).end;
                if(tail>=nn){
                    ans.add(new Interval(head,tail));
                    break;
                }
                else if(tail<s){
                    ans.add(new Interval(head,tail));
                    ans.add(a);
                    continue;
                }
                while(i<n){
                    Interval nnn=arr.get(i);
                    int ss=nnn.start;
                    int bb=nnn.end;

                    if(tail>=ss && tail<=bb){
                        ans.add(new Interval(head,bb));
                        break;
                    }
                    else if(i+1<n){
                        Interval v=arr.get(i+1);
                        int v1=v.start;
                        int v2=v.end;

                        if(tail >bb && tail<v1){
                        ans.add(new Interval(head,tail));
                        break;
                        }
                    }
                    i++;
                }
            }
            else if(i==n-1 && head>b){      
                ans.add(a);
                ans.add(new Interval(head,tail));
            }
            else if(head>=s && head<=b){
               int nn=arr.get(n-1).end;
                if(tail>=nn){
                    ans.add(new Interval(s,tail));
                    break;
                }
                while(i<n){
                    Interval nnn=arr.get(i);
                    int ss=nnn.start;
                    int bb=nnn.end;

                    if(tail>=ss && tail<=bb){
                        ans.add(new Interval(s,bb));
                        break;
                    }
                    else if(i+1<n){
                        Interval v=arr.get(i+1);
                        int v1=v.start;
                        int v2=v.end;

                        if(tail >bb && tail<v1){
                        ans.add(new Interval(s,tail));
                        break;
                        }
                    }
                    i++;
                }
            }
            else if(i+1<n && head>arr.get(i).end && head<arr.get(i+1).start){
                ans.add(a);
                int nn=arr.get(n-1).end;
                if(tail>=nn){
                    ans.add(new Interval(head,tail));
                    break;
                }
                while(i<n){
                    Interval nnn=arr.get(i);
                    int ss=nnn.start;
                    int bb=nnn.end;

                    if(tail>=ss && tail<=bb){
                        ans.add(new Interval(head,bb));
                        break;
                    }
                    else if(i+1<n){
                        Interval v=arr.get(i+1);
                        int v1=v.start;
                        int v2=v.end;

                        if(tail >bb && tail<v1){
                        ans.add(new Interval(head,tail));
                        break;
                        }
                    }
                    i++;
                }
            }

            else{
                ans.add(a);
            }
        }
        if(n==0){
            ans.add(inter);
        }
        
        return ans;
    }
}