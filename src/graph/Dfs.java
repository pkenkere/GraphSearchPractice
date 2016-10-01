package graph;

import java.util.LinkedList;
import java.util.List;

public class Dfs {
        public static List<Tile> calculateDFS(Maze maze){
            Tile start = maze.getStartTile();
            Tile end = maze.getGoalTile();
            List<Tile> path = new LinkedList<>();
            DFS(start, end, path, maze);
            return path;

        }


        public static List<Tile> DFS (Tile currentTile, Tile endTile, List <Tile> path, Maze maze){
            path.add(currentTile);
            if (currentTile == endTile) {
                return path;
            }

            currentTile.visit();
            List<Tile> list;
            for (Tile nextTile : maze.getAdjacentTiles(currentTile)) {
                if (!nextTile.isVisited() && nextTile.isTraversable()) {
                    if ((list = DFS(nextTile, endTile, path, maze)) != null)
                        return list;

                }
            }
            path.remove(currentTile);
            return null;
        }
}
