package org.example;

import com.github.pagehelper.util.StringUtil;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        int i = lengthOfLongestSubstring(" ");
        System.out.println(i);
    }
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> strSet = new HashSet<>();
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j <= s.length(); j++) {
                if (j == s.length()){
                    if (j -i>maxLength){
                        maxLength = j-i;
                    }
                    break;
                }
                if (!strSet.contains(s.charAt(j))){
                    strSet.add(s.charAt(j));
                } else {
                    if (j - i > maxLength){
                        maxLength = j -i;
                    }
                    // 因为是有序出现的，那么不用清空全部，只需要把第一个清空，第二个添加就好了
                    strSet.clear();
                    break;
                }
            }
        }
        return maxLength;
    }
}