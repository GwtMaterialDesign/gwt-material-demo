package gwt.material.design.demo.client.application.incubator.google.addresslookup;

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


import com.google.gwt.core.client.Callback;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.api.ApiRegistry;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;
import gwt.material.design.incubator.client.google.addresslookup.AddressLookup;
import gwt.material.design.incubator.client.google.addresslookup.api.AddressLookupApi;
import gwt.material.design.incubator.client.google.addresslookup.constants.AddressComponentType;
import gwt.material.design.incubator.client.google.addresslookup.constants.AddressType;
import gwt.material.design.incubator.client.google.addresslookup.js.options.AddressLookupOptions;
import gwt.material.design.incubator.client.google.addresslookup.js.options.result.GeocoderAddressComponent;

import java.util.logging.Logger;

public class AddressLookupView extends ViewImpl implements AddressLookupPresenter.MyView {
    public interface Binder extends UiBinder<Widget, AddressLookupView> {
    }

    @UiField
    AddressLookup addressLookup;

    @UiField
    MaterialTextBox streetAddress, city, state, zipCode, country;

    @Inject
    AddressLookupView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        // Loading API
        ApiRegistry.register(new AddressLookupApi("AIzaSyCcFsjlqr-DR6acrZ8xZKhXNGxeS3nDmIE"), new Callback<Void, Exception>() {
            @Override
            public void onFailure(Exception exception) {
                MaterialToast.fireToast(exception.getMessage());
            }

            @Override
            public void onSuccess(Void aVoid) {
                addressLookup.load();

            }
        });



        // Lookup Demo
        AddressLookupOptions option = AddressLookupOptions.create();
        option.setTypes(AddressType.ADDRESS);

        addressLookup.setOptions(option);
        addressLookup.addPlaceChangedHandler(event -> {
            MaterialToast.fireToast("Place Changed event fired");
            setComponent(streetAddress, addressLookup.getAddressComponent(AddressComponentType.STREET_ADDRESS));
            setComponent(city, addressLookup.getAddressComponent(AddressComponentType.LOCALITY));
            setComponent(state, addressLookup.getAddressComponent(AddressComponentType.ADMINISTRATIVE_AREA_LEVEL_1));
            setComponent(country, addressLookup.getAddressComponent(AddressComponentType.COUNTRY));
            setComponent(zipCode, addressLookup.getAddressComponent(AddressComponentType.POSTAL_CODE));
        });
    }

    protected void setComponent(MaterialTextBox textBox, GeocoderAddressComponent addressComponent) {
        if (addressComponent != null) {
            textBox.setText(addressComponent.getLongName());
        } else {
            textBox.setText("-");
        }
    }
}