package fr.iutvalence.info.m3105.stackmachine;

public class Memory {

	public Memory(int i, int j) throws InvalidParametersException {
		if (i < 0 || j < 0){
			throw new InvalidParametersException();
		}
		// TODO Auto-generated constructor stub
	}

	public int getStartAddress() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void write(int currentAddress, Object opCode) {
		// TODO Auto-generated method stub
		
	}

}
