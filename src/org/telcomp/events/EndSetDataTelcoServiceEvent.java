package org.telcomp.events;

import java.util.HashMap;
import java.util.Random;
import java.io.Serializable;

public final class EndSetDataTelcoServiceEvent implements Serializable {

	private static final long serialVersionUID = 1L;
	private boolean commited;
	

	public EndSetDataTelcoServiceEvent(HashMap<String, ?> hashMap) {
		id = new Random().nextLong() ^ System.currentTimeMillis();
		this.setCommited((boolean) Boolean.parseBoolean((String) hashMap.get("commited")));
	}

	public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null) return false;
		return (o instanceof EndSetDataTelcoServiceEvent) && ((EndSetDataTelcoServiceEvent)o).id == id;
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
		return "EndSetDataEventEvent[" + hashCode() + "]";
	}

	private final long id;
}
