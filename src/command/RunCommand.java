package command;

public class RunCommand {
    public static void main(String[] args) {
        // создаем объект, который будет использоваться
        Light light = new Light();
        // создаем объекты для всех умений объекта Light:
        Command switchUp = new TurnOnLightCommand(light);
        Command switchDown = new TurnOffLightCommand(light);

        // Создается invoker, с которым мы будем непосредственно контактировать:
        Switch s = new Switch(switchUp, switchDown);

        // вот проверка этого, используем методы:
        s.flipUp();
        s.flipDown();
    }
}
