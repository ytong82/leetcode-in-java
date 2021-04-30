package rookie.java.leetcode.lt68;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<String> fullJustify(String[] words, int maxWidth) {
		List<String> res = new ArrayList<String>();
		
		List<String> strList = new ArrayList<String>();
		for (int i=0; i<words.length; i++) {
			int tempStrLen = getStrListLen(strList);
			if ( tempStrLen + strList.size() + words[i].length() > maxWidth) {
				res.add(makeStr(strList, maxWidth, false));
				strList.clear();
			}
			strList.add(words[i]);
			if (i == words.length - 1) {
				res.add(makeStr(strList, maxWidth, true));
			} 
		}

        return res;
    }
	
	private int getStrListLen(List<String> strList) {
		int len = 0;
		for (String str : strList) {
			len += str.length();
		}
		return len; 
	}
	
	private String makeStr(List<String> strList, int maxWidth, boolean end) {
		int spaceCount = maxWidth - getStrListLen(strList);
		
		String makeStr = "";
		if (end) {
			spaceCount = spaceCount - (strList.size() - 1);
			for (int i=0; i<strList.size(); i++) {
				if (i != strList.size() - 1) {
					makeStr = makeStr + strList.get(i) + " ";
				} else {
					String spaces = "";
					for (int j=0; j<spaceCount; j++) {
						spaces += " ";
					}
					makeStr = makeStr + strList.get(i) + spaces;
				}
			}
		} else {
			if (strList.size() == 1) {
				String spaces = "";
				for (int j=0; j<spaceCount; j++) {
					spaces += " ";
				}
				makeStr = makeStr + strList.get(0) + spaces;
			} else {
				String[] spaces = new String[strList.size()-1];
				Arrays.fill(spaces, "");
				for (int i=0; i<spaceCount; i++) {
					int index = i % (strList.size() - 1);
					spaces[index] += " ";
				}
				for (int i=0; i<strList.size(); i++) {
					if (i != strList.size() - 1) {
						makeStr = makeStr + strList.get(i) + spaces[i];
					} else {
						makeStr = makeStr + strList.get(i);
					}
				}
			}
		}
		return makeStr;
	}
}
