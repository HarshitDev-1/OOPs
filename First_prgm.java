class employee{
    private int id;
    private String name;
    private String location;
    //Setter and getter for id
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
    //Setter and getter for name
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    //Setter and getter for location

    public void setLocation(String n){
        location = n;
    }
    public String getLocation(){
        return location;
    }
}
public class First_prgm {
    public static void main(String[] args) {
        System.out.println("Getting details from the employees");
        //Object for Harshit
        employee harshit = new employee();
        harshit.setId(4160);
        System.out.println("Id no is: "+harshit.getId());
        harshit.setName("Harshit");
        System.out.println("Name is: "+ harshit.getName());
        harshit.setLocation("Lucknow");
        System.out.println("Current Location is: "+harshit.getLocation());
        System.out.println();

        //Object for Mohit
        employee mohit = new employee();
        mohit.setId(6766);
        System.out.println("Id no is "+mohit.getId());
        mohit.setName("Mohit");
        System.out.println("Name is: "+ mohit.getName());
        mohit.setLocation("Delhi");
        System.out.println("Current Location is: "+ mohit.getLocation());


    }
}
