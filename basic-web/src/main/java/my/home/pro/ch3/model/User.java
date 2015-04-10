package my.home.pro.ch3.model;

import java.util.Date;
import org.springframework.stereotype.Component;

/**
 *
 * @author Благодатских С.
 */
@Component
public class User {

	private String name;
	private String lastname;
	private String password;
	private String detail;
	private Date birthDate;
	private Gender gender;
	private String country;
	private boolean nonSmoking;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public boolean isNonSmoking() {
		return nonSmoking;
	}

	public void setNonSmoking(boolean nonSmoking) {
		this.nonSmoking = nonSmoking;
	}
}
