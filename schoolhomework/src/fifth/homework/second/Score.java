package fifth.homework.second;

public class Score {
    public static void scoreCheck(double s) throws MyException {
        if (s < 0 || s > 100) {
            throw new MyException("Out of range!");
        }
    }
}
