package seminar_3;

public class MainHW {

    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean numberInInterval(int n) {
        return (25 <= n) && (n <= 100);
    }
}
