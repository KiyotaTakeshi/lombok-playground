import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LombokPlayground {

    @Test
    void callSuper() {
        SupperCar supperCar = new SupperCar();
        supperCar.setName("lexus");
        supperCar.setPrice(100000000);

        SupperCar supperCar2 = new SupperCar();
        // 継承元のクラスのフィールドを異なる値にする
        supperCar2.setName("lexus2");
        supperCar2.setPrice(100000000);

        assertNotEquals(supperCar, supperCar2);
    }

    @Test
    void onlyExplicitlyIncluded() {
        Item item = new Item();
        item.setName("item");
        item.setPrice(100);
        item.setCount(1);

        Item item2 = new Item();
        item2.setName("item");
        item2.setPrice(150);
        item2.setCount(10);

        // name field しか同値クラス判定でチェックしない
        // lombok が生成したコード(Item.class を decompile)
        /*
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            } else if (!(o instanceof Item)) {
                return false;
            } else {
                Item other = (Item)o;
                if (!other.canEqual(this)) {
                    return false;
                } else {
                    Object this$name = this.getName();
                    Object other$name = other.getName();
                    if (this$name == null) {
                        if (other$name != null) {
                            return false;
                        }
                    } else if (!this$name.equals(other$name)) {
                        return false;
                    }

                    return true;
                }
            }
        }
         */
        assertEquals(item, item2);
    }
}
