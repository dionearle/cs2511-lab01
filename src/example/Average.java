package example;

/**
 * Average example
 * @author Aarthi
 */
public class Average {

        /**
         * Returns the average of an array of numbers
         * @param the array of integer numbers
         * @return the average of the numbers
         */
        public float computeAverage(int[] nums) {
            float result = 0;
            int sum = 0;
            int i;
            for(i = 0; i < nums.length; i++) {
            	sum += nums[i];
            }
            result = (sum / nums.length);
            return result;
        }

        public static void main(String[] args) {

        	int[] array;
        	array = new int[3];
        	
        	array[0] = 1;
        	array[1] = 2;
        	array[2] = 3;
        	Average average = new Average();
			float answer = average.computeAverage(array);
        	
        	System.out.print(answer);
        }
}
