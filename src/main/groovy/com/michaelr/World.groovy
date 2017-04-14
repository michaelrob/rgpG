package com.michaelr

import java.awt.Color
import com.michaelr.actors.Actor

class World {
  private Tile[][] tiles
  int width
  int height

  World(Tile[][] tiles) {
    this.tiles = tiles
    this.width = tiles.length
    this.height = tiles[0].length
  }

  Tile tile(int x, int y) {
    if (x < 0 || x >= width || y < 0 || y >= height)
      return Tile.BOUNDS
    else
      return tiles[x][y]
  }

  char glyph(int x, int y) {
    tile(x, y).glyph
  }

  Color color(int x, int y) {
    tile(x, y).color
  }

  void addAtEmptyLocation(Actor actor) {
    int x
    int y

    while (!tile(x,y).isGround()) {
      x = (int)(Math.random() * width)
      y = (int)(Math.random() * height)
    }

    actor.x = x
    actor.y = y
  }
}
