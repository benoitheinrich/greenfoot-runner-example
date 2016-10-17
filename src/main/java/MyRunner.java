import bh.greenfoot.runner.GreenfootRunner;

/**
 * A sample runner for a greenfoot project.
 */
public class MyRunner extends GreenfootRunner {
    static {
        GreenfootRunner.mainClass = MyRunner.class;
    }

    @Override
    protected Configuration getConfiguration() {
        return Configuration.forWorld(Garden.class)
                .projectName("Catch the hedghogs");
    }
}
