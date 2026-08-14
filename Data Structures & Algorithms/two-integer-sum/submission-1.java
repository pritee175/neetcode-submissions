class Solution {
    public int[] twoSum(int[] nums, int target) {
    //     for(int i=0; i<nums.length-1; i++){
    //         for(int j=i+1; j<nums.length; j++)
    //         if(nums[i]+nums[j]==target){
    //             return new int[]{i,j};
    //         }
    //     }
    //     return new int[]{-1};
        
    // }
    HashMap<Integer, Integer> look = new HashMap<>();
    for(int i=0; i<nums.length; i++){
        look.put(nums[i], i);
    }
    for(int j=0;j<nums.length; j++){
        int diff = target - nums[j];
        if(look.containsKey(diff) && look.get(diff)!= j){
            return new int []{j,look.get(diff)};
        }
    } return new int [0];
}
}
