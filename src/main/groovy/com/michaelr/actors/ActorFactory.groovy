package com.michaelr.actors

import asciiPanel.AsciiPanel

class ActorFactory {
	World world
	
	ActorFactory(World world) {
		this.world = world
	}

	Actor newPlayer() {
		Actor player = new Actor(world, '@', AsciiPanel.brightWhite)
		world.addAtEmptyLocation(player)
		new PlayerAi(player)
		
		return player
	}
}
