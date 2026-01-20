import java.util.*;
import java.lang.RuntimeException;
/**
 * Finds the working code word door in the wall.
 *
 * @author Shy Daniell Elle Spivey
 */

public class CodeDoorFinder {
    /**
     * Returns the authors' names.
     *
     * @return The names of the authors of this file.
     */
    public static String getAuthors() {
        return "Shy Daniell and Elle Spivey";
    }

    //location of the door with the working code word
    private long workingDoor;

    //location of the position of the agent
    private long position;

    //to keep track of whether they've looped beyond the boundaries of the board.
    private int loop;

    //number of steps the agent has taken
    private long numSteps;

    //whether the hole has been found
    private boolean doorOpened;

    public static void main(String[] args) {


    }

    public static void findDoor(CodeDoorWall wall) {

        long steps = 1;

        while (!wall.checkCodeWord()) {


            // moving right the correct number of times
            for (int i = 0; i < steps; i++) {
                wall.stepRight();
                if (wall.checkCodeWord()) {
                    return;
                }
            }

            steps = steps * 2;

            // moving left the correct number of times
            for (int i = 0; i < steps; i++) {
                wall.stepLeft();t();
                if (wall.checkCodeWord()) {
                    return;
                }
        }

    }
}

