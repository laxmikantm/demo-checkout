package testDataTypes;

import java.util.HashMap;
import java.util.Map;
/**************************
 *  (C) L Somni            *
 ***************************/

public class UserCredentials {


	private String userNameEmail;
	private String password;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();


	public String getUserNameEmail() {
		return userNameEmail;
	}

	public void setUserNameEmail(String userNameEmail) {
		this.userNameEmail = userNameEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}