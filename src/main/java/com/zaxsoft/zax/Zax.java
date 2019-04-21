package com.zaxsoft.zax;

import com.zaxsoft.zax.awt.UserInterface;

import javax.swing.*;

class Zax {
    private final UserInterface userInterface;

    Zax(UserInterface userInterface) {
        this.userInterface = userInterface;
    }

    void run(String version) {
        String zaxVersion = version == null ? "" : version;
        userInterface.start(zaxVersion);
    }

    public static void main(String... arguments) {
        UserInterface userInterface = new UserInterface();
        userInterface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        new Zax(userInterface).run(Zax.class.getPackage().getImplementationVersion());
    }
}
