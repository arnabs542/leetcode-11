// lc 155
import java.util.*;
public class MinStack {
	Stack<Integer> stack = new Stack<>();
	Stack<Integer> min = new Stack<>();
	/** initialize your data structure here. */
	public MinStack() {
		
	}

	public void push(int x) {
		stack.push(x);
		if (min.isEmpty() || min.peek() >= x) {
			min.push(x);
		}
	}

	public void pop() {
		int val = stack.pop();
		if (val == min.peek()) {
			min.pop();
		}
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return min.peek();
	}
}

/**
* Your MinStack object will be instantiated and called as such:
* MinStack obj = new MinStack();
* obj.push(x);
* obj.pop();
* int param_3 = obj.top();
* int param_4 = obj.getMin();
*/