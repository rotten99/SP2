package com.company;

import textui.TextUI;

public class GameRunner
{
    private TextUI ui;

    public int getWins1()
    {
        return wins1;
    }

    public int getWins2()
    {
        return wins2;
    }

    public int getDraw()
    {
        return draw;
    }

    private int wins1 = 0;
    private int wins2 = 0;
    private int draw = 0;

    public void runGame(Player player1, Player player2, TextUI ui)
    {
        this.ui = ui;


        player1.getName("Player 1: ");
        player2.getName("Player 2: ");


        int choice1 = player1.choice();
        ui.clear();
        int choice2 = player2.choice();
        int answer = evaluate(choice1, choice2);
        switch (answer)
        {

            case 0:
                ui.println("It's a draw");
                ++draw;
                break;
            case 1:
                ui.println(player1.getName("") + ", You won!");
                ++wins1;
                break;
            case 2:
                ui.println(player2.getName("") + ", You won!");
                ++wins2;
                break;
            default:
                throw new RuntimeException("Something went horrible wrong!!!!");
        }

    }

    private int evaluate(int choice1, int choice2)
    {
        if (choice1 == choice2)
        {
            return 0;
        }

        else if (choice1 == 0 && choice2 == 2)
        {
            return 1;
        }

        else if (choice1 == 1 && choice2 == 0)
        {
            return 1;
        }

        else if (choice1 == 2 && choice2 == 1)
        {
            return 1;
        }
        return 2;
    }

}



