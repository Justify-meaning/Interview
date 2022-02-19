package jianzhioffer;

/**
 * @Author Justifymeaning
 * @Date 2021/4/10 21:20
 * @Version 1.0
 */

import java.util.HashMap;
import java.util.Map;

/**简单：数组中出现次数超过一半的数字
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */
public class lab39 {
//    用hashmap来做
    public int majorityElement(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= nums.length - 1; i++){
            if (map.containsKey(nums[i])){
                int temp = map.get(nums[i]);
                if ((temp+1) * 2 > nums.length)
                    return nums[i]; //  判断众数是否已经出现
                map.put(nums[i], temp + 1); //  重新更新数字出现次数
            }else { //  如果是新数字
                map.put(nums[i], 1);
            }
        }
        if(nums.length == 1){   //判断数组长度为1的情况
            return nums[0];
        }
        else{
            return 0;   //  只是为了保证有返回值，实际不会出现此返回
        }

        //或者遍历hashmap，找出值大于数组一般的key，返回
        for(Integer i : map.keySet()){
            if(map.get(i) * 2 > nums.length)
                return i;
        }
        return 0;
    }

}
