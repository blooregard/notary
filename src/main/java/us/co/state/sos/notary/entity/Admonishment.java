package us.co.state.sos.notary.entity;

import java.util.Date;

public class Admonishment extends AbstractCensure {

	private static final long serialVersionUID = 1L;

	public Admonishment(Notary notary, Date issuedDate, String comment) {
		super(notary, issuedDate, comment);
	}

	@Override
	public String getType() {
		return "Admonishment";
	}

}
