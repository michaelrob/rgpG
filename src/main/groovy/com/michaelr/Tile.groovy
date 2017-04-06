package com.michaelr

import java.awt.Color;
import asciiPanel.AsciiPanel;

enum Tile {
  FLOOR(250 as char, AsciiPanel.yellow),
  WALL(177 as char, AsciiPanel.yellow),
  BOUNDS('x' as char, AsciiPanel.brightBlack)

  char glyph
  Color color

  Tile(char glyph, Color color) {
    this.glyph = glyph
    this.color = color
  }
}