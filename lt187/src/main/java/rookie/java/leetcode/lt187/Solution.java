package rookie.java.leetcode.lt187;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
    	Set<String> dnas = new HashSet<String>();
    	Set<String> rdSeqs = new HashSet<String>();
    	
    	for (int i=0; i<=s.length()-10; i++) {
    		String key = s.substring(i, i+10);
    		if (dnas.contains(key)) {
    			rdSeqs.add(key);
    		} else {
    			dnas.add(key);
    		}
    	}
    	
    	List<String> res = new ArrayList<String>();
    	for (String rdSeq : rdSeqs) {
    		res.add(rdSeq);
    	}
    	
    	return res;
    }
}
