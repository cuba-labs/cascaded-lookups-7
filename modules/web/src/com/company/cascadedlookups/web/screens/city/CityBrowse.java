package com.company.cascadedlookups.web.screens.city;

import com.haulmont.cuba.gui.screen.*;
import com.company.cascadedlookups.entity.City;

@UiController("cascadedlookups_City.browse")
@UiDescriptor("city-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class CityBrowse extends MasterDetailScreen<City> {
}