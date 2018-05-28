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
import com.google.gwt.geolocation.client.Position;
import com.google.gwt.geolocation.client.PositionError;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.js.Navigator;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;
import gwt.material.design.incubator.client.google.addresslookup.AddressLookup;
import gwt.material.design.incubator.client.google.addresslookup.constants.AddressComponentType;
import gwt.material.design.incubator.client.google.addresslookup.constants.AddressType;
import gwt.material.design.incubator.client.google.addresslookup.js.options.AddressLookupOptions;
import gwt.material.design.incubator.client.google.addresslookup.js.options.LatLngBounds;
import gwt.material.design.incubator.client.google.addresslookup.js.options.result.GeocoderAddressComponent;

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

    protected void geolocate() {
        Navigator.geolocation.getCurrentPosition(new Callback<Position, PositionError>() {
            @Override
            public void onFailure(PositionError positionError) {
                MaterialToast.fireToast(positionError.getMessage());
            }

            @Override
            public void onSuccess(Position position) {
                /*LatLngBounds bounds = new LatLngBounds(position.getCoordinates().getLatitude(), position.getCoordinates().getLongitude());
                addressLookupGeolocate.setBounds();*/
            }
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