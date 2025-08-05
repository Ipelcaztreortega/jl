public class PersonalComputer extends Product{

    // Personal Computer class is composed of these three other classes.
    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboard motherboard;

    // Constructor
    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor, Motherboard motherboard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    };

    private void drawLogo()    {
        monitor.drawPixelAt(1200, 50, "yellow");
    };

    // Will draw the logo
    public void powerUp() {
        computerCase.pressPowerButton();
        drawLogo();
    }
//    // Three getter methods
//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
}
