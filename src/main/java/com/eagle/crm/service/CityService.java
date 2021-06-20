package com.eagle.crm.service;

import com.eagle.crm.bean.City;


public interface CityService {

     City getById(Long id);

     void saveCity(City city);

}
