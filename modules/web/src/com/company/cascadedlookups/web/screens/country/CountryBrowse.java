package com.company.cascadedlookups.web.screens.country;

import com.haulmont.cuba.gui.screen.*;
import com.company.cascadedlookups.entity.Country;

@UiController("cascadedlookups_Country.browse")
@UiDescriptor("country-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class CountryBrowse extends MasterDetailScreen<Country> {
}