package IOC2;

public class Django implements Backend {

    @Override
    public String connect(){
        return "Django Connected.";
    }
}
