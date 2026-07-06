class Solution {
    public int minMaxGame(int[] nums) {
        int n=nums.length;
        //Keeping Two-Pointers "i" and "j" for having consecutive pairs
        int i=0;
        int j=1;
        //NewNums array of half the original length
        int[] newNums = new int[n/2];
        int index=0;
        while(j<n){
            //Check which operation to be performed
            if(index%2==0){
                newNums[index] = Math.min(nums[i],nums[j]);
            }else{
                newNums[index] = Math.max(nums[i],nums[j]);
            }
            index++;
            i=i+2;
            j=j+2;
        }
        //Recusive call on the new reduced array.
        //Base case check : If only one element is left, return it.
        return n==1 ? nums[0] : minMaxGame(newNums);
    }
}