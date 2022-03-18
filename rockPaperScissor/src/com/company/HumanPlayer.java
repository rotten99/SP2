package com.company;

import textui.TextUI;

public class HumanPlayer implements Player
{
    private TextUI ui;
    private String name;

    public HumanPlayer( TextUI ui)
    {
        this.ui = ui;
        this.name = null;
    }

    public int choice()
    {
        ui.println(getName("")+ " It's your turn. Press Enter to continue");
        ui.get();
        ui.clear();
        String[] options = {"Rock", "Paper", "Scissors"};
        int chosen = ui.select("Choose between:", options, "Enter your choice:");
        return chosen;
    }

    public String getName(String msg)
    {
        if (name==null)
        {
            ui.print(msg+"What is your name?");
            name = ui.get();
            ui.clear();
        }
        return name;
    }

}
