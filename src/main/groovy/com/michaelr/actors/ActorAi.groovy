package com.michaelr.actors;

import com.michaelr.Tile

public class ActorAi {
	protected Actor actor;

	ActorAi(Actor actor) {
		this.actor = actor
		this.actor.setActorAi(this)
	}

	void onEnter(int x, int y, Tile tile){
	}
}
