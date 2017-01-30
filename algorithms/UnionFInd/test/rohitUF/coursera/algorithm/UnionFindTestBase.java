package rohitUF.coursera.algorithm;

import org.junit.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Created by rohit on 12/4/2016.
 *
 * Base class for tests of multiple implementations Union Find type.
 */
public abstract class UnionFindTestBase <T extends UnionFind> {
    private T instance;

    /**
     * Pick the implementation of Union Find to test
     * @return An object of type UnionFind
     */
    protected abstract T createInstance();

    @BeforeAll
    public void setup() {
        instance = createInstance();
    }

    

}
