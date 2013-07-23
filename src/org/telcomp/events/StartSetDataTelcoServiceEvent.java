package org.telcomp.events;

import java.util.HashMap;
import java.util.Random;
import java.io.Serializable;

public final class StartSetDataTelcoServiceEvent implements Serializable {

	private static final long serialVersionUID = 1L;
	private String identification;
	private String parameter;
	private String value;

	public StartSetDataTelcoServiceEvent(HashMap<String, ?> hashMap) {
		id = new Random().nextLong() ^ System.currentTimeMillis();
		this.setParameter((String)hashMap.get("parameter"));
		this.setValue((String) hashMap.get("value"));
		this.setIdentification((String) hashMap.get("identification"));
	}

	public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null) return false;
		return (o instanceof StartSetDataTelcoServiceEvent) && ((StartSetDataTelcoServiceEvent)o).id == id;
	}
	
	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getParameter() {
		return parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int hashCode() {
		return (int) id;
	}
	
	public String toString() {
		return "StartSetDataEvent[" + hashCode() + "]";
	}

	private final long id;
}
