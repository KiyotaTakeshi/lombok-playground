import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LombokPlayground {

    @Test
    void name() {
        SupperCar supperCar = new SupperCar();
        supperCar.setName("lexus");
        supperCar.setPrice(100000000);

        SupperCar supperCar2 = new SupperCar();
        // 継承元のクラスのフィールドを異なる値にする
        supperCar2.setName("lexus2");
        supperCar2.setPrice(100000000);

        assertNotEquals(supperCar, supperCar2);
    }
}
