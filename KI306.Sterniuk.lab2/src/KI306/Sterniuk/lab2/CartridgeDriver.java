package KI306.Sterniuk.lab2;

/**
 * Клас-драйвер для тестування патрона.
 */
public class CartridgeDriver {
    public static void main(String[] args) {
        Bullet bullet1 = new Bullet("свинець", 8.0);
        Shell shell1 = new Shell("латунь", 57.0);
        Gunpowder powder1 = new Gunpowder("димний", 2.5);

        Cartridge cartridge1 = new Cartridge("7.62 мм", bullet1, shell1, powder1);

        System.out.println("Інформація про патрон: " + cartridge1.getInfo());

        // Заміна кулі
        Bullet newBullet = new Bullet("сталь", 9.0);
        cartridge1.replaceBullet(newBullet);
        System.out.println("Після заміни кулі: " + cartridge1.getInfo());

        // Заміна пороху
        Gunpowder newPowder = new Gunpowder("бездимний", 3.0);
        cartridge1.replaceGunpowder(newPowder);
        System.out.println("Після заміни пороху: " + cartridge1.getInfo());

        // Завершення роботи
        cartridge1.closeLogFile();
    }
}
