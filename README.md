# Conways_Game_Of_Life

Description:

This is an MVC, Object Oriented implementation of Conway's Game of Life.  For those unfamiliar, the game consists of a grid of "cells".  Cells that are filled in are considered alive while blank cells are considered dead.  Cells will die if they have less than 2 living cells around them or more than 3 living cells around then (around meaning the 8 squares surrounding them).  Cells that have exactly 3 living cells around them will come back to life even if they are dead.  These simple rules allow for some impressive patterns and animated objects to be created.  My current implementation uses a 2D array to represent the board.  The cells are displayed on a black and white 2D grid.  To advance the state of the game (ie. make cells die or revive each turn), the player uses the right arrow key. (Due to the flexibility afforded by MVC, I plan on adding a separate controller that advances the state based on the system clock)  The player can also bring cells to life simply by clicking on them in the grid.

Running the Code:

The code can be pulled and run on any Java IDE using the Main class.
