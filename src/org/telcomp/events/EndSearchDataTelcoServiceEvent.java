package org.telcomp.events;

import java.util.HashMap;
import java.util.Random;
import java.io.Serializable;

public final class EndSearchDataTelcoServiceEvent implements Serializable {

	private static final long serialVersionUID = 1L;
	private String identification;
	private boolean commited;

	public EndSearchDataTelcoServiceEvent(HashMap<String, ?> hashMap) {
		id = new Random().nextLong() ^ System.currentTimeMillis();
		this.setIdentification((String) hashMap.get("identification"));
		this.setCommited((boolean) Boolean.parseBoolean((String) hashMap.get("commited")));
	}

	public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null) return false;
		return (o instanceof EndSearchDataTelcoServiceEvent) && ((EndSearchDataTelcoServiceEvent)o).id == id;
	}
	
	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
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
		return "EndSearchDataEvent[" + hashCode() + "]";
	}

	private final long id;
}
