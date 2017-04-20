package com.michaelr.actors

import asciiPanel.AsciiPanel
import com.michaelr.World

class ActorFactory {
	World world

	ActorFactory(World world) {
		this.world = world
	}

	Actor newPlayer() {
		Actor player = new Actor(world, '@' as char, AsciiPanel.brightWhite)
		world.addAtEmptyLocation(player)
		new PlayerAi(player)

		return player
	}
}