package command;

public class TurnOnLightCommand implements Command {
    private Light theLight;

    TurnOnLightCommand(Light light) {
        theLight = light;
    }

    public void execute() {
        theLight.turnOn();
    }
}
