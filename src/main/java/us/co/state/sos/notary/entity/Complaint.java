package us.co.state.sos.notary.entity;

import java.util.Date;

public class Complaint extends AbstractCensure{
	
	private static final long serialVersionUID = 1L;
	private Admonishment admonishment;
	
	public Complaint(Notary notary, Date issuedDate, String comment) {
		super(notary, issuedDate, comment);
	}
	
	public Admonishment getAdmonishment() {
		return admonishment;
	}
	public void setAdmonishment(Admonishment admonishment) {
		this.admonishment = admonishment;
	}

	@Override
	public String getType() {
		return "Complaint";
	}
	
}
