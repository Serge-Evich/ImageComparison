package main.app;

import java.awt.*;

public class App {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                final AppFrame appFrame = new AppFrame();
            }
        });
    }
}
