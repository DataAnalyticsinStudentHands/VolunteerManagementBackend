package dash.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.beanutils.BeanUtils;

import dash.security.IAclObject;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

@Entity
@Table(name = "entered_hours")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Hour implements IAclObject {

	@Id
	@GeneratedValue
	@Column(name = "id")
	@XmlElement(name = "id")
	private Long id;

	@Column(name = "user_id")
	@XmlElement(name = "user_id")
	private Long user_id;

	@Column(name = "task_id")
	@XmlElement(name = "task_id")
	private Long task_id;

	@Column(name = "title")
	@XmlElement(name = "title")
	private String title;

	@Column(name = "start_time")
	@XmlElement(name = "start_time")
	private Date start_time;

	@Column(name = "end_time")
	@XmlElement(name = "end_time")
	private Date end_time;

	@Column(name = "duration")
	@XmlElement(name = "duration")
	private int duration;

	@Column(name = "approved")
	@XmlElement(name = "approved")
	private boolean approved;

	@Column(name = "pending")
	@XmlElement(name = "pending")
	private boolean pending;

	public Hour(Hour hourEntity) {
		try {
			BeanUtils.copyProperties(this, hourEntity);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	public Hour() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public Long getTask_id() {
		return task_id;
	}

	public void setTask_id(Long task_id) {
		this.task_id = task_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getStart_time() {
		return start_time;
	}

	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}

	public Date getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public boolean isPending() {
		return pending;
	}

	public void setPending(boolean pending) {
		this.pending = pending;
	}
}
