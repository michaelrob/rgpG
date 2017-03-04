package com.michaelr

import java.awt.Color;

class World {
  private Tile[][] tiles
  int width

  World(Tile[][] tiles) {
    this.tiles = tiles
    this.width = tiles.length
    this.height = tiles[0].length
  }
}

/*

public Tile tile(int x, int y){
  if (x < 0 || x >= width || y < 0 || y >= height)
    return Tile.BOUNDS;
  else
    return tiles[x][y];
}

public char glyph(int x, int y){
  return tile(x, y).glyph();
}

public Color color(int x, int y){
  return tile(x, y).color();
}

*/