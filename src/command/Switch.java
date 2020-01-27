package command;

class Switch {
    private Command flipUpCommand;
    private Command flipDownCommand;

    Switch(Command flipUpCommand, Command flipDownCommand) {
        this.flipUpCommand = flipUpCommand;
        this.flipDownCommand = flipDownCommand;
    }

    void flipUp() {
        flipUpCommand.execute();
    }

    void flipDown() {
        flipDownCommand.execute();
    }
}
