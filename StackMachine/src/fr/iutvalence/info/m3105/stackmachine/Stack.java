package fr.iutvalence.info.m3105.stackmachine;

public class Stack {

	private final int values[];
	private int pos;
	private final int size;
	
	public Stack(int size) throws InvalidParametersException{
		super();
		if (size < 0){
			throw new InvalidParametersException();
		}
		this.size = size;
		values = new int[size];
		pos = -1;
	}

	public void push(int read) throws StackOverflowException {
		pos++;
		values[pos] = read;	
	}

	public int pop() throws StackUnderflowException {
		int ret = values[pos];
		values[pos] = 0;
		pos--;		
		return ret;
	}

	public void dup() {
		values[pos+1] = values[pos];
		pos++;
	}
	
	
}