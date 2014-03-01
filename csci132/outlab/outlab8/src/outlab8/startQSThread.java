
package outlab8;

class startQSThread <T extends Comparable <T>> extends Thread {
	int first;
        int last;
	T[] table;
	
	public startQSThread(T[] table, int first, int last) {
		this.first = first;
		this.last = last;
		this.table = table; 
	}
	
        @Override
	public void run() {
        
	QuickSort.quickSort(table, first, last);
	}
}
