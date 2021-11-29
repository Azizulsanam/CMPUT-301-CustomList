package com.example.simpleparadox.listycity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CityList {
    private List<City> cities = new ArrayList<>();
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    public void deleteCity(City city) {
        if (cities.contains(city)) {
            cities.remove(city);

        }
        else
            throw new IllegalArgumentException();
    }


    public int countCities() {
        return cities.size();
    }
    
}
