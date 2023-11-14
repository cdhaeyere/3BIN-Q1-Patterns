public class GrosseBertaFactory implements AbstractFactory{
    @Override
    public Robot createRobot() {
        return new Robot.RobotBuilder("Grosse berta")
                .puissanceBouclier(1)
                .frequenceTir(30)
                .ptVie(80)
                .puissanceCanon(5)
                .build();
    }
}