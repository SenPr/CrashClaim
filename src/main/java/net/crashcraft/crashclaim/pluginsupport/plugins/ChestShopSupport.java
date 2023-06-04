package net.crashcraft.crashclaim.pluginsupport.plugins;

import com.Acrobot.ChestShop.Signs.ChestShopSign;
import net.crashcraft.crashclaim.config.GroupSettings;
import net.crashcraft.crashclaim.pluginsupport.PluginSupport;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class ChestShopSupport implements PluginSupport {


    @Override
    public boolean isUnSupportedVersion(String version) {
        return (int) version.charAt(0) < 3;
    }

    @Override
    public void onLoad(Plugin plugin) {

    }

    @Override
    public void onEnable(Plugin plugin) {
        Plugin chestshop = Bukkit.getPluginManager().getPlugin("ChestShop");
    }

    @Override
    public void disable() {

    }

    @Override
    public boolean canClaim(Location minLoc, Location maxLoc) {
        return true;
    }

    @Override
    public boolean canInteract(Player player, Location loc) {
        Block block = loc.getBlock();
        return ChestShopSign.isValid(block);
    }

    @Override
    public GroupSettings getPlayerGroupSettings(Player player) {
        return null;
    }
}
