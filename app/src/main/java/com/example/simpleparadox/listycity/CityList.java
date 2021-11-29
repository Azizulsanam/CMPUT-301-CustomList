package com.example.simpleparadox.listycity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CityList {
    private List<City> cities = new ArrayList<>();
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    public boolean checkCity(City city) {
        for (City c : cities)
            if (c.getCityName().equals(city.getCityName()) &&
                    c.getProvinceName().equals(city.getProvinceName())) {
                return true;
            }
        return false;
    }

    public void deleteCity(City city) {
        if (!checkCity(city)) throw new IllegalArgumentException();
        for (City c : cities)
            if (c.compareTo(city) == 0) {
                cities.remove(c);
                break;
            }
    }

    public int countCities() {
        return cities.size();
    }
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
}