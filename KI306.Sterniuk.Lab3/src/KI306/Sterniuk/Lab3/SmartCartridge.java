package KI306.Sterniuk.Lab3;

/**
 * Підклас інтелектуального патрона,
 * який реалізує інтерфейси Trackable та Explosive.
 */
public class SmartCartridge extends Cartridge implements Trackable, Explosive {
    private boolean trackingEnabled;
    private boolean selfDestructEnabled;

    public SmartCartridge(String caliber, Bullet bullet, Shell shell, Gunpowder gunpowder) {
        super(caliber, bullet, shell, gunpowder);
        this.trackingEnabled = false;
        this.selfDestructEnabled = false;
    }

    @Override
    public String getInfo() {
        return "Патрон калібр: " + getCaliber() +
               ", Куля: " + (getBullet() != null ? getBullet().getMaterial() : "немає") +
               ", Гільза: " + getShell().getMaterial() +
               ", Порох: " + getGunpowder().getWeight() + " г" +
               ", Відстеження: " + (trackingEnabled ? "увімкнено" : "вимкнено") +
               ", Самознищення: " + (selfDestructEnabled ? "увімкнено" : "вимкнено");
    }

    @Override
    public void enableTracking() {
        trackingEnabled = true;
        writeToLog("Відстеження увімкнено для патрона " + getCaliber());
    }

    @Override
    public void enableSelfDestruct() {
        selfDestructEnabled = true;
        writeToLog("Самознищення увімкнено для патрона " + getCaliber());
    }

    @Override
    public void close() {
        writeToLog("Роботу з патроном " + getCaliber() + " завершено.");
    }
}
