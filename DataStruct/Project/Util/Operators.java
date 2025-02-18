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
    
}