package app;

import org.jetbrains.annotations.NotNull;

public class App {

    public String name() {
        return "Java native-image";
    }

    static void main(@NotNull String @NotNull ... args) {
        IO.println(new App().name());
    }
}
