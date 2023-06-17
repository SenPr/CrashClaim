package net.crashcraft.crashclaim.pluginsupport.plugins;

import com.ghostchu.quickshop.QuickShop;
import com.ghostchu.quickshop.api.QuickShopAPI;
import com.ghostchu.quickshop.api.shop.Shop;
import net.crashcraft.crashclaim.config.GroupSettings;
import net.crashcraft.crashclaim.pluginsupport.PluginSupport;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Container;
import org.bukkit.block.data.Directional;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class QuickShopHikariSupport implements PluginSupport {

    private QuickShopAPI quickShopAPI;

    @Override
    public boolean isUnSupportedVersion(String version) {
        return (int) version.charAt(0) < 7;
    }

    @Override
    public void onLoad(Plugin plugin) {

    }

    @Override
    public void onEnable(Plugin plugin) {
        quickShopAPI = QuickShopAPI.getInstance();
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
        if (loc.getBlock().getBlockData() instanceof Directional){
            Bukkit.getLogger().info("DEBUG: block is directional");
            return false;
        }
        Shop shop = quickShopAPI.getShopManager().getShop(loc);
        Bukkit.getLogger().info("DEBUG: " + shop);
        return shop != null;
    }

    @Override
    public GroupSettings getPlayerGroupSettings(Player player) {
        return null;
    }
}
