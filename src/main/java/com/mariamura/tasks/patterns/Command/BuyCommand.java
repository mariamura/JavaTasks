package com.mariamura.tasks.patterns.Command;

public class BuyCommand implements Command{
    Library library;

    public BuyCommand(Library library) {
        this.library = library;
    }

    @Override
    public void execute() {
        library.buyBook();
    }
}
