package interpreter;

// <program> ::= program <command list>
public class ProgramNode extends Node {
    private Node coomandListNode;

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("program");
        coomandListNode = new CommandListNode();
        coomandListNode.parse(context);
    }

    @Override
    public String toString() {
        return "[program " + coomandListNode + "]";
    }

}
