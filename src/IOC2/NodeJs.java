package IOC2;

public class NodeJs implements Backend{
    @Override
    public String connect(){
        return "Node Js connected.";
    }
}
