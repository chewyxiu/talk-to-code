package ast;

public class ASTLoop extends ASTNode{
	
	public String loopType;
	public String loopCondition;
	
	ASTLoop(ASTNode p)
	{
		super(p);
		loopType = "";
		loopCondition = "";
	}
	
	public String print()
	{
		String ret = "";
		if (loopType.equals("for"))
		{
			ret = "for(int i = 0; " + loopCondition + "; i++)" +  "{ } \n";
		}
		
		else
		{
			ret = "while(" + loopCondition + ")" + "{ } \n";
		}
	/*	String ret = functionName+"(";
		for(int i = 0; i<functionParameters.size(); i++)
		{
			if(i!=functionParameters.size()-1)
				ret=ret.concat(functionParameters.get(i).trim()+", ");
			else
				ret=ret.concat(functionParameters.get(i).trim());
		}
		ret=ret.concat(");\n");
		*/
		return ret;
	}
	
}
