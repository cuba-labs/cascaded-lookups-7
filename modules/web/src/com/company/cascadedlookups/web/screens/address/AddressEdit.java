package com.company.cascadedlookups.web.screens.address;

import com.company.cascadedlookups.entity.City;
import com.company.cascadedlookups.entity.Country;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.model.InstanceLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.cascadedlookups.entity.Address;

import javax.inject.Inject;
import java.util.Collection;

@UiController("cascadedlookups_Address.edit")
@UiDescriptor("address-edit.xml")
@EditedEntityContainer("addressDc")
public class AddressEdit extends StandardEditor<Address> {

    @Inject
    private CollectionLoader<City> citiesDl;
    @Inject
    private CollectionLoader<Country> countriesDl;
    @Inject
    private InstanceLoader<Address> addressDl;
    @Inject
    private InstanceContainer<Address> addressDc;

    @Subscribe(id = "addressDc", target = Target.DATA_CONTAINER)
    public void onAddressDcItemPropertyChange(InstanceContainer.ItemPropertyChangeEvent<Address> event) {
        if ("country".equals(event.getProperty())) {
            addressDc.getItem().setCity(null);
        }
    }

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        addressDl.load();
        countriesDl.load();
    }

    @Subscribe(id = "countriesDc", target = Target.DATA_CONTAINER)
    public void onCountriesDcItemChange(InstanceContainer.ItemChangeEvent<Country> event) {
        citiesDl.setParameter("country", event.getItem());
        citiesDl.load();

    }
}