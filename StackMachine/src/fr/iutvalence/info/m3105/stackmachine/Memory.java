package fr.iutvalence.info.m3105.stackmachine;

public class Memory {

	private final int startAddress;
	private final int endAddress;
	private final int data[];
	
	public Memory(int startAdress, int endAdress) throws InvalidParametersException {
		if (startAdress < 0 || endAdress < 0){
			throw new InvalidParametersException();}
		this.startAddress = startAdress;
		this.endAddress = endAdress;
		this.data = new int[endAdress-startAdress];
	}

	public int getStartAddress() {
		return startAddress;
	}

	public void write(int currentAddress, int opCode) throws AddressOutOfBoundsException {
		data[currentAddress] = opCode;
	}

	public int read(int adress) throws AddressOutOfBoundsException{
		return data[adress];
	}
}
