class Solution {
    public boolean hasDuplicate(int[] nums) {
    //     boolean ans = false;
    //     int cnt = 0;
    //     for(int i=0; i<nums.length-1; i++){
    //         cnt=0;
    //         for(int j=i+1 ; j<nums.length; j++){
    //             if(nums[i]==nums[j]){
    //                 cnt++;
    //             }
    //             if(cnt > 0){
    //                 ans = true;

    //             }
    //         }
    //     }
    //     return ans;
    // }
    Arrays.sort(nums);
    for(int i=1; i<nums.length; i++){
        if(nums[i]==nums[i-1]){
            return true;
        }
    }
    return false;
}
}