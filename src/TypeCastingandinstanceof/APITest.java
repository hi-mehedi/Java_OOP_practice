package TypeCastingandinstanceof;


public class APITest extends BaseTest {
    private String endPoint;

    public APITest(String name,int id, String endPoint){
        super(name , id);
        this.endPoint = endPoint;
    }

    public String getEndPoint(){
        return endPoint;
    }
}
