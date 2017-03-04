package com.michaelr.screens

import java.awt.event.KeyEvent
import asciiPanel.AsciiPanel

class GameScreen implements Screen {
  void displayOutput(AsciiPanel terminal) {
    terminal.write("You are having fun.", 1, 1)
    terminal.writeCenter("-- press [escape] to lose or [enter] to win --", 22)
  }

  Screen respondToUserInput(KeyEvent key) {
    switch (key.getKeyCode()) {
      case KeyEvent.VK_ESCAPE: return new LoseScreen()
      case KeyEvent.VK_ENTER: return new WinScreen()
    }

    this
  }
}

