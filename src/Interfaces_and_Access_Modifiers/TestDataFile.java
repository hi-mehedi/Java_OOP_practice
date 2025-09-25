package Interfaces_and_Access_Modifiers;

public class TestDataFile {
    private String name;
    private  int id;
    private String address;

    public TestDataFile(String name, int id, String address){
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public void SetName(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    protected String getInfo(){
        return String.format("Name is : %s, Id is : %d  Address is : %s",name, id , address);
    }
}
