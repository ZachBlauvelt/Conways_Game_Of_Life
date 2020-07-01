package model;

/**
 * A representation of the Game of Life that uses a 2D array to represent the game board.
 */
public class ArrayModel implements Model {
  private boolean[][] grid;

  // a constructor that allows the user to input the size of the board
  public ArrayModel(int x, int y) {
    this.grid = new boolean[y][x];
  }

  // a constructor with default dimensions
  public ArrayModel() {
    this.grid = new boolean[50][50];
  }

  @Override
  public void resurrect(int x, int y) {
    grid[y][x] = !grid[y][x];
  }

  @Override
  public void update() {
    boolean[][] replace = new boolean[grid.length][grid[0].length];
    for (int x = 0; x < grid[0].length; x++) {
      for (int y = 0; y < grid.length; y++) {
        int neighbors = this.countNeighbors(x, y);
        if (!grid[y][x]) {
          if (neighbors == 3) {
            replace[y][x] = true;
          }
        } else {
          if (neighbors == 2 || neighbors == 3) {
            replace[y][x] = true;
          }
        }
      }
    }
    this.grid = replace;
  }

  @Override
  public boolean isAlive(int x, int y) {
    return grid[y][x];
  }

  @Override
  public int[] dimensions() {
    if (grid == null) {
      return new int[] {0,0};
    }
    return new int[] {grid[0].length, grid.length};
  }

  /**
   * Returns the number of cells that are alive within the 8 cells surrounding the cell at x,y.
   */
  private int countNeighbors(int x, int y) {
    int count = 0;

    if (y - 1 >= 0) {
      for (int i = 0; i < 3; i++) {
        if (x - 1 + i >= 0 && x - 1 + i < grid[0].length) {
          if (grid[y - 1][x - 1 + i]) {
            count++;
          }
        }
      }
    }

    if (y + 1 < grid.length) {
      for (int i = 0; i < 3; i++) {
        if (x - 1 + i >= 0 && x - 1 + i < grid[0].length) {
          if (grid[y + 1][x - 1 + i]) {
            count++;
          }
        }
      }
    }

    if (x - 1 >= 0) {
      if (grid[y][x - 1]) {
        count++;
      }
    }

    if (x + 1 < grid[0].length) {
      if (grid[y][x + 1]) {
        count++;
      }
    }

    return count;
  }
}
