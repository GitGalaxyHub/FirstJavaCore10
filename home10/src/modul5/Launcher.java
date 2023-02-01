package modul5;

class Launcher {
    public static void main(String[] args) {
        Spaceport spaceport = new Spaceport();
        spaceport.launch();
    }
}

class Spaceport {

    public void launch() {
        gasStation.refuel();
        serviceTower.service();
        compressorStation.compress();
        radar.scan();
        commandPost.command();
    }
    private ServiceTower serviceTower = new ServiceTower();
    private GasStation gasStation = new GasStation();
    private CompressorStation compressorStation = new CompressorStation();
    private Radar radar = new Radar();
    private CommandPost commandPost = new CommandPost();
}
