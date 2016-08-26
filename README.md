# Graph Search Practice

**To get this on your computer:**

1) Clone the repository onto your computer. If you don't know how to do this, open up the terminal and type:

```bash
mkdir sigai
cd sigai
git clone https://github.com/PurdueSIGAI/GraphSearchPractice
```

2) Open up IntelliJ

3) Do File -> Open, select the folder "GraphSearchPractice" where you cloned it (in the "sigai" folder if you executed the above).

**You can run the program by** executing ^r or doing Run -> Run.

When you run the program you can specify if you want to test the BFS or the DFS.

**Your task** is to complete the files "Bfs.java" and "Dfs.java". I recommend you start with DFS, as that will be easier.

The methods you implement will be passed a Maze object as a parameter. These are some useful methods:

```java
public class Maze {
	public Tile getTile(int x, int y);
    public Tile getStartTile();
    public Tile getGoalTile();
    public List<Tile> getAdjacentTiles(Tile tile);
}

public class Tile {
    public int getX();
    public int getY();
    public boolean equals(Tile tile);
}
```
