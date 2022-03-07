package cleancodeoopprinciples;

import java.util.Optional;

import clearoopandprinciples.weapon.Weapon;
import clearoopandprinciples.weapon.WeaponType;

public class ClearOOPAndPrinciples {

    public static void main(String[] args) {

    	//Dependency inverison
    	ICHuman craftsmanHuman = new CraftsmanHuman("Craftsman");
    	
        //CraftsmanHuman craftsmanHuman = new CraftsmanHuman("Craftsman");

    	//craftsmanHuman.craftWeapon(WeaponType.riffle);
    	
    	Optional<Weapon> weapon =  Optional.ofNullable(craftsmanHuman.craftWeapon(WeaponType.riffle));
    	
    	//Weapon weapon = craftsmanHuman.craftWeapon(WeaponType.riffle);//craftsmanHuman.getWeapon();

       // WarriorHuman warriorHuman = new WarriorHuman("Warrior", weapon);
       //Open-Closed Principle
       
    	IWHuman warriorHuman = new WarriorHuman("Warrior", weapon.get());
       
        warriorHuman.useWeapon();
    }

}
