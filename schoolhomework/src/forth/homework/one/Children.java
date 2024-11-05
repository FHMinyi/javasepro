package forth.homework.one;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public final class Children extends Person implements Card{
    double money;
    @Override
    public boolean consume() {
        if (money >= 1) {
            money -= 1;
            return true;
        }
        return false;
    }

    @Override
    public boolean recharge(double money) {
        if (money >= 0) {
            this.money += money;
            return true;
        }
        return false;
    }
}
