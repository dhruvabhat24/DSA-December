import java.awt.*;
import java.math.BigInteger;
import java.util.*;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.function.Function.identity;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        if (strs.length == 0) {
            return "";
        }else if(strs.length == 1){
            return strs[0];
        }
        Optional value = Arrays.stream(strs).filter(str -> str == null || str.length() == 0).findAny();
        if (value.isPresent())
            return "";
        int i = 0;
        while (i<strs[0].length()) {
            char val = strs[0].charAt(i);
            for (String str : strs) {
                if (str.length()<=i ||val != str.charAt(i)) {
                    return res.toString();
                }
            }
            res.append(val);
            i++;
        }
        return res.toString();
    }
  }
