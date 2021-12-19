package br.edu.ifpb.padroes.domain;

import java.util.ArrayList;

public class Properties implements Property{
    
    private ArrayList<Property> propertiesList = new ArrayList<>();

    public void add(Property property) {
        propertiesList.add(property);
    }

    public void remove(Property property) {
        propertiesList.remove(property);
    }

    @Override
    public float getPrice() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
