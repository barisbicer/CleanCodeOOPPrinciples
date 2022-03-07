package clearoopandprinciples.weapon;

public class Weapon {

	//Apply Encapsulation
    // String weaponName;
    private String weaponName;
    // WeaponType type;
    private WeaponType type;

    public Weapon(String weaponName, WeaponType type) {
        this.weaponName = weaponName;
        this.type = type;
    }

    public WeaponType getType() {
        return type;
    }

    public String getWeaponName() {
        return weaponName;
    }
}
