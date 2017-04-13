package com.michaelr.actors

import com.michaelr.Tile

class PlayerAi extends ActorAi {
  PlayerAi(Actor actor) {
    super(actor)
  }

  void onEnter(int x, int y, Tile tile) {
    if (tile.isGround()) {
        actor.x = x
        actor.y = y
    } else if (tile.isDiggable()) {
        actor.dig(x, y)
    }
  }
}