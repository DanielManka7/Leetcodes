class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        String substring = "";
        String maxstring = "";
        for (int left=0; left<s.length();left++)
        {
            for (int right = left; right<s.length(); right++)
            {
                char ch = s.charAt(right);
                if (substring.indexOf(ch) != -1)
                {
                    break;
                }
                else
                {
                    substring = substring + ch;
                }
            }
            if (substring.length()>maxstring.length())
            {
                maxstring = substring;
            }
            substring = "";
        }
        return maxstring.length();
    }
}
