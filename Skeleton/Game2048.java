   import java.lang.Math;
   import java.io.*;

   public class Game2048 
   {
   //=== *** Provided class variables (Don't delete this section) *** ===//
      final public static int LEFT_INPUT 	= 0;
      final public static int DOWN_INPUT 	= 1;
      final public static int RIGHT_INPUT = 2;
      final public static int UP_INPUT 	= 3;
   
      final public static int VALUE_GRID_SETTING 	= 0;
      final public static int INDEX_GRID_SETTING	= 1;
   
      private String GAME_CONFIG_FILE = "game_config.txt";
   
      private Game2048GUI gui;

   /* position [0][0] represents the Top-Left corner and
    * position [max][max] represents the Bottom-Right corner */
      private int grid [][];
   
   //=== *** Your class variables can be added starting here *** ===//
      private final int EMPTY_SLOT = -1;
   
      private int winningLevel;  
      private long currentScore;
      private int currentLevel;
   
   /**
    * Constructs Game2048 object.
    *
    * @param gameGUI	The GUI object that will be used by this class.
    */   
      public Game2048(Game2048GUI gameGUI)
      {
         gui = gameGUI;
			
			// TO DO:  
			// - create and initialize the grid array
			// - initialize the variables 
			//		- winningLevel (value read from text file)
			//		- currentLevel
			//		- currentScore
			// - insert the first number tile
      }
   
   
   /**
    * Place a new number tile on a random slot on the grid.
	 * This method is called every time a key is released.
    */		
      public void newSlot()
      {
		// TO DO: insert a new number tile on the grid
		// Make sure to check if a new tile should be inserted first
		// (a slide or a tile combination has occurred previously)
      }
   
   
   /**
    * Plays the game by the direction specified by the user.     
	 * This method is called every time a button is pressed
	 */		
      public void play(int direction)
      {
      // TO DO:  implement the action to be taken after an arrow key of the
		// specified direction is pressed.
      }  
   }