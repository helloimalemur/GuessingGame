import java.math.*;
public class Player {
    int number;

    public void guess() {
        double n = Math.random() * 10;
        number = (int) n;
        /*number = (int)( Math.random() * 10);*/
    }
}
