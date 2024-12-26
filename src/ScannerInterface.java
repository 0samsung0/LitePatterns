import java.util.Scanner;

public interface ScannerInterface {

    static Scanner scan(){
        Scanner scannerInterface = new Scanner(System.in);
        return scannerInterface;
    }
}
