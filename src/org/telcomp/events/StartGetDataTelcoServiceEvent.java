package org.telcomp.events;

import java.util.HashMap;
import java.util.Random;
import java.io.Serializable;

public final class StartGetDataTelcoServiceEvent implements Serializable {

	private static final long serialVersionUID = 1L;
	private String identification;
	private String parameter;

	public StartGetDataTelcoServiceEvent(HashMap<String, ?> hashMap) {
		id = new Random().nextLong() ^ System.currentTimeMillis();
		this.setIdentification((String) hashMap.get("identification"));
		this.setParameter((String)hashMap.get("parameter"));
	}

	public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null) return false;
		return (o instanceof StartGetDataTelcoServiceEvent) && ((StartGetDataTelcoServiceEvent)o).id == id;
	}
	
	public String getParameter() {
		return parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public int hashCode() {
		return (int) id;
	}
	
	public String toString() {
		return "StarGetDataEvent[" + hashCode() + "]";
	}

	private final long id;
}
