package us.co.state.sos.notary.managed;

import java.io.ByteArrayInputStream;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.UploadedFile;

@ManagedBean
@RequestScoped
public class ViewBean {
	
	private UploadedFile file;
	
	@PostConstruct
	public void initialize() {
		file = (UploadedFile) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("attachment");
	}

	public UploadedFile getFile() {
		return file;
	}

	public void setFile(UploadedFile file) {
		this.file = file;
	}

	public StreamedContent getImage() {
		return new DefaultStreamedContent(new ByteArrayInputStream(file.getContents()),file.getContentType());
	}
	
}
