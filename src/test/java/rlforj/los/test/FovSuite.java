/*
 * Copyright (c) 2017, Fabio Ticconi, fabio.ticconi@gmail.com
 * Copyright (c) 2013, kba
 * All rights reserved.
 */

package rlforj.los.test;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Currently not working
 *
 * @author sdatta
 */
public class FovSuite extends TestSuite
{
    public FovSuite()
    {
        addTestSuite(FovPrecisePermissiveTest.class);
    }

    public static Test suite()
    {
        final TestSuite s = new TestSuite();
        s.addTestSuite(FovPrecisePermissiveTest.class);
        s.addTestSuite(FovShadowCastingTest.class);
        return s;
    }
}
