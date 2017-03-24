package com.michaelr

import javax.swing.JFrame
import asciiPanel.AsciiPanel
import java.awt.event.KeyEvent
import java.awt.event.KeyListener
import com.michaelr.screens.Screen
import com.michaelr.screens.StartScreen

class ApplicationMain extends JFrame implements KeyListener {
  private static final long serialVersionUID = 1060623638149583738L

  private AsciiPanel terminal
  private Screen screen

  ApplicationMain() {
    super()
    terminal = new AsciiPanel()
    screen = new StartScreen()

    add(terminal)
    pack()
    addKeyListener(this)
    repaint()
  }

  void repaint() {
    terminal.clear()
    screen.displayOutput(terminal)
    super.repaint()
  }

  void keyPressed(KeyEvent e) {
    screen = screen.respondToUserInput(e)
    repaint()
  }

  void keyReleased(KeyEvent e) { }

  void keyTyped(KeyEvent e) { }

  static void main(String[] args) {
    ApplicationMain app = new ApplicationMain()
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
    app.setVisible(true)
  }
}