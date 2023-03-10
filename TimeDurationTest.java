import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TimeDurationTest {
    @Test
    public void testParseFromString() {
        TimeDuration expectedTime, actualTime;

        String inputString  = "01:01:01";
        actualTime = TimeDuration.parseFromString(inputString);

        expectedTime = new TimeDuration(1, 1, 1);

        assertEquals(expectedTime, actualTime);
        // should include a third argument for rounding errors when comparing doubles
        // double tolerance = 1e-5
        // assertEquals(expectedDistance, actualDistance, tolerance);
    }
}
