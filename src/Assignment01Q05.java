public class Assignment01Q05 {
    
    public static int findShortestPath(int[][] m, int i, int j) {
        int[] queue = new int[m.length];
        int[] dists = new int[m.length];
        for (int c = 0; c < dists.length; c++) dists[c] = -1;
        dists[i] = 0;
        int q_head = 0;
        queue[0] = i;
        int q_tail = 1;
        int current;
        while (q_head < q_tail){
            current = queue[q_head];
            if (current == j) return dists[j];
            q_head++;
            for (int c = 0; c < m[current].length; c++){
                if (m[current][c] == 1 && dists[c] == -1){
                    dists[c] = dists[current] + 1;
                    queue[q_tail] = c;
                    q_tail++;
                }
            }
        }
        return dists[j];
    }

        public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}