package com.michaelr

class WorldBuilder {
  private int width;
  private int height;
  private Tile[][] tiles

  WorldBuilder(int width, int height) {
    this.width = width
    this.height = height
    this.tiles = new Tile[width][height]
  }

  World build() {
    new World(tiles)
  }
}

/*
package rltut;

public class WorldBuilder {
    private int width;
    private int height;
    private Tile[][] tiles;

    public WorldBuilder(int width, int height) {
        this.width = width;
        this.height = height;
        this.tiles = new Tile[width][height];
    }

    public World build() {
        return new World(tiles);
    }
}
*/
