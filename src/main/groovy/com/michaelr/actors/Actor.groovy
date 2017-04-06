package com.michaelr.actors

import java.awt.Color

class Actor {
  private World world

  int x
  int y

  char glyph
  Color color

  Actor(World world, char glyph, Color color) {
    this.world = world
    this.glyph = glyph
    this.color = color
  }
}