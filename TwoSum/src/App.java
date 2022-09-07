public class App {
    public static void main(String[] args) throws Exception {

        //ENTERING THE ARRAY INPUT AND OUR SUM TARGET VALUE
        int[] input = {5,6,8,5,4,6,7,4};
        int target = 9;

        //CALLING THE FUNCTION 
        int[] result = twoSum(input, target);

        //RETURNING THE POSITION OF VALUES WITH SUM EQUALS TO TARGET
        for (int i=0; i < result.length; i++) {
            System.out.println(result[i]);
        }

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
