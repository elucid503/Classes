package Project.Util;

public enum Operators {

    // Operators

    Add("+"),
    Subtract("-"),
    Multiply("*"),
    Divide("/");
                    
    // Enum stuff 

    public String operator;

    Operators(String operator) {

        this.operator = operator;

    }
    
    public static Operators getOperator(String s) {
        
        for (Operators entry : Operators.values()) {
            
            if (entry.operator.equals(s)) {
                
                return entry;
                
            }
            
        }
        
        return null;
        
    }
    
}