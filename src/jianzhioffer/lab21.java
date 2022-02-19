package jianzhioffer;

/**
 * @Author Justifymeaning
 * @Date 2021/3/23 20:05
 * @Version 1.0
 */


/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 */
public class lab21 {
//    超时
    public int[] exchange(int[] nums) {
        int i = nums.length - 1;
        while (i > 0){
            if (nums[i] % 2 != 0) {
                for (int j = 0; j < i; j++) {
                    if (nums[j] % 2 == 0) {
                        int temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                    }
                }
            }
            i--;
        }
        return nums;
    }
//    左右双指针
    public  int[] exchange2(int[] nums){
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if ((nums[left] & 1) != 0) {    //  表示是奇数   无需执行后续 跳出本次循环 左指针右移
                left ++;
                continue;
            }
            if ((nums[right] & 1) != 1) {   //  表示是偶数   无需执行后续 跳出本次循环 右指针左移
                right --;
                continue;
            }
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        return nums;
    }
//  暴力互换元素，会更改元素顺序
    public int[] exchange3(int[] nums) {
        int i=0,j=0;
        while(j<nums.length){
            if((nums[j]&1)!=0){
                int tmp=nums[i];
                nums[i]=nums[j];
                nums[j]=tmp;
                i++;
            }
            j++;
        }
        return nums;
    }

}
