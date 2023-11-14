public class Robot implements IRobot {
    private int ptVie;
    private final int canon;
    private final int shield;
    private final int freq;
    private String name;

    private Robot(RobotBuilder robot) {
        this.shield = robot.puissanceBouclier;
        this.freq = robot.frequenceTir;
        this.ptVie = robot.ptVie;
        this.canon = robot.puissanceCanon;
        this.name = robot.name;
    }

    @Override
    public int getCanon() {
        return canon;
    }

    @Override
    public int getShield() {
        return shield;
    }

    @Override
    public int getFreq() {
        return freq;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int diffLife(int i) {
        this.ptVie += i;
        return ptVie;
    }

    public static class RobotBuilder {
        private int ptVie = 100;
        private int puissanceCanon = 1;
        private int puissanceBouclier = 1;
        private int frequenceTir = 100;
        private String name;

        public RobotBuilder(String name) {
            this.name = name;
        }

        public RobotBuilder puissanceBouclier(int puissanceBouclier) {
            this.puissanceBouclier = puissanceBouclier;
            return this;
        }

        public RobotBuilder frequenceTir(int frequenceTir) {
            this.frequenceTir = frequenceTir;
            return this;
        }

        public RobotBuilder ptVie(int ptVie) {
            this.ptVie = ptVie;
            return this;
        }

        public RobotBuilder puissanceCanon(int puissanceCanon) {
            this.puissanceCanon = puissanceCanon;
            return this;
        }

        public Robot build() {
            return new Robot(this);
        }
    }
}