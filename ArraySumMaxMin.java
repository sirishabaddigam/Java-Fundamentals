// 4_Arrays/ArraySumMaxMin.java
public class ArraySumMaxMin {
    public static void main(String[] args) {
        int[] nums = {5,10,15,20};
        int sum = 0, max = nums[0], min = nums[0];
        for(int n : nums){
            sum += n;
            if(n > max) max = n;
            if(n < min) min = n;
        }
        System.out.println("Sum="+sum+", Max="+max+", Min="+min);
    }
}
