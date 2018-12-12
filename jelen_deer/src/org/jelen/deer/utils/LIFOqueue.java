package org.jelen.deer.utils;

import java.util.ArrayList;
import java.util.List;

public class LIFOqueue<T> {
	protected List<T> m_que;
	public LIFOqueue() {
		m_que=new ArrayList<T>();
	}
	public void push(T element) {
		m_que.add(0, element);;
	}
	public T pull() {
		T element=null;
		element=m_que.remove(0);
		return element;
	}
	public int lenght() {
		int element=m_que.size();
		return element;
	}
	public boolean isempty() {
		boolean space=m_que.isEmpty();
		return space;
	}
}
