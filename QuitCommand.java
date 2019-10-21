public class QuitCommand implements Command {

    private Player player;

    /**
     * setup player
     * @param aPlayer type of Player
     */
    public QuitCommand(Player aPlayer)
    {
        this.player = aPlayer;
    }

    /**
     * to execute command
     */
    @Override
    public void execute()
    {
        System.out.println("Game over :(");
    }
}
