package command;

public class TurnOffLightCommand implements Command {
    private Light theLight;

    TurnOffLightCommand(Light light) {
        theLight = light;
    }

    public void execute() {
        theLight.turnOff();
    }
}
