public class FireCommand implements Command {
    private Player player;

    /**
     * setup player
     * @param player type of Player
     */
    public FireCommand(Player player)
    {
        this.player = player;
    }
    @Override
    /**
     * to execute command
     */
    public void execute()
    {
        player.fire();
    }
}
