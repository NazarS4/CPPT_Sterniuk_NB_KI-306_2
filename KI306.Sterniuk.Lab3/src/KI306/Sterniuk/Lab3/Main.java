package KI306.Sterniuk.Lab3;

/**
 * Клас-драйвер для перевірки роботи інтелектуального патрона.
 */
public class Main {
    public static void main(String[] args) {
        Bullet bullet = new Bullet("сталь", 9.0);
        Shell shell = new Shell("латунь", 57.0);
        Gunpowder powder = new Gunpowder("бездимний", 3.0);

        SmartCartridge smartCartridge = new SmartCartridge("7.62 мм", bullet, shell, powder);

        System.out.println(smartCartridge.getInfo());
        smartCartridge.enableTracking();
        smartCartridge.enableSelfDestruct();
        System.out.println(smartCartridge.getInfo());
        smartCartridge.close();
    }
}
