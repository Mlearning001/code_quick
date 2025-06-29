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

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> resMap = new HashMap<>();
        for (String str : strs) {
            String sortStr = sortStr(str);
            if (resMap.containsKey(sortStr)){
                resMap.get(sortStr).add(str);
            }else {
                List<String> list = new ArrayList<>();
                list.add(str);
                resMap.put(sortStr,list);
            }
        }
        return new ArrayList<>(resMap.values());
    }

    /**
     * 将这个str中的字母从小到大重新排列进行排序
     * @param str
     * @return
     */
    private String sortStr(String str){
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }


}