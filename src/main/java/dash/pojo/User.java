package dash.pojo;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.apache.commons.beanutils.BeanUtils;

import dash.helpers.DateISO8601Adapter;

/**
 * User resource placeholder for json/xml representation
 *
 * @author plindner
 *
 */
@Entity
@Table(name="user_data")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class User implements Serializable {

	private static final long serialVersionUID = -8039686696076337053L;

	/** id of the user */
	@Id
	@GeneratedValue
	@Column(name="id")
	@XmlElement(name = "id")
	private Long id;

	/** username of the user */
	@XmlElement(name = "username")
	private String username;

	/** password of the user */
	@Transient
	@XmlElement(name = "password")
	private String password;

	/** firstname of the user */
	@Column(name = "firstName")
	@XmlElement(name = "firstName")
	private String firstName;

	/** lastname of the user */
	@Column(name = "lastName")
	@XmlElement(name = "lastName")
	private String lastName;

	/** city of the user */
	@Column(name = "city")
	@XmlElement(name = "city")
	private String city;

	/** home phone number of the user */
	@Column(name = "homePhone")
	@XmlElement(name = "homePhone")
	private String homePhone;

	/** cellPhone number of the user */
	@Column(name = "cellPhone")
	@XmlElement(name = "cellPhone")
	private String cellPhone;

	/** email address of the user */
	@Column(name = "email")
	@XmlElement(name = "email")
	private String email;

	/** path to stored picture of the user */
	@Column(name = "picture")
	@XmlElement(name = "picturePath")
	private String picturePath;
	
	/** name of a photo stored at picturePath that is the selected profile photo*/
	@Column(name= "profile_picture_filename")
	@XmlElement(name= "profile_picture_filename")
	private String profile_picture_filename;

	/** insertion date in the database */
	@Column(name = "insertion_date")
	@XmlElement(name = "insertionDate")
	@XmlJavaTypeAdapter(DateISO8601Adapter.class)
	private Date insertionDate;

	public User(User User) {
		try {
			BeanUtils.copyProperties(this, User);
		} catch ( IllegalAccessException e) {

			e.printStackTrace();
		} catch ( InvocationTargetException e) {

			e.printStackTrace();
		}
	}

	public User( String username,  String password,
			String firstName,  String lastName,  String city,
			String homePhone,  String cellPhone,  String email,
			String picturePath, String profile_picture_filename) {

		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.homePhone = homePhone;
		this.cellPhone = cellPhone;
		this.email = email;
		this.picturePath = picturePath;
		this.profile_picture_filename= profile_picture_filename;
	}

	public User() {
	}

	
	public String getProfile_picture_filename() {
		return profile_picture_filename;
	}

	public void setProfile_picture_filename(String profile_picture_filename) {
		this.profile_picture_filename = profile_picture_filename;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername( String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword( String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName( String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName( String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity( String city) {
		this.city = city;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone( String homePhone) {
		this.homePhone = homePhone;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone( String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail( String email) {
		this.email = email;
	}

	public String getPicture() {
		return picturePath;
	}

	public void setPicture( String picturePath) {
		this.picturePath = picturePath;
	}

	public Long getId() {
		return id;
	}

	public void setId( Long id) {
		this.id = id;
	}

	public Date getInsertionDate() {
		return insertionDate;
	}

	public void setInsertionDate( Date insertionDate) {
		this.insertionDate = insertionDate;
	}



}
