package omikuzi;

public class Omikuzi_hantei {
    public String hantei(int fortune) {
        String answer = null;
        while (0 <= fortune && fortune <= 9) {
            answer = "大吉";
            break;
        }
        while (10 <= fortune && fortune <= 29) {
            answer = "中吉";
            break;
        }
        while (30 <= fortune && fortune <= 59) {
            answer = "小吉";
            break;
        }
        while (60 <= fortune && fortune <= 89) {
            answer = "吉";
            break;
        }
        while (90 <= fortune && fortune <= 99) {
            answer = "凶";
            break;
        }
        return answer;
    }
}
