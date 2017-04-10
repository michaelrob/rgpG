package com.michaelr.actors;

public class PlayerAi extends ActorAi {
  public PlayerAi(Actor actor) {
    super(actor)
  }

  void onEnter(int x, int y, Tile tile) {
    if (tile.isGround()) {
        creature.x = x
        creature.y = y
    } else if (tile.isDiggable()) {
        creature.dig(x, y)
    }
  }
}