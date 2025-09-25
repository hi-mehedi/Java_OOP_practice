package TypeCastingandinstanceof;

public class BaseTest {
    private String name;
    private int id;

    public BaseTest(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getInfo(){
        return "Name:" + name + " Test id:" +id;
    }
}
