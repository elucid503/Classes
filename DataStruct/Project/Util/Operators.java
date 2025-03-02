package Project.Util;

public enum Operators {

    // figured an enum would be useful here

    Add("+"),
    Subtract("-"),
    Multiply("*"),
    Divide("/");
                    
    // required java enum stuff 

    public String operator;

    Operators(String operator) {

        this.operator = operator;

    }

    // accessors
    
    public static Operators getOperator(String s) {
        
        for (Operators entry : Operators.values()) {
            
            if (entry.operator.equals(s)) {
                
                return entry;
                
            }
            
        }
        
        return null;
        
    }
    
}