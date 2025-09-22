package KI306.Sterniuk.lab2;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Клас, що описує патрон.
 */
public class Cartridge {
    private Bullet bullet;
    private Shell shell;
    private Gunpowder gunpowder;
    private String caliber;

    /**
     * Конструктор повної ініціалізації.
     */
    public Cartridge(String caliber, Bullet bullet, Shell shell, Gunpowder gunpowder) {
        this.caliber = caliber;
        this.bullet = bullet;
        this.shell = shell;
        this.gunpowder = gunpowder;
    }

    /**
     * Конструктор без кулі (наприклад холостий).
     */
    public Cartridge(String caliber, Shell shell, Gunpowder gunpowder) {
        this.caliber = caliber;
        this.shell = shell;
        this.gunpowder = gunpowder;
        this.bullet = null;
    }

    // === Методи ===
    public String getCaliber() { return caliber; }
    public Bullet getBullet() { return bullet; }
    public Shell getShell() { return shell; }
    public Gunpowder getGunpowder() { return gunpowder; }

    public boolean hasBullet() { return bullet != null; }

    public void replaceBullet(Bullet newBullet) {
        this.bullet = newBullet;
        writeToLog("Куля замінена у патроні калібру " + caliber);
    }

    public void replaceShell(Shell newShell) {
        this.shell = newShell;
        writeToLog("Гільза замінена у патроні калібру " + caliber);
    }

    public void replaceGunpowder(Gunpowder newPowder) {
        this.gunpowder = newPowder;
        writeToLog("Порох замінено у патроні калібру " + caliber);
    }

    public String getInfo() {
        return "Патрон калібр: " + caliber +
                ", Куля: " + (bullet != null ? bullet.getMaterial() : "немає") +
                ", Гільза: " + shell.getMaterial() +
                ", Порох: " + gunpowder.getWeight() + " г";
    }

    // === Логування у файл ===
    public void writeToLog(String message) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("cartridge_log.txt", true))) {
            writer.println(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void closeLogFile() {
        writeToLog("Завершено використання патрона калібру " + caliber);
    }
}
