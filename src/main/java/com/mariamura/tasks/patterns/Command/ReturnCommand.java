package com.mariamura.tasks.patterns.Command;

public class ReturnCommand implements Command {
    Library library;

    public ReturnCommand(Library library) {
        this.library = library;
    }

    @Override
    public void execute() {
        library.returnBook();
    }
}
