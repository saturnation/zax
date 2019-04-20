package com.zaxsoft.zax;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import com.zaxsoft.zax.awt.UserInterface;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;

public class ZaxTest {
    @Test
    public void callUserInterfaceWithVersion() {
        String version = RandomStringUtils.randomAlphanumeric(25);
        UserInterface userInterface = mock(UserInterface.class);
        new Zax(userInterface).run(version);

        verify(userInterface).start(version);
    }

    @Test
    public void handleNullVersion() {
        UserInterface userInterface = mock(UserInterface.class);
        new Zax(userInterface).run(null);

        verify(userInterface).start("");
    }
}