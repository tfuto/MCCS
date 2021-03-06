package  expression;

import java.util.HashMap;
import java.util.HashSet;

public class MinNode implements ExpressionNode {
	ExpressionNode RightOperand = null;
	
	public MinNode(ExpressionNode rightOperand){
		this.RightOperand = rightOperand;
	}

	public int evaluate(int[] stateVector, ExpressionError errorCode){
		return -RightOperand.evaluate(stateVector, errorCode);
	}
	
	public void addVariables(HashSet<VarNode> variables){
		RightOperand.addVariables(variables);
	}
	
	@Override
	public String toString(){
		return "-" + RightOperand.toString();
	}
	
	public ExpressionNode copy(HashMap<String, VarNode> variables){
		return new MinNode(this.RightOperand.copy(variables));
	}
}
