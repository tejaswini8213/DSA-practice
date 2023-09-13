class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
      Map<Integer,Integer> findMap= new HashMap();
        
        for(int i=0; i<nums.length; i++){
           if(findMap.containsKey(nums[i])){
               return new int[]{findMap.get(nums[i]), i};               
           }
           else{
             int find = target - nums[i];
             findMap.put(find, i);
             
           }
        }
       
        return null;
    }
}
