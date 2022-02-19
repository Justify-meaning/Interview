//package mianshi;
//
///**
// * @Author Justifymeaning
// * @Date 2021/3/25 15:20
// * @Version 1.0
// */
//
///**
// * 给定一个字符串和匹配模式，_匹配任意字符 %匹配任意字符串 包括空字符串
// */
//public class oppo325_01 {
//    bool isMatchPattern(string testString, string pattern) {
//        // write code here
//        string a =testString;
//        char []test = testString.toCharArray();
//        char []moshi = pattern.toCharArray();
//        for (int i = 0; i < test.length - 1; i++){
//            if (moshi[i] == '%'){
//                return true;
//            }
//            if (test[i] == moshi[i] || moshi[i] == '_'){
//                continue;
//            }
//            else {
//                return false;
//            }
//        }
//
//    }
//}
