package com.michaelr.actors

import java.awt.Color
import com.michaelr.World

class Actor {
  private World world
  private ActorAi ai

  int x
  int y

  char glyph
  Color color

  Actor(World world, char glyph, Color color) {
    this.world = world
    this.glyph = glyph
    this.color = color
  }

  void setActorAi(ActorAi ai) {
    this.ai = ai
  }

  void moveBy(int mx, int my){
    ai.onEnter(x+mx, y+my, world.tile(x+mx, y+my));
  }

  void dig(int wx, int wy) {
    world.dig(wx, wy)
  }
}