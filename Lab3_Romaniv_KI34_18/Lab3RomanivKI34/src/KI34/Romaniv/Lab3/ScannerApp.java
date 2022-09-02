/**
 * package KI34.Romaniv.Lab3
 */
package KI34.Romaniv.Lab3;
import java.io.*;

/**
 * Class Main implements main method for class Scanner to demonstrate possibilities of this class
 * @author Romaniv Vitalii
 *
 */
public class ScannerApp {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner();
        scanner.connectPowerCordConnector();
        scanner.connectUSB();
        scanner.turnOnColoredScan();
        scanner.turnOnStartButton();
        scanner.putSmthOnTable();
        scanner.scanning();
        scanner.disconnectPowerCordConnector();
        scanner.dispose();
    }
}
