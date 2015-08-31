package jp.co.sample.customer.biz.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * customer�N���X
 * 
 * @author kozu_tatsuya
 */
public class Customer implements java.io.Serializable {

	/**
	 * �V���A���ԍ�
	 */
	private static final long serialVersionUID = -4840861170548121969L;

	/**
	 * ID
	 */
	private int id;
	/**
	 * ���O
	 */
	@NotBlank
	@Length(max = 20)
	private String name;
	/**
	 * �A�h���X
	 */
	@NotBlank
	@Length(max = 100)
	private String address;
	/**
	 * e-mail�A�h���X
	 */
	@NotBlank
	@Email
	private String emailAddress;

	public Customer(String name, String address, String emailAddress) {
		this.name = name;
		this.address = address;
		this.emailAddress = emailAddress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}
