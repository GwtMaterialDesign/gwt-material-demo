package gwt.material.design.demo.shared;

import com.google.gwt.resources.client.ImageResource;

import java.io.Serializable;

public class TemplateDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private ImageResource img;
	private String description;
	private String demoLink;
	private String sourceLink;
	
	public TemplateDTO() {
		// TODO Auto-generated constructor stub
	}

	public TemplateDTO(String name, ImageResource img, String description, String demoLink, String sourceLink) {
		super();
		this.name = name;
		this.img = img;
		this.description = description;
		this.demoLink = demoLink;
		this.sourceLink = sourceLink;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ImageResource getImg() {
		return img;
	}

	public void setImg(ImageResource img) {
		this.img = img;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDemoLink() {
		return demoLink;
	}

	public void setDemoLink(String demoLink) {
		this.demoLink = demoLink;
	}

	public String getSourceLink() {
		return sourceLink;
	}

	public void setSourceLink(String sourceLink) {
		this.sourceLink = sourceLink;
	}
	
	
	
}
