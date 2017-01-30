package rohitUF.coursera.algorithm;

import com.google.common.base.Preconditions;

/**
 * Created by rohit on 12/4/2016.
 * Provides an implementation to UnionFind type, such that connected operation is O(1) but union operation is O(n)
 */
public class QuickFindUF implements UnionFind {
    private int[] id;

    public QuickFindUF(int numberOfPoints) {
        id = new int[numberOfPoints];
        for (int i = 0; i < numberOfPoints; i++) {
            id[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
        Preconditions.checkPositionIndex(p, id.length);
        Preconditions.checkPositionIndex(q, id.length);
        int pid = id[p];
        int qid = id[q];

        // Find all elements that have id as p and convert them to q
        for (int i: id) {
            if (i == pid) {
                i = qid;
            }
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return (id[p] == id[q]);
    }
}
