package gwt.material.design.demo.client;

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


import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.Bootstrapper;
import com.gwtplatform.mvp.client.PreBootstrapper;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Application implements Bootstrapper {

    private final Logger logger = Logger.getLogger(Application.class.getName());

    public static class PreApplicationImpl implements PreBootstrapper {
        private final Logger logger = Logger.getLogger(PreApplicationImpl.class.getName());

        @Override
        public void onPreBootstrap() {
            GWT.setUncaughtExceptionHandler(new GWT.UncaughtExceptionHandler() {
                public void onUncaughtException(Throwable e) {
                    logger.log(Level.SEVERE, e.getMessage(), e);
                }
            });
        }
    }

    @Override
    public void onBootstrap() {

    }
}
