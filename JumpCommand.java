public class JumpCommand implements Command{

    private Player player;

    /**
     * setup player
     * @param player type of Player
     */
    public JumpCommand(Player player)
    {
        this.player = player;
    }

    /**
     * to execute command
     */
    @Override
    public void execute()
    {
        player.jump();
    }
}
