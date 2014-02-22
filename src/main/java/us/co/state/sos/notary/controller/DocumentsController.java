package us.co.state.sos.notary.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.joda.time.DateTime;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import us.co.state.sos.notary.entity.AbstractCensure;
import us.co.state.sos.notary.entity.Admonishment;
import us.co.state.sos.notary.entity.Complaint;
import us.co.state.sos.notary.entity.Notary;
import us.co.state.sos.notary.entity.sevices.NotaryService;

@ManagedBean
@SessionScoped
public class DocumentsController implements Serializable {

	private TreeNode root;

	private AbstractCensure selectedCensure;
	private Notary notary;
	
	public DocumentsController() {
		root = new DefaultTreeNode("root", null);
		notary = new Notary();
		notary.setName("Ben Rector");
		DateTime date = new DateTime();
		
		TreeNode complaint1 = new DefaultTreeNode(new Complaint(notary, date.minusDays(35).toDate() , "Space Violation"), root);
		TreeNode complaint2 = new DefaultTreeNode(new Complaint(notary, date.minusDays(25).toDate() , "Stamp Violation"), root);
		TreeNode complaint3 = new DefaultTreeNode(new Complaint(notary, date.minusDays(10).toDate() , "Witness Violation"), root);
		TreeNode complaint4 = new DefaultTreeNode(new Admonishment(notary, date.minusDays(5).toDate() , "Bad hair day"), root);
		
		TreeNode complaint11 = new DefaultTreeNode(new Complaint(notary, date.minusDays(24).toDate() , "Send Letter"), complaint1);
		TreeNode complaint12 = new DefaultTreeNode(new Admonishment(notary, date.minusDays(30).toDate() , "Stahp it!"), complaint1);
		
	}
	
	public TreeNode getRoot() {
		return root;
	}
	
	public AbstractCensure getSelectedCensure() {
		return selectedCensure;
	}

	public void setSelectedCensure(AbstractCensure selectedCensure) {
		this.selectedCensure = selectedCensure;
	}

	public Notary getNotary() {
		return notary;
	}

	public void setNotary(Notary notary) {
		this.notary = notary;
	}
}
					
