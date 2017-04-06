package com.michaelr.actors

import java.awt.Color
import com.michaelr.World

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