/**
 * Project Name : DogsWithWeapon
 * Created by Mulder on 6/6/2016.
 */
public class Dog extends Animals{

    private Weapon[] bag = new Weapon[3];

    public Dog(){

    }

    public Dog(String name, String description){
        super(name,description);
    }

    public void addWeapon(Weapon weapon){
        for (int i = 0; i < bag.length; i++){
            if(bag[i] == null){
                bag[i] = weapon;
                break;
            }
            else if( i == bag.length -1){
                System.out.println("Bag is full. Cannot add " + weapon.getName() + ".");
            }
        }
    }

    public Weapon[] getBag() {
        return bag;
    }

    public void printWeaponDetails(){
        for (Weapon aBag : bag) {
            if(aBag != null) {
                System.out.println("This bag contain a " + aBag.getName() + ".");
            }
        }
    }
}
