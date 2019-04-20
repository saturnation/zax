package com.zaxsoft.zax;

import com.zaxsoft.zax.awt.UserInterface;

class Zax {
    public static void main(String... arguments) {
        new Zax(new UserInterface()).run(Zax.class.getPackage().getImplementationVersion());
    }

    private final UserInterface userInterface;
    Zax(UserInterface userInterface) {
        this.userInterface = userInterface;
    }

    void run(String version) {
        String zaxVersion = version == null ? "" : version;
        userInterface.start(zaxVersion);
    }
}
