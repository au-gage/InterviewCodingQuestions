/**
 * This method finds the longest substring in a string that contains no repeating characters, and returns the length of that string
 * 
 * A nested for loop just runs through each starting index until it finds a character that is already contained in the string, or reaches the end of the string
 * It then compares the length of that substring to the current longest length, if it is larger it replaces the largest value, then loops again
 *
 * @author (Austin Gage)
 * @version (5/31/21)
 */
class RepeatingString {
    public static int lengthOfLongestSubstring(String s) {
        int longestLength = 0;
        String substring = "";
        if(s.length() == 1)
            return 1;
        for(int i = 0;i < s.length()-1;i++)
        {
            for(int j = i+1;j < s.length();j++)
            {
                char myChar = s.charAt(j);
                if(j == i+1)
                    substring += s.substring(i,j);
                if(substring.contains(s.substring(j,j+1)))
                {
                    break;
                }
                else
                {
                    substring += s.substring(j,j+1);
                }
            }
            if(substring.length() > longestLength)
                longestLength = substring.length();
            substring = "";
        }
        return longestLength;
    }
}
