import com.omnititan.mitnotaniTowerDefence.spawnManagement;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by shaan on 4/08/2016.
 */
public class Main extends JavaPlugin {

    @Override
    public void onEnable(){
        this.getCommand("mtd").setExecutor(new spawnManagement());
    }

    @Override
    public void onDisable(){

    }
}
