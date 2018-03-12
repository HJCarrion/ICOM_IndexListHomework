package hw_main;

import java.util.NoSuchElementException;

public interface MyIndexList<E> {
	
	int size();
	boolean isEmpty(); 
	void add(E e);
	void remove(E e) throws NoSuchElementException;
	E get(int index) throws IndexOutOfBoundsException;
	
}
