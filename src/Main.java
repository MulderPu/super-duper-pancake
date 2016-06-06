import sun.awt.windows.WEmbeddedFrame;

/**
 * Project Name : DogsWithWeapon
 * Created by Mulder on 6/6/2016.
 */
public class Main {
    public static void main(String[] args) {
        Dog puppy = new Dog("Xiao Hui", "A cute puppy.");

        System.out.println(puppy.getName());
        System.out.println(puppy.getDescription());
        System.out.println(puppy.printDetails());
        System.out.println();

        Weapon gun = new Weapon("Handgun", "Small and easy to carry with 12 bullets.");
        Weapon knife = new Weapon("Knife", "A small butter knife.");
        Weapon bomb = new Weapon("Grenade", "Explosive type of weapon.");
        Weapon sniper = new Weapon("Sniper", "Long range rifle.");

        System.out.println(gun.printDetails());
        System.out.println(knife.printDetails());
        System.out.println(bomb.printDetails());
        System.out.println(sniper.printDetails());
        System.out.println();

        puppy.addWeapon(knife);
        puppy.addWeapon(gun);
        puppy.addWeapon(bomb);
        puppy.addWeapon(sniper);
        System.out.println();
        puppy.printWeaponDetails();
    }
}
