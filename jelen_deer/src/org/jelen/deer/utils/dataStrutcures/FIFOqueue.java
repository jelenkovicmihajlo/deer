package org.jelen.deer.utils.dataStrutcures;

import java.util.ArrayList;
import java.util.List;

public class FIFOqueue<T> {
	
	protected List<T> m_que;
	
	public FIFOqueue() {
		m_que=new ArrayList<T>();
	}
	public void push(T element) {
		m_que.add(element);
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
	/*Stack<String> STACK = new Stack<String>();
	STACK.push(line);*/
	/*String[] m_que = list.toArray(new String[list.size()])
	String[] que = new String[toarray.size()];*/
}
