package us.co.state.sos.notary.entity;

import java.io.Serializable;
import java.util.Date;

public abstract class AbstractCensure implements Serializable{

	private static final long serialVersionUID = 1L;
	protected Notary notary;
	protected Date issuedDate;
	protected String comment;
	
	public AbstractCensure(Notary notary, Date issuedDate, String comment) {
		this.notary = notary;
		this.issuedDate = issuedDate;
		this.comment = comment;
	}
	
	public Notary getNotary() {
		return notary;
	}
	public void setNotary(Notary notary) {
		this.notary = notary;
	}
	public Date getIssuedDate() {
		return issuedDate;
	}
	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	public abstract String getType();
}
