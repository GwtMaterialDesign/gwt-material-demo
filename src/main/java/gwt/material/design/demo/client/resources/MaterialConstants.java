package gwt.material.design.demo.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.Constants;

public interface MaterialConstants extends Constants {

	MaterialConstants INSTANCE = GWT.create(MaterialConstants.class);

	String apkUrl();
	String rawSourceUrl();
	String sourceUrl();
	String gitterUrl();
	String weatherIconsUrl();
	String mavenUrl();
	String githubUrl();
	
	String bountysourceUrl();
	String chartsUrl();
	
	String demoLoginUrl();
	String sourceLoginUrl();
	
	String demoStarterUrl();
	String sourceStarterUrl();
	
	String demoMapUrl();
	String sourceMapUrl();
	
	String demoParallaxUrl();
	String sourceParallaxUrl();
	
	String phoneGapRepoUrl();
	
	String dataGridUrl();
}
