package jianzhioffer;

//将字符串的空格替换为%20
public class lab05 {
    class Solution {
        //永远滴神
        public String replaceSpace(String s) {
           return s.replaceAll(" ", " %20");
        }
    }

    class Solution2 {
        // 本方法时间服再度为o(n),空间复杂度也为o(n)
        public String replaceSpace(String s) {
            int length = s.length();
            char[] array = new char[length * 3];
            int size = 0;
            for (int i = 0; i < length; i++) {
                char c = s.charAt(i);
                if (c == ' ') {
                    array[size++] = '%';
                    array[size++] = '2';
                    array[size++] = '0';
                } else {
                    array[size++] = c;
                }
            }
            String newStr = new String(array, 0, size);
            return newStr;
        }
    }

    class Solution3{
        public String replaceSpace(String s) {
            StringBuilder res = new StringBuilder();
            for (Character c : s.toCharArray()){
                if (c == ' ')   res.append("%20");
                else res.append(c);
            }
            return res.toString();
        }
    }

}
