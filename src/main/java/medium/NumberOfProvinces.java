package medium;

public class NumberOfProvinces {
    // https://leetcode.com/problems/number-of-provinces/
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        DisjointSet ds = new DisjointSet(n);
        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++)
                if (isConnected[i][j] == 1) ds.union(i, j);
        return ds.numberOfIslands();
    }
}

class DisjointSet {
    int[] root;
    int[] rank;

    public DisjointSet(int n) {
        root = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            root[i] = i;
            rank[i] = 1; // The initial "rank" of each vertex is 1, because each of them is
            // a standalone vertex with no connection to other vertices.
        }
    }

    public int find(int x) {
        if (x == root[x])
            return x;
        return root[x] = find(root[x]);

    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            if (rank[rootX] > rank[rootY]) root[rootY] = rootX;
            else if (rank[rootX] < rank[rootY]) root[rootX] = rootY;
            else {
                root[rootY] = rootX;
                rank[rootX] += 1;
            }
        }

    }
    public int numberOfIslands() {
        int islands = 0;
        for (int i = 0; i < root.length; i++)
            if (i == root[i])
                islands++;
        return islands;
    }
}
