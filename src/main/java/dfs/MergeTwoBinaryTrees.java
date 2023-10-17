package dfs;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoBinaryTrees {
  public int longestPalindrome(String s) {
    HashMap<Character,Integer> map=new HashMap<>();
    for(int i=0;i<s.length();i++){
      map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
    }
    int c=0;
    for(Map.Entry<Character,Integer> e:map.entrySet()){
      if(e.getValue()%2!=0){
        c++;
      }
    }
    if(c>0)
      return s.length()-c+1;
    else
      return s.length();
  }
}
