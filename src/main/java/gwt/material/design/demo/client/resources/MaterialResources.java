package gwt.material.design.demo.client.resources;

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


import com.google.appengine.api.images.Image;
import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public interface MaterialResources extends ClientBundle {
	MaterialResources INSTANCE = GWT.create(MaterialResources.class);

	@Source("img/ic_gwt_logo.png")
	ImageResource ic_gwt_logo();

	@Source("img/ic_front.png")
	ImageResource ic_front();

	@Source("img/ic_bold.png")
	ImageResource ic_bold();

	@Source("img/ic_metaphor.png")
	ImageResource ic_metaphor();

	@Source("img/ic_motion.png")
	ImageResource ic_motion();

	@Source("img/ic_getting_started.png")
	ImageResource ic_getting_started();

	@Source("img/bg_top_nav.png")
	ImageResource bg_top_nav();

	@Source("img/yuna.jpg")
	ImageResource yuna();

	@Source("img/parallax1.jpg")
	ImageResource parallax1();

	@Source("img/parallax2.jpg")
	ImageResource parallax2();

	@Source("img/parallax3.jpg")
	ImageResource parallax3();

	@Source("img/ic_theme.png")
	ImageResource ic_theme();

	@Source("img/starter.png")
	ImageResource starter();

	@Source("img/ic_splash.png")
	ImageResource ic_splash();

	@Source("img/template_login.png")
	ImageResource template_login();

	@Source("img/template_parallax.gif")
	ImageResource template_parallax();

	@Source("img/template_starter.gif")
	ImageResource template_starter();

	@Source("img/template_wrenx.gif")
	ImageResource template_wrenx();

	@Source("img/gplus.png")
	ImageResource gplus();

	// Profile Images
	@Source("img/batman.png")
	ImageResource batman();

	@Source("img/captain_america.png")
	ImageResource captain_america();

	@Source("img/cat_woman.png")
	ImageResource cat_woman();

	@Source("img/cyclops.png")
	ImageResource cyclops();

	@Source("img/flash.png")
	ImageResource flash();

	@Source("img/green_lantern.png")
	ImageResource green_lantern();

	@Source("img/robin.png")
	ImageResource robin();

	@Source("img/spiderman.png")
	ImageResource spiderman();

	@Source("img/superman.png")
	ImageResource superman();

	@Source("img/thor.png")
	ImageResource thor();

	@Source("img/wolverine.png")
	ImageResource wolverine();

	@Source("img/wonder_woman.png")
	ImageResource wonder_woman();
}