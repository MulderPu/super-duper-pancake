/**
 * Project Name : DogsWithWeapon
 * Created by Mulder on 6/6/2016.
 */
public class Animals {
    private String name;
    private String description;

    public Animals(){

    }

    public Animals(String name, String description){
        this.name = name;
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String printDetails(){
        return this.getName() +". "+ this.getDescription();

    }
}
