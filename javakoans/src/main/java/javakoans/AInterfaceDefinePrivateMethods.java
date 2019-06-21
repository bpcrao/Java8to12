package javakoans;

public class AInterfaceDefinePrivateMethods {
	
	//interface can define methods
	public static int getData() { return 1; };
	
	//can define private methods which is common functionality to all Implementations
	private int getPrivateData() { return 1; };

}
