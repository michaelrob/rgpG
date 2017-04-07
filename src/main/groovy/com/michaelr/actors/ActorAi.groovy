package rltut;

public class ActorAi {
	protected Actor actor;

	ActorAi(Actor actor) {
		this.actor = actor
		this.actor.setActorAi(this);
	}

	public void onEnter(int x, int y, Tile tile){
	}
}
