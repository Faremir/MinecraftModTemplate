package io.github.faremir.modtemplate;

import net.minecraft.gametest.framework.GameTestHelper;

public class ModTemplateTests {

    private static final int TEST_TIMEOUT = 300;

    /**
     * Initializes test values.
     */
    private static TestSetup initSetup(GameTestHelper context) {
        TestSetup setup = new TestSetup();
        return setup;
    }

    /**
     * Common Test values.
     */
    private record TestSetup() {
    }

}