public class PicVertFactory implements AbstractFactory {
    @Override
    public Robot createRobot() {
        return new Robot.RobotBuilder("Pic vert")
                .puissanceBouclier(2)
                .frequenceTir(150)
                .ptVie(50)
                .puissanceCanon(2)
                .build();
    }
}