package Dao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ahmedgamal
 */
public class QueryObject {
    
    private List<Object> parameters = new ArrayList<>();
    private String query;
    
    protected QueryObject(String query){
        
        this.query = query;
        
    }
    
    protected void addParameter(Object value){
                
        parameters.add(value);
        
    }
    
    protected List<Object> getParameters(){
        
        return parameters;
        
    }
    
    protected String getQuery() {
        return query;
    }
    
}
