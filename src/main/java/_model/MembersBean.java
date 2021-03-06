package _model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Members")
public class MembersBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer memberId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String address;
	private Integer gender;
	private String cellphone;
	private Integer privilegeId;
	private String birthDate;
	private String modifiedTime;
	private String registeredTime;
	private Integer activeStatus;
	
	public MembersBean() {}
	
	public MembersBean(String firstName, String lastName, String email, String password, String address,
			Integer gender, String cellphone, Integer privilegeId, String birthDate, String modifiedTime,
			String registeredTime, Integer activeStatus) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.address = address;
		this.gender = gender;
		this.cellphone = cellphone;
		this.privilegeId = privilegeId;
		this.birthDate = birthDate;
		this.modifiedTime = modifiedTime;
		this.registeredTime = registeredTime;
		this.activeStatus = activeStatus;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public Integer getPrivilegeId() {
		return privilegeId;
	}

	public void setPrivilegeId(Integer privilegeId) {
		this.privilegeId = privilegeId;
	}
	
	@Column(name="birthDate", columnDefinition="datetime")
	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	
	@Column(name="modifiedTime", columnDefinition="datetime")
	public String getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(String modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
	
	@Column(name="registeredTime", columnDefinition="datetime")
	public String getRegisteredTime() {
		return registeredTime;
	}

	public void setRegisteredTime(String registeredTime) {
		this.registeredTime = registeredTime;
	}

	public Integer getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(Integer activeStatus) {
		this.activeStatus = activeStatus;
	}

	@Override
	public String toString() {
		return "MembersBean [memberId=" + memberId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", password=" + password + ", address=" + address + ", gender=" + gender + ", cellphone="
				+ cellphone + ", privilegeId=" + privilegeId + ", birthDate=" + birthDate + ", modifiedTime="
				+ modifiedTime + ", registeredTime=" + registeredTime + ", activeStatus=" + activeStatus + "]";
	}
}
