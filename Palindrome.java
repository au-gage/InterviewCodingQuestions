
/**
 * Write a description of class Palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Palindrome
{
    public static String longestPalindrome(String s) {
        String palindrome = s.substring(0,1);
        String currentPal = "";
        int offset = 0;
        if(s.length() <= 1)
        {
            return s;
        }
        for(int i = 0;i < s.length();i++)
        {
            offset = 0;
            for(int j = s.length()-1;j >= i;j--)
            { 
                if(i+offset > j || i+offset ==s.length())
                {
                    currentPal = s.substring(i,j+offset+1);
                    if(currentPal.length() > palindrome.length())
                    {
                        palindrome = currentPal;
                        if(palindrome.length() > s.length()/2)
                        {
                            return palindrome;
                        }
                    }
                }
                else if(s.substring(i + offset,i+offset+1).equals(s.substring(j,j+1)))
                {
                    offset++;   
                }
                else
                {
                    j+=offset;
                    offset = 0;
                    currentPal = "";
                }
            }
            
        }
        return palindrome;
    }
}

