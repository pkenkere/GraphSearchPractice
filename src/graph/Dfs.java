package graph;

import java.util.ArrayList;
import java.util.List;

public class Dfs {
    public static List<Tile> calculateDFS(Maze maze) {
        return dfs(maze.getStartTile(), maze, new ArrayList<Tile>());
    }

    private static List<Tile> dfs(Tile tile, Maze maze, List<Tile> path) {
        tile.visit();
        path.add(tile);
        if (tile.isGoal(maze.getGoalTile().getX(), maze.getGoalTile().getY())) {
            return path;
        } else {
            for (Tile adjTile : maze.getAdjacentTiles(tile)) {
                if (!adjTile.isVisited() && adjTile.isTraversable()) {
                    List<Tile> potentialSolution = dfs(adjTile, maze, path);
                    if (potentialSolution != null)
                        return potentialSolution;
                }
            }
            path.remove(path.size() - 1);
            return null;
        }
    }
}
