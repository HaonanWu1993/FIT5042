/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fit5042.tutex.repository;

import fit5042.tutex.repository.entities.Property;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * TODO Exercise 1.3 Step 2 Complete this class.
 * 
 * This class implements the PropertyRepository class. You will need to add the keyword
 * "implements" PropertyRepository. 
 * 
 * @author Jian 
 */
public class SimplePropertyRepositoryImpl implements PropertyRepository{
    private List<Property> list = new ArrayList<>();
    

    @Override
    public void addProperty(Property property) throws Exception {
        list.add(property);
       
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Property searchPropertyById(int id) throws Exception {
        Property property = new Property();
        property = list.get(id);
        return property;
    }

    @Override
    public List<Property> getAllProperties() throws Exception {
        return list;
         
       
    }
    
    public List<Property> getList() {
        return list;
    }

    public void setList(List<Property> list) {
        this.list = list;
    }
    
}
