# Graph Search Practice

## Pair Programming
We want you to use pair programming for this project. Find someone next to you to team up with.

One of you will be the "driver" (the person who writes the code), and the other person is the "observer", reviewing each line as it is typed and providing feedback if something doesn't look right or if they don't understand what the driver is doing.

You should switch driver and observer when you finish DFS and start BFS, to give both of you equal practice with both rolls, as well as writing graph searching code.

You can read more about pair programming [here.](https://en.wikipedia.org/wiki/Pair_programming)

## Graph Search Resource
[Here](https://docs.google.com/presentation/d/1eASDi99BBHW2Rq1y1On0kcTI53h3Udsp7YOGrS35NVo/edit?usp=sharing) are the slides I used last week. They contain sudocode for implementing DFS and BFS, if you don't know where to start, it's here. 

## Installing
**To get this on your computer:**

1) Clone the repository onto your computer. If you don't know how to do this, open up the terminal and type:

```bash
mkdir sigai
cd sigai
git clone https://github.com/PurdueSIGAI/GraphSearchPractice
```

2) Open up IntelliJ

3) Do File -> Open, select the folder "GraphSearchPractice" where you cloned it (in the "sigai" folder if you executed the above).

## Testing
You can run the program by executing ^r or doing Run -> Run.

When you run the program you can specify if you want to test the BFS or the DFS.

## Your task
Your task is to complete the files "Bfs.java" and "Dfs.java". I recommend you start with DFS, as that will be easier.

## The API
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
