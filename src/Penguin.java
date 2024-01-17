public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }
    @Override
    public String fly(){
        return getName() + " не літає";
    }
    public String swim(){
        return getName() + " плаває";
    }
}
