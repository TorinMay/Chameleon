/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 * @author Cay Horstmann
 */

import info.gridworld.actor.Actor; 
import info.gridworld.actor.Critter; 
import info.gridworld.actor.Flower; 
import info.gridworld.grid.*;
 
import java.util.ArrayList; 
 
/** 
 * A <code>ChameleonKid</code> takes on the color of neighboring actors 
 * that are in front or behind as it moves through the grid. <br /> 
 */ 
public class ChameleonKid extends ChameleonCritter { 

    public ArrayList<Actor> getActors() { 
        ArrayList<Actor> actors = new ArrayList<Actor>(); 
        int[] dirs = { Location.AHEAD, Location.HALF_CIRCLE }; 
        for (Location loc : getLocationsInDirections(dirs)) { 
            Actor a = getGrid().get(loc); 
            if (a != null) {
                actors.add(a); 
            } 
 
            return actors; 
        }
    }
}