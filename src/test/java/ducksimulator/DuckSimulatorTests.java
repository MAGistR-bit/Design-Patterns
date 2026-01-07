package ducksimulator;

import ducks.Duck;
import ducks.DucksFlock;
import ducks.MallardDuck;
import ducks.ModelDuck;
import ducks.RedheadDuck;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DuckSimulatorTests {

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
