package priv.szq.base.day4_23Hw;

import java.util.Stack;

public class HomeWork1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		Stack s = new Stack();
		s.push("a");
		s.push("b");
		s.push("c");
		s.push("d");
		s.push("e");
		s.push("f");
		s.push("g");
		s.push("h");
		s.push("i");
		s.push("j");
		s.push("k");
		int size = s.size();
		for (int i = 0; i < size; i++) {
			sb.append(s.pop());
		}
		System.out.println(sb);
	}

}
