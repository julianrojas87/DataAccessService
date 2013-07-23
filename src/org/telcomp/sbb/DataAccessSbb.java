package org.telcomp.sbb;

import java.util.HashMap;

import javax.slee.ActivityContextInterface;
import javax.slee.Address;
import javax.slee.RolledBackContext;
import javax.slee.SbbContext;

import org.telcomp.events.EndGetDataTelcoServiceEvent;
import org.telcomp.events.EndSearchDataTelcoServiceEvent;
import org.telcomp.events.EndSetDataTelcoServiceEvent;
import org.telcomp.events.StartGetDataTelcoServiceEvent;
import org.telcomp.events.StartSearchDataTelcoServiceEvent;
import org.telcomp.events.StartSetDataTelcoServiceEvent;
import org.telcomp.others.UsersInfoManager;

public abstract class DataAccessSbb implements javax.slee.Sbb {

	public void onStartSetDataTelcoServiceEvent(StartSetDataTelcoServiceEvent event, ActivityContextInterface aci) {
		UsersInfoManager uManager = new UsersInfoManager();
		
		if(event.getParameter().equals("sipuri")){
			String rsp = uManager.setSipuri(event.getIdentification(), event.getValue());
			//Setting Output HashMap
			HashMap<String, Object> output = new HashMap<String, Object>();
			
			if(rsp != null){
				output.put("commited", (String) "true");
				EndSetDataTelcoServiceEvent EndEvent = new EndSetDataTelcoServiceEvent(output);
				this.fireEndSetDataTelcoServiceEvent(EndEvent, aci, null);
			} else {
				output.put("commited", (String) "false");
				EndSetDataTelcoServiceEvent EndEvent = new EndSetDataTelcoServiceEvent(output);
				this.fireEndSetDataTelcoServiceEvent(EndEvent, aci, null);
			}
			
		}
		
		if(event.getParameter().equals("state")){
			String rsp = uManager.setState(event.getIdentification(), event.getValue());
			//Setting Output HashMap
			HashMap<String, Object> output = new HashMap<String, Object>();
			
			if(rsp != null){
				output.put("commited", (String) "true");
				EndSetDataTelcoServiceEvent EndEvent = new EndSetDataTelcoServiceEvent(output);
				this.fireEndSetDataTelcoServiceEvent(EndEvent, aci, null);
			} else {
				output.put("commited", (String) "false");
				EndSetDataTelcoServiceEvent EndEvent = new EndSetDataTelcoServiceEvent(output);
				this.fireEndSetDataTelcoServiceEvent(EndEvent, aci, null);
			}
		}
		
		if(event.getParameter().equals("email")){
			String rsp = uManager.setEmail(event.getIdentification(), event.getValue());
			//Setting Output HashMap
			HashMap<String, Object> output = new HashMap<String, Object>();
			
			if(rsp != null){
				output.put("commited", (String) "true");
				EndSetDataTelcoServiceEvent EndEvent = new EndSetDataTelcoServiceEvent(output);
				this.fireEndSetDataTelcoServiceEvent(EndEvent, aci, null);
			} else {
				output.put("commited", (String) "false");
				EndSetDataTelcoServiceEvent EndEvent = new EndSetDataTelcoServiceEvent(output);
				this.fireEndSetDataTelcoServiceEvent(EndEvent, aci, null);
			}
		}
		
		if(event.getParameter().equals("username")){
			String rsp = uManager.setUsername(event.getIdentification(), event.getValue());
			//Setting Output HashMap
			HashMap<String, Object> output = new HashMap<String, Object>();
			
			if(rsp != null){
				output.put("commited", (String) "true");
				EndSetDataTelcoServiceEvent EndEvent = new EndSetDataTelcoServiceEvent(output);
				this.fireEndSetDataTelcoServiceEvent(EndEvent, aci, null);
			} else {
				output.put("commited", (String) "false");
				EndSetDataTelcoServiceEvent EndEvent = new EndSetDataTelcoServiceEvent(output);
				this.fireEndSetDataTelcoServiceEvent(EndEvent, aci, null);
			}
		}
		
		if(event.getParameter().equals("phone")){
			String rsp = uManager.setPhone(event.getIdentification(), event.getValue());
			//Setting Output HashMap
			HashMap<String, Object> output = new HashMap<String, Object>();
			
			if(rsp != null){
				output.put("commited", (String) "true");
				EndSetDataTelcoServiceEvent EndEvent = new EndSetDataTelcoServiceEvent(output);
				this.fireEndSetDataTelcoServiceEvent(EndEvent, aci, null);
			} else {
				output.put("commited", (String) "false");
				EndSetDataTelcoServiceEvent EndEvent = new EndSetDataTelcoServiceEvent(output);
				this.fireEndSetDataTelcoServiceEvent(EndEvent, aci, null);
			}
		}
		
		if(event.getParameter().equals("facebookid")){
			String rsp = uManager.setFacebookid(event.getIdentification(), event.getValue());
			//Setting Output HashMap
			HashMap<String, Object> output = new HashMap<String, Object>();
			
			if(rsp != null){
				output.put("commited", (String) "true");
				EndSetDataTelcoServiceEvent EndEvent = new EndSetDataTelcoServiceEvent(output);
				this.fireEndSetDataTelcoServiceEvent(EndEvent, aci, null);
			} else {
				output.put("commited", (String) "false");
				EndSetDataTelcoServiceEvent EndEvent = new EndSetDataTelcoServiceEvent(output);
				this.fireEndSetDataTelcoServiceEvent(EndEvent, aci, null);
			}
		}
		
		if(event.getParameter().equals("twitterid")){
			String rsp = uManager.setTwitterid(event.getIdentification(), event.getValue());
			//Setting Output HashMap
			HashMap<String, Object> output = new HashMap<String, Object>();
			
			if(rsp != null){
				output.put("commited", (String) "true");
				EndSetDataTelcoServiceEvent EndEvent = new EndSetDataTelcoServiceEvent(output);
				this.fireEndSetDataTelcoServiceEvent(EndEvent, aci, null);
			} else {
				output.put("commited", (String) "false");
				EndSetDataTelcoServiceEvent EndEvent = new EndSetDataTelcoServiceEvent(output);
				this.fireEndSetDataTelcoServiceEvent(EndEvent, aci, null);
			}
		}
		
		if(event.getParameter().equals("linkedinid")){
			String rsp = uManager.setLinkedinid(event.getIdentification(), event.getValue());
			//Setting Output HashMap
			HashMap<String, Object> output = new HashMap<String, Object>();
			
			if(rsp != null){
				output.put("commited", (String) "true");
				EndSetDataTelcoServiceEvent EndEvent = new EndSetDataTelcoServiceEvent(output);
				this.fireEndSetDataTelcoServiceEvent(EndEvent, aci, null);
			} else {
				output.put("commited", (String) "false");
				EndSetDataTelcoServiceEvent EndEvent = new EndSetDataTelcoServiceEvent(output);
				this.fireEndSetDataTelcoServiceEvent(EndEvent, aci, null);
			}
		}
		aci.detach(this.sbbContext.getSbbLocalObject());
	}
	
	public void onStartGetDataTelcoServiceEvent(StartGetDataTelcoServiceEvent event, ActivityContextInterface aci){
		UsersInfoManager uManager = new UsersInfoManager();
		String response = null;
		
		if(event.getParameter().equals("sipuri")){
			response = uManager.getSipuri(event.getIdentification());
			//Setting Output HashMap
			HashMap<String, Object> output = new HashMap<String, Object>();
			output.put("value", (String) response);
			
			if(response == null){
				output.put("commited", (String) "false");
				EndGetDataTelcoServiceEvent EndEvent = new EndGetDataTelcoServiceEvent(output);
				this.fireEndGetDataTelcoServiceEvent(EndEvent, aci, null);
			} else {
				output.put("commited", (String) "true");
				EndGetDataTelcoServiceEvent EndEvent = new EndGetDataTelcoServiceEvent(output);
				this.fireEndGetDataTelcoServiceEvent(EndEvent, aci, null);
			}
		}
		
		if(event.getParameter().equals("state")){
			response = uManager.getState(event.getIdentification());
			//Setting Output HashMap
			HashMap<String, Object> output = new HashMap<String, Object>();
			output.put("value", (String) response);
			
			if(response == null){
				output.put("commited", (String) "false");
				EndGetDataTelcoServiceEvent EndEvent = new EndGetDataTelcoServiceEvent(output);
				this.fireEndGetDataTelcoServiceEvent(EndEvent, aci, null);
			} else {
				output.put("commited", (String) "true");
				EndGetDataTelcoServiceEvent EndEvent = new EndGetDataTelcoServiceEvent(output);
				this.fireEndGetDataTelcoServiceEvent(EndEvent, aci, null);
			}
		}
		
		if(event.getParameter().equals("email")){
			response = uManager.getEmail(event.getIdentification());
			//Setting Output HashMap
			HashMap<String, Object> output = new HashMap<String, Object>();
			output.put("value", (String) response);
			
			if(response == null){
				output.put("commited", (String) "false");
				EndGetDataTelcoServiceEvent EndEvent = new EndGetDataTelcoServiceEvent(output);
				this.fireEndGetDataTelcoServiceEvent(EndEvent, aci, null);
			} else {
				output.put("commited", (String) "true");
				EndGetDataTelcoServiceEvent EndEvent = new EndGetDataTelcoServiceEvent(output);
				this.fireEndGetDataTelcoServiceEvent(EndEvent, aci, null);
			}
		}
		
		if(event.getParameter().equals("username")){
			response = uManager.getUsername(event.getIdentification());
			//Setting Output HashMap
			HashMap<String, Object> output = new HashMap<String, Object>();
			output.put("value", (String) response);
			
			if(response == null){
				output.put("commited", (String) "false");
				EndGetDataTelcoServiceEvent EndEvent = new EndGetDataTelcoServiceEvent(output);
				this.fireEndGetDataTelcoServiceEvent(EndEvent, aci, null);
			} else {
				output.put("commited", (String) "true");
				EndGetDataTelcoServiceEvent EndEvent = new EndGetDataTelcoServiceEvent(output);
				this.fireEndGetDataTelcoServiceEvent(EndEvent, aci, null);
			}
		}
		
		if(event.getParameter().equals("phone")){
			response = uManager.getPhone(event.getIdentification());
			//Setting Output HashMap
			HashMap<String, Object> output = new HashMap<String, Object>();
			output.put("value", (String) response);
			
			if(response == null){
				output.put("commited", (String) "false");
				EndGetDataTelcoServiceEvent EndEvent = new EndGetDataTelcoServiceEvent(output);
				this.fireEndGetDataTelcoServiceEvent(EndEvent, aci, null);
			} else {
				output.put("commited", (String) "true");
				EndGetDataTelcoServiceEvent EndEvent = new EndGetDataTelcoServiceEvent(output);
				this.fireEndGetDataTelcoServiceEvent(EndEvent, aci, null);
			}
		}
		
		if(event.getParameter().equals("facebookid")){
			response = uManager.getFacebookid(event.getIdentification());
			//Setting Output HashMap
			HashMap<String, Object> output = new HashMap<String, Object>();
			output.put("value", (String) response);
			
			if(response == null){
				output.put("commited", (String) "false");
				EndGetDataTelcoServiceEvent EndEvent = new EndGetDataTelcoServiceEvent(output);
				this.fireEndGetDataTelcoServiceEvent(EndEvent, aci, null);
			} else {
				output.put("commited", (String) "true");
				EndGetDataTelcoServiceEvent EndEvent = new EndGetDataTelcoServiceEvent(output);
				this.fireEndGetDataTelcoServiceEvent(EndEvent, aci, null);
			}
		}
		
		if(event.getParameter().equals("twitterid")){
			response = uManager.getTwitterid(event.getIdentification());
			//Setting Output HashMap
			HashMap<String, Object> output = new HashMap<String, Object>();
			output.put("value", (String) response);
			
			if(response == null){
				output.put("commited", (String) "false");
				EndGetDataTelcoServiceEvent EndEvent = new EndGetDataTelcoServiceEvent(output);
				this.fireEndGetDataTelcoServiceEvent(EndEvent, aci, null);
			} else {
				output.put("commited", (String) "true");
				EndGetDataTelcoServiceEvent EndEvent = new EndGetDataTelcoServiceEvent(output);
				this.fireEndGetDataTelcoServiceEvent(EndEvent, aci, null);
			}
		}
		
		if(event.getParameter().equals("linkedinid")){
			response = uManager.getLinkedinid(event.getIdentification());
			//Setting Output HashMap
			HashMap<String, Object> output = new HashMap<String, Object>();
			output.put("value", (String) response);
			
			if(response == null){
				output.put("commited", (String) "false");
				EndGetDataTelcoServiceEvent EndEvent = new EndGetDataTelcoServiceEvent(output);
				this.fireEndGetDataTelcoServiceEvent(EndEvent, aci, null);
			} else {
				output.put("commited", (String) "true");
				EndGetDataTelcoServiceEvent EndEvent = new EndGetDataTelcoServiceEvent(output);
				this.fireEndGetDataTelcoServiceEvent(EndEvent, aci, null);
			}
		}
		aci.detach(this.sbbContext.getSbbLocalObject());
	}
	
	public void onStartSearchDataTelcoServiceEvent(StartSearchDataTelcoServiceEvent event, ActivityContextInterface aci){
		UsersInfoManager uManager = new UsersInfoManager();
		String response = null;
		
		response = uManager.searchID(event.getParameter(), event.getValue());
		//Setting Output HashMap
		HashMap<String, Object> output = new HashMap<String, Object>();
		output.put("identification", (String) response);
		
		if(response == null){
			output.put("commited", (String) "false");
			EndSearchDataTelcoServiceEvent EndEvent = new EndSearchDataTelcoServiceEvent(output);
			this.fireEndSearchDataTelcoServiceEvent(EndEvent, aci, null);
		} else {
			output.put("commited", (String) "true");
			EndSearchDataTelcoServiceEvent EndEvent = new EndSearchDataTelcoServiceEvent(output);
			this.fireEndSearchDataTelcoServiceEvent(EndEvent, aci, null);
		}
		aci.detach(this.sbbContext.getSbbLocalObject());
	}

	
	// TODO: Perform further operations if required in these methods.
	public void setSbbContext(SbbContext context) { this.sbbContext = context; }
    public void unsetSbbContext() { this.sbbContext = null; }
    
    // TODO: Implement the lifecycle methods if required
    public void sbbCreate() throws javax.slee.CreateException {}
    public void sbbPostCreate() throws javax.slee.CreateException {}
    public void sbbActivate() {}
    public void sbbPassivate() {}
    public void sbbRemove() {}
    public void sbbLoad() {}
    public void sbbStore() {}
    public void sbbExceptionThrown(Exception exception, Object event, ActivityContextInterface activity) {}
    public void sbbRolledBack(RolledBackContext context) {}
	
	public abstract void fireEndSetDataTelcoServiceEvent (EndSetDataTelcoServiceEvent event, ActivityContextInterface aci, Address address);
	public abstract void fireEndGetDataTelcoServiceEvent (EndGetDataTelcoServiceEvent event, ActivityContextInterface aci, Address address);
	public abstract void fireEndSearchDataTelcoServiceEvent (EndSearchDataTelcoServiceEvent event, ActivityContextInterface aci, Address address);

	
	/**
	 * Convenience method to retrieve the SbbContext object stored in setSbbContext.
	 * 
	 * TODO: If your SBB doesn't require the SbbContext object you may remove this 
	 * method, the sbbContext variable and the variable assignment in setSbbContext().
	 *
	 * @return this SBB's SbbContext object
	 */
	
	protected SbbContext getSbbContext() {
		return sbbContext;
	}

	private SbbContext sbbContext; // This SBB's SbbContext

}
