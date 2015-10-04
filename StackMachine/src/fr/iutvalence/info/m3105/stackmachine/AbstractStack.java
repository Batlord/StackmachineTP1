package fr.iutvalence.info.m3105.stackmachine;

public class AbstractStack {

	private final WordSize values[];
	private int size;
	int pos;

	public AbstractStack(int size) {
		// TODO Auto-generated constructor stub
		super();
		this.size = size;
		values = (WordSize[]) new Object[size];
		pos = -1;
	}
	public void push(WordSize value) throws StackOverflowException{
		pos++;
		values[pos] = value;		
	}
	
	public WordSize pop() throws StackUnderflowException{
		WordSize ret;
		try {
			ret = values[pos];
		}
		catch (ArrayIndexOutOfBoundsException e) {
			throw new StackUnderflowException(e);
		}
		values[pos] = null;
		pos--;		
		return ret;
	}
	
	public boolean isEmpty(){
		return pos != -1 ? false : true;
	}
		
	public int getNbValues(){
		return pos;
	}
	
	public WordSize peek(){
		return values[pos];
	}
	
	public void clear() {
		for(int i=0;i<size;i++){
			values[i] = null;
		}
		pos = -1;
	}
	
	public void dup() throws StackOverflowException{
		values[pos+1] = values[pos];
		pos++;
	}


}
