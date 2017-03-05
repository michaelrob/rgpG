package com.michaelr

import java.awt.Color;
import asciiPanel.AsciiPanel;

enum Tile {
  FLOOR((char)250, AsciiPanel.yellow),
  WALL((char)177, AsciiPanel.yellow),
  BOUNDS('x', AsciiPanel.brightBlack)

  char glyph
  Color color

  Tile(char glyph, Color color) {
    this.glyph = glyph
    this.color = color
  }
}