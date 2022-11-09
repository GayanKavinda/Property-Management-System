package model;

import java.io.InputStream;

import javax.servlet.http.Part;

public class property {

	private String pname;
	private InputStream image;
	private String description;
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public InputStream getImage() {
		return image;
	}
	public void setImage(InputStream inputStream) {
		this.image = inputStream;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}

