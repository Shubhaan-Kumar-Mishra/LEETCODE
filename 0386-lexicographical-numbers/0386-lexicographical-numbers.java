class Solution {
    public void dfs(int curr,int n, List<Integer> ans){
        if(curr > n){
            return;
        }
        ans.add(curr);

        for(int i =0;i <= 9;i++){
            int next = curr * 10 + i;
            if(next > n){
                break;
                }
            dfs(next, n, ans);
        }
    }
    public List<Integer> lexicalOrder(int n){
        List<Integer> ans = new ArrayList<>();
        for(int i = 1; i <= 9; i++){
            if(i > n){
            break;

            }
            dfs(i,n,ans);
        }
        return ans;
    }
}