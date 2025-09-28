package KI306.Sterniuk.Lab3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Абстрактний клас, що описує патрон.
 * Містить основні характеристики: куля, гільза, порох та калібр.
 */
public abstract class Cartridge {
    private Bullet bullet;
    private Shell shell;
    private Gunpowder gunpowder;
    private String caliber;

    /**
     * Конструктор для ініціалізації патрона.
     * @param caliber калібр патрона
     * @param bullet куля
     * @param shell гільза
     * @param gunpowder порох
     */
    public Cartridge(String caliber, Bullet bullet, Shell shell, Gunpowder gunpowder) {
        this.caliber = caliber;
        this.bullet = bullet;
        this.shell = shell;
        this.gunpowder = gunpowder;
    }

    /**
     * Абстрактний метод для отримання інформації про патрон.
     * Реалізується у підкласах.
     */
    public abstract String getInfo();

    public String getCaliber() { return caliber; }
    public Bullet getBullet() { return bullet; }
    public Shell getShell() { return shell; }
    public Gunpowder getGunpowder() { return gunpowder; }

    /**
     * Логування дій у файл
     */
    public void writeToLog(String message) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("cartridge_log.txt", true))) {
            writer.println(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Абстрактний метод для закриття патрона (коректне завершення роботи).
     */
    public abstract void close();
}
