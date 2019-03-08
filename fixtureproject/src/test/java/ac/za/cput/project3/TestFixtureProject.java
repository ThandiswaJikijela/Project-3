package ac.za.cput.project3;

import org.junit.*;
import org.junit.rules.Timeout;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertSame;
import static org.junit.Assert.assertNotSame;


public class TestFixtureProject {
    private FixtureProject fixture;

    @Before
    public void setUp() throws Exception{
        fixture = new FixtureProject();
    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void testObjectEquality() throws Exception
    {
        assertEquals("HelloWorld", fixture.concatString("Hello","World"));
    }

    @Test
    public void testObjectIdentity() {
        // if(b1 == b2)
        assertNotSame("b1", "b2");    // THIS TEST will pass
        // if(b1 == b1)
        assertSame("b1","b1");    // will pass
    }

    @Test
    public void testFailingTest() throws Exception
    {
        List<String> colours = fixture.FailTest();

        Assert.fail("This test has failed");
    }

    @Test(timeout = 1000)
    public void test()
    {
        Map map = fixture.Map();
    }

    @Ignore("Test is ignored as a demonstration")
    @Test
    public void testIgnore() {
        Assert.assertEquals(76,fixture.add(60,7,9));
    }

}
