package rohitUF.coursera.algorithm;
/**
 * Created by rohit on 12/4/2016.
 * A datatype to easily perform union find operations.
 */
public interface UnionFind {
    /**
     * Connect two points p and q
     * @param p - First point to connect
     * @param q - Second point to connect
     */
    public void union(int p, int q);

    /**
     * Returns if point p is connected to point q.
     * @param p - First point to test connection.
     * @param q - Second point to test connection.
     * @return - True if p and q are connected, false otherwise.
     */
    public boolean connected(int p, int q);
}
