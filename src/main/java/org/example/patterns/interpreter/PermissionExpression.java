package org.example.patterns.interpreter;

//Abstract expression
public interface PermissionExpression {

	boolean interpret(User user); 
}
