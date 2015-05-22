package minelegends.minigameAPI;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

/*

------------------------
    minigameAPI
------------------------
 Created by: cfletcher
 Created on: 5/21/15
------------------------
All code below is owned by
Cameron Fletcher and is not
to be edited/ copied without
my (Cameron Fletcher)'s permission.

*/
public class MinigameAPI extends JavaPlugin {

    public static String join = "§6§lJOIN> §7";
    public static String quit = "§6§lQUIT> §7";
    public static String death = "§6§lDEATH> §7";
    public static String team = "§6§lTEAM> §7";
    public static String status = "§6§lSTATUS> §7";
    public static String notice = "§6§lNOTICE> §7";

    public static MinigameAPI minigameAPI;

    public static Logger log;

    public void onEnable(){
        log = Bukkit.getLogger();

        minigameAPI = this;

    }

}
