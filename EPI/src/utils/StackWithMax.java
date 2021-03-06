package utils;

/** Created by Pankaj on 6/11/15. */
/*
 * TODO: An interface with another implementaion
 * with O(1) best case space complexity
 * */
public class StackWithMax extends Stack {
  private Stack max;

  public StackWithMax() {
    max = new Stack();
  }

  public void push(int x) {
    super.push(x);
    try {
      if (max.isEmpty() || max.peek() <= x) max.push(x);
    } catch (Exception e) {
      assert false;
      e.printStackTrace();
    }
  }

  public int peek() throws Exception {
    return super.peek();
  }

  public int pop() throws Exception {
    if (max.isEmpty()) throw new Exception("Max stack should not be empty!");
    if (super.peek() == max.peek()) max.pop();
    return super.pop();
  }

  public int max() throws Exception {
    if (max == null) throw new Exception("Stack is Empty!");
    return max.peek();
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(super.toString());
    if (max != null) sb.append("\n").append(max.toString());
    return sb.toString();
  }
}
