package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bfs {
    private static class QueueItem {
        private List<Tile> path;
        private Tile tile;

        public QueueItem(List<Tile> path, Tile tile) {
            this.path = path;
            this.tile = tile;
        }

        public List<Tile> getPath() {
            return path;
        }

        public Tile getTile() {
            return tile;
        }
    }

    public static List<Tile> calculateBFS(Maze maze) {
        Queue<QueueItem> queue = new LinkedList<>();
        queue.add(new QueueItem(new ArrayList<Tile>(), maze.getStartTile()));
        maze.getStartTile().visit();
        while (!queue.isEmpty()) {
            QueueItem queueItem = queue.poll();
            Tile tile = queueItem.getTile();
            List<Tile> path = queueItem.getPath();
            path.add(tile);
            if (tile.isGoal(maze.getGoalTile().getX(), maze.getGoalTile().getY())) {
                return path;
            }
            for (Tile adjTile : maze.getAdjacentTiles(tile)) {
                if (adjTile.isTraversable() && !adjTile.isVisited()) {
                    adjTile.visit();
                    queue.add(new QueueItem(new ArrayList<Tile>(path), adjTile));
                }
            }
        }
        return null;
    }
}
