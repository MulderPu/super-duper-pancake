/**
 * Project Name : DogsWithWeapon
 * Created by Mulder on 6/6/2016.
 */
public class Weapon {
    private String name;
    private String description;

    public Weapon(){

    }

    public Weapon(String name, String description){
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
        return this.getName() + ". " + this.getDescription();
    }
}
