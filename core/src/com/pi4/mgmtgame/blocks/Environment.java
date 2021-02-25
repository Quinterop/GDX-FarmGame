package com.pi4.mgmtgame.blocks;

import com.pi4.mgmtgame.resources.Grain;

abstract class Environment extends Block {
    //Skeleton

    //Returns a growing penalty for fields in months
    abstract public int getGrowingPenalty();

    //Checks if a specific grain can be planted in fields on that terrain
    abstract public boolean canSeedGrow(Grain seed);

    //Checks if a specific building can be placed on that terrain
    abstract public boolean canBuild(Structure struct);
}