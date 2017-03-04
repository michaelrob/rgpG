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