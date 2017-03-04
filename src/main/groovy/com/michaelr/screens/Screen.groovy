package com.michaelr.screens

import java.awt.event.KeyEvent
import asciiPanel.AsciiPanel

interface Screen {
  void displayOutput(AsciiPanel terminal)

  Screen respondToUserInput(KeyEvent key)
}