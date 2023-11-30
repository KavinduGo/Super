public class englandCricket {
    void playing() {
        System.out.println("Bowling");
    }
}
class srilankaCricket extends englandCricket {
    @Override
    void playing() {
        System.out.println("Batting");

    }
    void practising() {
        System.out.println("Fielding");
    }
    void selection() {
        super.playing();
        practising();
    }
}
class testRun {
    public static void main(String[] args) {
        srilankaCricket slc = new srilankaCricket();
        slc.selection();
    }
}
