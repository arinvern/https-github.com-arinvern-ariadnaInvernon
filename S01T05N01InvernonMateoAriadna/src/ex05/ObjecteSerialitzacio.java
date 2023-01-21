package ex05;

import java.io.Serializable;

public class ObjecteSerialitzacio implements Serializable {

	private Object objecteASerialitzar;

	public ObjecteSerialitzacio(Object objecteASerialitzar) {

		this.setObjecteASerialitzar(objecteASerialitzar);
	}

	public Object getObjecteASerialitzar() {
		return objecteASerialitzar;
	}

	public void setObjecteASerialitzar(Object objecteASerialitzar) {
		this.objecteASerialitzar = objecteASerialitzar;
	}

	@Override
	public String toString() {
		return "ObjecteSerialitzacio [objecteASerialitzar=" + objecteASerialitzar + "]";
	}

}
