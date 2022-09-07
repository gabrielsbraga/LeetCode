public class App {
    public static void main(String[] args) throws Exception {

    }

    public static int[] twoSum(int[] nums, int target) {
        
        int[] positionReturn = new int[2]; 
        
        for(int i = 0; i <= nums.length - 2; i++) {
            for (int j = i + 1 ; j <= nums.length - 1; j++) {
                
                if (nums[i] + nums[j] == target) {                    
                    positionReturn[0] = i;
                    positionReturn[1] = j;
                }
            }
         }        
        return positionReturn;
    }
}
