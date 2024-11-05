package forth.homework.one;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public final class Adult extends Person implements Card{
    private double money;
    @Override
    public boolean recharge(double money) {
        if (money >= 0) {
            this.money += money;
            return true;
        }
        return false;
    }

    @Override
    public boolean consume() {
        if (money >= 2) {
            money -= 2;
            return true;
        }
        return false;
    }
}
