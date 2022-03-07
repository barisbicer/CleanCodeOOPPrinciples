package cleancodeoopprinciples;

import clearoopandprinciples.weapon.Weapon;
import clearoopandprinciples.weapon.WeaponType;

import java.util.ArrayList;

//Single responsibilty--//Liskov Substitution
public class CraftsmanHuman extends Human implements ICHuman {

    private int type;

    public CraftsmanHuman(String humanName) {
        super(humanName, null);
    }
    
    public Weapon getWeapon(){
      	return weapon;
    }
 
    @Override
    public Weapon craftWeapon(WeaponType type) {

        String weaponName = "undefined";

        if (type == WeaponType.knife) {
            weaponName = "knife";
        } else if (type == WeaponType.riffle) {
            weaponName = "riffle";
        } else if (type == WeaponType.sword) {
            weaponName = "sword";
        }

        weapon = new Weapon(weaponName, type);
        System.out.println(weaponName + " is created by " + getHumanName());
        return weapon;
    }
}
