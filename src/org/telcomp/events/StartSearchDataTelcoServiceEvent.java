package org.telcomp.events;

import java.util.HashMap;
import java.util.Random;
import java.io.Serializable;

public final class StartSearchDataTelcoServiceEvent implements Serializable {

	private static final long serialVersionUID = 1L;
	private String parameter;
	private String value;

	public StartSearchDataTelcoServiceEvent(HashMap<String, ?> hashMap) {
		id = new Random().nextLong() ^ System.currentTimeMillis();
		this.setParameter((String)hashMap.get("parameter"));
		this.setValue((String) hashMap.get("value"));
	}

	public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null) return false;
		return (o instanceof StartSearchDataTelcoServiceEvent) && ((StartSearchDataTelcoServiceEvent)o).id == id;
	}
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getParameter() {
		return parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	public int hashCode() {
		return (int) id;
	}
	
	public String toString() {
		return "StartSearchDataEvent[" + hashCode() + "]";
	}

	private final long id;
}
