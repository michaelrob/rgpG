package com.michaelr.screens

import java.awt.event.KeyEvent
import asciiPanel.AsciiPanel
import com.michaelr.World
import com.michaelr.WorldBuilder
import com.michaelr.actors.*

class GameScreen implements Screen {
  private World world
  private int centerX
  private int centerY
  private int screenWidth
  private int screenHeight
  private Actor player

  GameScreen(){
    screenWidth = 80
    screenHeight = 21
    createWorld()

    ActorFactory actorFactory = new ActorFactory(world)
    player = actorFactory.newPlayer()
  }

  private void createWorld(){
    world = new WorldBuilder(90, 31).makeCaves().build()
  }

  int getScrollX() {
    BigDecimal second = new BigDecimal(world.width - screenWidth)
    Math.max(0, Math.min(centerX - screenWidth / 2, second))
  }

  int getScrollY() {
    BigDecimal second = new BigDecimal(world.height - screenHeight)
    Math.max(0, Math.min(centerY - screenHeight / 2, second))
  }

  @Override
  void displayOutput(AsciiPanel terminal) {
    int left = getScrollX()
    int top = getScrollY()

    displayTiles(terminal, left, top)

    terminal.write(player.glyph(), player.x - left, player.y - top, player.color())
    terminal.writeCenter("-- press [escape] to lose or [enter] to win --", 22)
  }

  private void displayTiles(AsciiPanel terminal, int left, int top) {
    for (int x = 0; x < screenWidth; x++) {
      for (int y = 0; y < screenHeight; y++) {
        int wx = x + left
        int wy = y + top

        terminal.write(world.glyph(wx, wy), x, y, world.color(wx, wy))
      }
    }
  }

  private void scrollBy(int mx, int my){
    centerX = Math.max(0, Math.min(centerX + mx, world.width - 1))
    centerY = Math.max(0, Math.min(centerY + my, world.height - 1))
  }

  @Override
  Screen respondToUserInput(KeyEvent key) {
    switch (key.getKeyCode()) {
      case KeyEvent.VK_ESCAPE: return new LoseScreen()
      case KeyEvent.VK_ENTER: return new WinScreen()
      case KeyEvent.VK_LEFT:
      case KeyEvent.VK_H: scrollBy(-1, 0); break
      case KeyEvent.VK_RIGHT:
      case KeyEvent.VK_L: scrollBy( 1, 0); break
      case KeyEvent.VK_UP:
      case KeyEvent.VK_K: scrollBy( 0,-1); break
      case KeyEvent.VK_DOWN:
      case KeyEvent.VK_J: scrollBy( 0, 1); break
      case KeyEvent.VK_Y: scrollBy(-1,-1); break
      case KeyEvent.VK_U: scrollBy( 1,-1); break
      case KeyEvent.VK_B: scrollBy(-1, 1); break
      case KeyEvent.VK_N: scrollBy( 1, 1); break
    }

    return this;
  }
}

