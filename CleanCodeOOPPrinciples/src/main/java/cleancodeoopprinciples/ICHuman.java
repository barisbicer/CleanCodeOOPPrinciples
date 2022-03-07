package cleancodeoopprinciples;



import clearoopandprinciples.weapon.Weapon;
import clearoopandprinciples.weapon.WeaponType;

//interface segregation
public interface ICHuman{

	public Weapon craftWeapon(WeaponType type);

	
}
