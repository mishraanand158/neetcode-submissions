class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
    Arrays.sort(candidates);
    List<List<Integer>> result  =  new ArrayList<>() ;
    solution(candidates,target,0,0,new ArrayList<>(),result);
    return result;

    }


  public void solution(int[] can, int target,int start,int sum ,List<Integer> currentList,   List<List<Integer>> result) {

        if(sum == target){
            result.add(new ArrayList<>(currentList));
            return;
        }if(sum> target) {
            return;
        }

        for(int i = start;i<can.length ; i++){

            if(i>start && can[i]== can[i-1]){
                continue;
            }

            sum+= can[i];
            currentList.add(can[i]);
            solution(can,target,i+1,sum,currentList,result);
            sum-= can[i];
            currentList.remove(currentList.size()-1);
        }

    }
        
}
