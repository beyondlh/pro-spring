package com.wiley.beginningspring.ch7;

/**
 *
 * @author Благодатских С.
 */
public class UserService {

	private LoginAction loginAction;
	private UserPreferences userPreferences;

	public void setLoginAction(LoginAction loginAction) {
		this.loginAction = loginAction;
	}

	public void setUserPreferences(UserPreferences userPreferences) {
		this.userPreferences = userPreferences;
	}

	public LoginAction getLoginAction() {
		return loginAction;
	}

	public UserPreferences getUserPreferences() {
		return userPreferences;
	}

}
