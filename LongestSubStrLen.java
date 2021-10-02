/* Given a string s, find the length of the longest substring without repeating characters. */

class LongestSubStrLen {
    public int lengthOfLongestSubstring(String s) {
        if(s=="") return 0;
        int start = 0;
        int end = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        while (end < s.length()) {
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
                end++;
                max = Math.max(set.size(), max);
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }

        return max;
    }
    public static void main(String args[]){
      Scanner s=new Scanner(System.in);
      String str = s.nextLine();
      int n = lengthOfLongestSubstring(str);
      System.out.println(n);
      s.close();
    }
}
