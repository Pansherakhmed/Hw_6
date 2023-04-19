public class Main {
    public static void main(String[] args) {
        Boss bossOne = new Boss();
        bossOne.setHealth(500);
        bossOne.setDamage(50);
        bossOne.setWeapon(new Weapon(WeaponType.GUN, "Desert eagle"));
        System.out.println(bossOne.info());

    }
}