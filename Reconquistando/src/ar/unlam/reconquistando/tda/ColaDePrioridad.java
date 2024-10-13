package ar.unlam.reconquistando.tda;

import java.util.Comparator;

public class ColaDePrioridad<T> {
	private T[] heap;
    private int size = 0;

	private Comparator<T> comparator;
    
    @SuppressWarnings("unchecked")
	public ColaDePrioridad(int capacity, Comparator<T> comparator) {
        heap = (T[]) new Object[capacity];
        this.comparator = comparator;
    }
    
    private int leftChild(int i) { 
    	return 2 * i + 1; 
    }
    
    private int rightChild(int i) { 
    	return 2 * i + 2; 
    }
    
    private int parent(int i) { 
    	return ( i - 1 ) / 2;   
    }
    
    public void insert(T x) {
        heap[size++] = x;
        heapifyUp(size-1);
    }
    
    private void heapifyUp(int i) {
    	while (i > 0 && comparator.compare(heap[parent(i)], heap[i]) > 0) {
            swap(i, parent(i));
            i = parent(i);
        }
    }
    
    public T extractMax() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        T max = heap[0];
        heap[0] = heap[size-1];
        size--;
        heapifyDown(0);   

        return max;   
    }
    
    private void heapifyDown(int i) {
        int largest = i;
        int left = leftChild(i);
        int right = rightChild(i);

        if (left < size && comparator.compare(heap[left], heap[largest]) < 0) {
            largest = left;
        }
        if (right < size && comparator.compare(heap[right], heap[largest]) < 0) {
            largest = right;
        }

        if (largest != i) {
            swap(i, largest);
            heapifyDown(largest);
        }
    }
    
    private void swap(int i, int j) {
        T temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
    
    public boolean isEmpty() {
    	return this.size == 0;
    }

}
