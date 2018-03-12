package hw_main;

import java.util.NoSuchElementException;

public class HW_IndexList<E> implements MyIndexList<E> {
	
	private int size;
	private E[] elements;
	private static final int INITCAP = 10;
	private static final int CAPTOAR = 10;
	
	public HW_IndexList(){
		this.size = 0;
		elements = (E[]) new Object[INITCAP];
	}
	public int size(){ return size;}
	public boolean isEmpty(){ return size == 0;}
	public void add(E e){
		if(size == elements.length){
			changeCapacity(CAPTOAR);
		}
		elements[size] = e;	
		size++;	
	}
	@Override
	public void remove(E e) throws NoSuchElementException{
		if(!contains(e)){
			throw new NoSuchElementException ("This element doesn't exist in the list");
		}
		
		
		for(int i= 0;i<elements.length;i++){
			if(elements[i] == e){
				for(int j = i; j < elements.length-1;j++){
					elements[j]=elements[j+1];
				}
			 elements[size-1] = null;
			size--;
			}
		} 
		
	}
	
	@Override
	public E get(int index) throws IndexOutOfBoundsException{
		if(index<0 || index > size-1)
			throw new IndexOutOfBoundsException ("Invalid Index: "+index);
		return elements[index];
		
	}
	private void changeCapacity(int change) { 
		int newCapacity = elements.length + change; 
		E[] newElement = (E[]) new Object[newCapacity]; 
		for (int i=0; i<size; i++) { 
			newElement[i] = elements[i]; 
			elements[i] = null; 
		} 
		elements = newElement; 
	}
	
	private void moveDataOnePositionTL(int low, int sup) { 
		// pre: 0 < low <= sup <= (element.length - 1)
		for (int pos = low; pos <= sup; pos++)
			elements[pos-1] = elements[pos]; 
	}
	public boolean contains(E e){
		for(int i = 0; i < elements.length; i++){
			if(elements[i] == e)
				return true;
		}
		return false;
	}

}
