package ex02;

import java.util.ArrayList;

public class GenericMethods<T> {

	private T argument1, argument2, argument3;

	public GenericMethods(T argument1, T argument2, T argument3) {

		this.argument1 = argument1;
		this.argument2 = argument2;
		this.argument3 = argument3;
	}

	@Override
	public String toString() {
		return "GenericMethods [argument1=" + argument1 + ", argument2=" + argument2 + ", argument3=" + argument3 + "]";
	}

	
}
