class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {

        List<List<Integer>> result  =  new ArrayList<>();

        start(nums, target ,0, 0 ,result,new ArrayList<>());
        return result;
        
    }

     public void start(int[] nums, int target, int start ,int sum , List<List<Integer>>  result ,List<Integer> currentList) {
 
        
        if(target == sum) {
            result.add(new ArrayList<>(currentList)) ;
            return ;

        }
            if(sum > target) {
                return ;
            }

            for(int i = start ; i<nums.length ;i++ ){
            sum = sum + nums[i] ;
            currentList.add(nums[i]);
            
            start(nums, target , i ,sum ,result ,currentList);
            sum  = sum - nums[i] ;
            currentList.remove(currentList.size()-1) ;
            }
            
            
        
        
    }
}
