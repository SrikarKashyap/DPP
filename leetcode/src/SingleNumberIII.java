/** https://leetcode.com/problems/single-number-iii Created by pankaj on 16/03/17. */
public class SingleNumberIII {
  public int[] singleNumber(int[] nums) {
    int x = 0;
    for (int n : nums) x ^= n;
    int mask = x & -x; // get the last bit set in x
    int a = 0, b = 0;
    for (int n : nums) {
      if ((n & mask) != 0) a ^= n;
      else b ^= n;
    }
    return new int[] {a, b};
  }
}
