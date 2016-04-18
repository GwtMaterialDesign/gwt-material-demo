package gwt.material.design.demo.shared;

/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2016 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


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
