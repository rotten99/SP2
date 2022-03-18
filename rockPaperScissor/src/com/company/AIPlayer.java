package com.company;

import textui.TextUI;

import java.util.Random;

public class AIPlayer implements Player
{
    TextUI ui;
    private String name = "Computer";
    private Random rnd;
    int choice;

    public  AIPlayer(TextUI ui)
    {
        this.ui=ui;
        rnd = new Random();
    }

    @Override
    public int choice()
    {
        choice = rnd.nextInt(3 );
        return choice;
    }

    @Override
    public String getName(String msg)
    {
        return name;
    }
}
