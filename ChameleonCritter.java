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
import info.gridworld.grid.*;
import java.awt.Color;

import java.util.ArrayList;

/**
 * A <code>ChameleonCritter</code> takes on the color of neighboring actors as
 * it moves through the grid. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class ChameleonCritter extends Critter {

    public static final double DARKENING_FACTOR = 0.05;
    
   public void processActors(ArrayList<Actor> actors) { 
        int n = actors.size(); 
        if (n == 0) { 
            darken(); 
            return; 
        } 

        int r = (int) (Math.random() * n); 
        Actor other = actors.get(r); 
        setColor(other.getColor()); 
    } 

    private void darken() { 
        Color c = getColor(); 
        int red = (int) (c.getRed() * (1 - DARKENING_FACTOR)); 
        int green = (int) (c.getGreen() * (1 - DARKENING_FACTOR)); 
        int blue = (int) (c.getBlue() * (1 - DARKENING_FACTOR)); 
 
        setColor(new Color(red, green, blue)); 
    }
}