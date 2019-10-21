import java.util.HashMap;

public class InputHandler {
    private HashMap<String, Command> commands; // holds all commands

    /**
     * setup commands
     * @param player a Player class
     */
    public InputHandler(Player player)
    {
        commands = new HashMap<String, Command>();
        JumpCommand jumpCommand = new JumpCommand(player);
        RunCommand runCommand = new RunCommand(player);
        FireCommand fireCommand = new FireCommand(player);
        QuitCommand quitCommand = new QuitCommand(player);
        //setup HashMap
        commands.put("jump", jumpCommand);
        commands.put("run", runCommand);
        commands.put("fire", fireCommand);
        commands.put("quit", quitCommand);

    }

    /**
     * execute different commend by different user input
     * @param button is type of String, a user input
     */
    public void buttonPressed(String button)
    {
        commands.get(button).execute();
    }
}
