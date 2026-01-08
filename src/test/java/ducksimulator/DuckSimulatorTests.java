package ducksimulator;

import ducks.Duck;
import ducks.DucksFlock;
import ducks.MallardDuck;
import ducks.ModelDuck;
import ducks.RedheadDuck;
import ducks.behavior.fly.MockFlyNoWay;
import ducks.behavior.fly.MockFlyRocketPowered;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import output.MockOutputManager;

import static org.assertj.core.api.Assertions.assertThat;

public class DuckSimulatorTests {

    @Test
    void testChangeOfFlyBehavior() {
        String expectedData = "I can't fly!";
        String expectedData2 = "I'm flying with a rocket";

        Duck mallardDuck = new MallardDuck();
        MockOutputManager output = new MockOutputManager();

        mallardDuck.setFlyBehavior(new MockFlyNoWay(output));
        mallardDuck.performFly();
        assertThat(output.getPrintInput()).isEqualTo(expectedData);

        mallardDuck.setFlyBehavior(new MockFlyRocketPowered(output));
        mallardDuck.performFly();
        assertThat(output.getPrintInput()).isEqualTo(expectedData2);
    }

    @DisplayName(value = "Should successful tests for the duck flock.")
    @Test
    void testDucksFlock() {
        DucksFlock ducksFlock = new DucksFlock();
        Duck mallardDuck = new MallardDuck();
        Duck modelDuck = new ModelDuck();
        Duck redheadDuck = new RedheadDuck();

        ducksFlock.addDuck(mallardDuck);
        ducksFlock.addDuck(modelDuck);
        ducksFlock.addDuck(redheadDuck);

        assertThat(ducksFlock.getDuck(0)).isEqualTo(mallardDuck);
        assertThat(ducksFlock.getDuck(1)).isEqualTo(modelDuck);
        assertThat(ducksFlock.getDuck(2)).isEqualTo(redheadDuck);

        ducksFlock.removeDuck(mallardDuck);
        assertThat(ducksFlock.getDuck(0)).isEqualTo(modelDuck);
        assertThat(ducksFlock.getDuck(1)).isEqualTo(redheadDuck);

        assertThat(ducksFlock.getFlockOfDucks().size()).isEqualTo(2);
    }
}
