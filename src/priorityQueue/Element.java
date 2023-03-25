package priorityQueue;

public class Element<T> {

	T val;
	int priority;
	
	Element(T val, int priority){
		this.priority = priority;
		this.val = val;
	}
}
