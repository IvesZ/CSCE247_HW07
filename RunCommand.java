public class RunCommand implements Command {
    private Player player;

    /**
     * setup player
     * @param player type of Player
     */
    public RunCommand(Player player)
    {
        this.player = player;
    }
    /**
     * to execute command
     */
    @Override
    public void execute()
    {
        player.runForward();
    }
}
