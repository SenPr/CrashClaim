package net.crashcraft.crashclaim.api.events;

import net.crashcraft.crashclaim.claimobjects.Claim;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class ClaimDownsizeEvent extends Event {

    private final Claim claim;
    private static final HandlerList HANDLERS = new HandlerList();

    public static HandlerList getHandlerList()
    {
        return HANDLERS;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }

    public ClaimDownsizeEvent(Claim claim) {
        this.claim = claim;
    }

    public Claim getClaim() {
        return this.claim;
    }

}
