package org.telcomp.others;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsersInfoManager {
	
	private Usersinfo u;
	private UsersinfoDao uDao;
    private Connection cx;

    public UsersInfoManager(){
    	u = new Usersinfo();
        uDao = new UsersinfoDao();
        getConnection();
    }
    
    @SuppressWarnings("rawtypes")
	public String searchID(String parameter, String value){
    	List user;
    	
    	if(parameter.equals("sipuri")){
    		try {
    			u.setSipuri(value);
				user = uDao.searchMatching(cx, u);
	    		u = (Usersinfo)user.get(0);
	    		cx.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return u.getIdentification();
    	} else if(parameter.equals("email")){
    		try {
    			u.setEmail(value);
				user = uDao.searchMatching(cx, u);
	    		u = (Usersinfo)user.get(0);
	    		cx.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return u.getIdentification();
    	} else if(parameter.equals("username")){
    		try {
    			u.setUsername(value);
				user = uDao.searchMatching(cx, u);
	    		u = (Usersinfo)user.get(0);
	    		cx.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return u.getIdentification();
    	} else if(parameter.equals("phone")){
    		try {
    			u.setPhone(value);
				user = uDao.searchMatching(cx, u);
	    		u = (Usersinfo)user.get(0);
	    		cx.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return u.getIdentification();
    	} else if(parameter.equals("facebookid")){
    		try {
    			u.setFacebookid(value);
				user = uDao.searchMatching(cx, u);
	    		u = (Usersinfo)user.get(0);
	    		cx.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return u.getIdentification();
    	} else if(parameter.equals("twitterid")){
    		try {
    			u.setTwitterid(value);
				user = uDao.searchMatching(cx, u);
	    		u = (Usersinfo)user.get(0);
	    		cx.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return u.getIdentification();
    	} else if(parameter.equals("linkedinid")){
    		try {
    			u.setLinkedinid(value);
				user = uDao.searchMatching(cx, u);
	    		u = (Usersinfo)user.get(0);
	    		cx.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return u.getIdentification();
    	} else{
    		try {
				cx.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
    		return null;
    	}
    }
    
    public String getSipuri(String identification){
    	u.setIdentification(identification);
    	try {
			uDao.load(cx, u);
			cx.close();
		} catch (NotFoundException e) {
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return u.getSipuri();
    }
    
    public String setSipuri(String identification, String Sipuri){
    	u.setIdentification(identification);
    	String response = null;
    	try {
			uDao.load(cx, u);
			u.setSipuri(Sipuri);
			uDao.save(cx, u);
			cx.close();
			response = "OK";
		} catch (NotFoundException e) {
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return response;
    }
    
    public String getState(String identification){
    	u.setIdentification(identification);
    	try {
			uDao.load(cx, u);
			cx.close();
		} catch (NotFoundException e) {
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return u.getState();
    }
    
    public String setState(String identification, String state){
    	u.setIdentification(identification);
    	String response = null;
    	try {
			uDao.load(cx, u);
			u.setState(state);
			uDao.save(cx, u);
			cx.close();
			response = "OK";
		} catch (NotFoundException e) {
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return response;
    }
    
    public String getEmail(String identification){
    	u.setIdentification(identification);
    	try {
			uDao.load(cx, u);
			cx.close();
		} catch (NotFoundException e) {
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return u.getEmail();
    }
    
    public String setEmail(String identification, String email){
    	u.setIdentification(identification);
    	String response = null;
    	try {
			uDao.load(cx, u);
			u.setEmail(email);
			uDao.save(cx, u);
			cx.close();
			response = "OK";
		} catch (NotFoundException e) {
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return response;
    }
    
    public String getUsername(String identification){
    	u.setIdentification(identification);
    	try {
			uDao.load(cx, u);
			cx.close();
		} catch (NotFoundException e) {
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return u.getUsername();
    }
    
    public String setUsername(String identification, String username){
    	u.setIdentification(identification);
    	String response = null;
    	try {
			uDao.load(cx, u);
			u.setUsername(username);
			uDao.save(cx, u);
			cx.close();
			response = "OK";
		} catch (NotFoundException e) {
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return response;
    }
    
    public String getPhone(String identification){
    	u.setIdentification(identification);
    	try {
			uDao.load(cx, u);
			cx.close();
		} catch (NotFoundException e) {
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return u.getPhone();
    }
    
    public String setPhone(String identification, String phone){
    	u.setIdentification(identification);
    	String response = null;
    	try {
			uDao.load(cx, u);
			u.setPhone(phone);
			uDao.save(cx, u);
			cx.close();
			response = "OK";
		} catch (NotFoundException e) {
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return response;
    }
    
    public String getFacebookid(String identification){
    	u.setIdentification(identification);
    	try {
			uDao.load(cx, u);
			cx.close();
		} catch (NotFoundException e) {
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return u.getFacebookid();
    }
    
    public String setFacebookid(String identification, String facebookid){
    	u.setIdentification(identification);
    	String response = null;
    	try {
			uDao.load(cx, u);
			u.setFacebookid(facebookid);
			uDao.save(cx, u);
			cx.close();
			response = "OK";
		} catch (NotFoundException e) {
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return response;
    }
    
    public String getTwitterid(String identification){
    	u.setIdentification(identification);
    	try {
			uDao.load(cx, u);
			cx.close();
		} catch (NotFoundException e) {
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return u.getTwitterid();
    }
    
    public String setTwitterid(String identification, String twitterid){
    	u.setIdentification(identification);
    	String response = null;
    	try {
			uDao.load(cx, u);
			u.setTwitterid(twitterid);
			uDao.save(cx, u);
			cx.close();
			response = "OK";
		} catch (NotFoundException e) {
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return response;
    }
    
    public String getLinkedinid(String identification){
    	u.setIdentification(identification);
    	try {
			uDao.load(cx, u);
			cx.close();
		} catch (NotFoundException e) {
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return u.getLinkedinid();
    }
    
    public String setLinkedinid(String identification, String linkedinid){
    	u.setIdentification(identification);
    	String response = null;
    	try {
			uDao.load(cx, u);
			u.setLinkedinid(linkedinid);
			uDao.save(cx, u);
			cx.close();
			response = "OK";
		} catch (NotFoundException e) {
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return response;
    }
    
    private void getConnection(){
        try {
            String driver = "org.postgresql.Driver";
            String url = "jdbc:postgresql://localhost:5432/TelcompUsers";
            String user = "postgres";
            String passwd = "postgres";

            Class.forName(driver);
            cx = DriverManager.getConnection(url, user, passwd);

        } catch (SQLException ex) {
            Logger.getLogger(UsersInfoManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsersInfoManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
