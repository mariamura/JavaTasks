package com.mariamura.tasks.patterns.Command;

public class TakeCommand implements Command {
    Library library;

    public TakeCommand(Library library) {
        this.library = library;
    }

    @Override
    public void execute() {
        library.takeBook();
    }
}
