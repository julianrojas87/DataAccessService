package org.telcomp.events;

import java.util.HashMap;
import java.util.Random;
import java.io.Serializable;

public final class EndGetDataTelcoServiceEvent implements Serializable {
	//Comment
	private static final long serialVersionUID = 1L;
	private String value;
	private boolean commited;

	public EndGetDataTelcoServiceEvent(HashMap<String, ?> hashMap) {
		id = new Random().nextLong() ^ System.currentTimeMillis();
		this.setValue((String) hashMap.get("value"));
		this.setCommited((boolean) Boolean.parseBoolean((String) hashMap.get("commited")));
	}

	public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null) return false;
		return (o instanceof EndGetDataTelcoServiceEvent) && ((EndGetDataTelcoServiceEvent)o).id == id;
	}
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public boolean isCommited() {
		return commited;
	}

	public void setCommited(boolean commited) {
		this.commited = commited;
	}

	public int hashCode() {
		return (int) id;
	}
	
	public String toString() {
		return "EndGetDataEvent[" + hashCode() + "]";
	}

	private final long id;
}
