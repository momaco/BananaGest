package org.bananagest.model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ol
 */
public class UsersData {
    
    private Map<Integer,User> data;
    
    private UsersData() {
        data = new HashMap<>();
    }
    
    public static UsersData getInstance() {
        return UsersDataHolder.INSTANCE;
    }
    
    private static class UsersDataHolder {

        private static final UsersData INSTANCE = new UsersData();
    }
    
    public Map getMap()
    {
        return data;
    }
}
