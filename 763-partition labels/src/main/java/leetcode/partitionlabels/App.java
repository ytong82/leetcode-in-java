package leetcode.partitionlabels;

import java.util.Arrays;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        String S = "ababcbacadefegdehijhklij";
        Solution solution = new Solution();
        List<Integer> res = solution.partitionLabels(S);
        System.out.println(Arrays.toString(res.toArray()));
    }
}
