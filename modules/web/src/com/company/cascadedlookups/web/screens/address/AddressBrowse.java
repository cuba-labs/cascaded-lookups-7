package com.company.cascadedlookups.web.screens.address;

import com.haulmont.cuba.gui.screen.*;
import com.company.cascadedlookups.entity.Address;

@UiController("cascadedlookups_Address.browse")
@UiDescriptor("address-browse.xml")
@LookupComponent("addressesTable")
@LoadDataBeforeShow
public class AddressBrowse extends StandardLookup<Address> {
}