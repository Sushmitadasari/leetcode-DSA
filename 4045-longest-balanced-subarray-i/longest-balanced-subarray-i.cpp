class Solution {
public:
    int longestBalanced(vector<int>& nums) {
        int o=0,e=0,ans=0,n=nums.size();
        for(int i=0;i<n;i++){
            map<int,int> mp;
            o=0,e=0;
            for(int j=i;j<n;j++){
                mp[nums[j]]++;
                if(mp[nums[j]]>1)
                {
                    // if(i==1&&j==n-1)
                    // cout<<e<<" "<<o<<endl;
                    if(o==e)
                    ans=max(ans,(j-i+1));
                    continue;
                }
                if(nums[j]%2!=0)
                o++;
                else
                e++;
                if(i==1&&j==n-1)
                cout<<e<<" "<<o<<endl;
                if(o==e)
                ans=max(ans,(j-i+1));
            }
        }
        return ans;
    }
};