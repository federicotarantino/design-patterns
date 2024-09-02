package command;

import java.util.HashMap;

import static java.util.stream.Collectors.joining;

public class Invoker {

    private HashMap<String, Command> commands = new HashMap<>();

    public void addAndExecute(String name, Command command) {
        commands.put(name, command);
        command.execute();
    }

    public void listCommands() {
        System.out.println("Commands Available: " + commands.keySet().stream().collect(joining(", ")));
    }

}

