package in.ashokit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course_dtls")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cid;
	private String cname;
	private Double cprice;

	public Course() {
		super();
	}

	public Course(Integer cid, String cname, Double cprice) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cprice = cprice;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Double getCprice() {
		return cprice;
	}

	public void setCprice(Double cprice) {
		this.cprice = cprice;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", cprice=" + cprice + "]";
	}

}
