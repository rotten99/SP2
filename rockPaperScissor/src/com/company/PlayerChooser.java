package com.company;

import textui.SysTextUI;
import textui.TextUI;

public class PlayerChooser
{
    TextUI ui = new SysTextUI();
    GameRunner game = new GameRunner();
    Player player1 = null;
    Player player2 = null;

    public void isMultiplayer()
    {

        ui.println("Press enter to continue");
        ui.get();
        ui.clear();
        String[] opponent = {"Two player", "Single player"};
        int chosen = ui.select("Please enter which game mode you would like to play", opponent, "Enter your choice:");
        while (true)
        {
            if (chosen == 0 && player1==null)
            {
                player1 = new HumanPlayer(ui);
                player2 = new HumanPlayer(ui);
                game.runGame(player1, player2, ui);
            }

            else if(chosen==1 && player1 == null)
            {
                player1 = new HumanPlayer(ui);
                player2 = new AIPlayer(ui);
                game.runGame(player1, player2, ui);
            }
            else
            {
                game.runGame(player1, player2, ui);
            }

            String[] playOn = {"Keep playing", "Quit"};
            int play = ui.select("Would you like to keep playing?", playOn, "Enter your choice");

            if (play == 1)
            {
                ui.println(player1.getName("") + " won: " + game.getWins1() + " time(s)");
                ui.println(player2.getName("") + " won: " + game.getWins2() + " time(s)");
                ui.print("You drew: "+game.getDraw()+" time(s)");
                break;
            }
        }
    }
}
