package priv.szq.base.hw4_28;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;
public class User implements Serializable{

	private static final Logger logger = Logger.getLogger(User.class);
	private String userId;
	private String passWord;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public User(String userId, String passWord) {
		super();
		this.userId = userId;
		this.passWord = passWord;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", passWord=" + passWord + "]";
	}
	

	
	
}

