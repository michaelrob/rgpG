package com.michaelr.screens

import java.awt.event.KeyEvent
import asciiPanel.AsciiPanel

class StartScreen implements Screen {
  @Override
  void displayOutput(AsciiPanel terminal) {
      terminal.write("rgpG -- Groovy Roguelike", 1, 1)
      terminal.writeCenter("-- press [enter] to start --", 22)
  }

  @Override
  Screen respondToUserInput(KeyEvent key) {
      key.getKeyCode() == KeyEvent.VK_ENTER ? new GameScreen() : this
  }
}