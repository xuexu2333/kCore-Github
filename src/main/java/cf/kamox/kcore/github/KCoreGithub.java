package cf.kamox.kcore.github;

import cf.kamox.kcore.github.Enum.kCoreGithubEnum;
import cf.kamox.kcore.github.Util.kCoreGithubLogger;
import cf.kamox.kcore.github.Util.kCoreGithubUtil;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class KCoreGithub extends JavaPlugin {

    @Override
    public void onLoad() {
        kCoreGithubUtil.instance = this;
        kCoreGithubUtil.descriptionFile = getDescription();
        if (!kCoreGithubUtil.descriptionFile.getName().equals(kCoreGithubEnum.PLUGIN_NAME.getMessage())) {
            kCoreGithubLogger.warning(kCoreGithubEnum.PLUGIN_RENAMEWARNING.getMessage());
            Bukkit.shutdown();
        }
        kCoreGithubLogger.info(kCoreGithubEnum.PLUGIN_LOAD.getMessage());
    }

    @Override
    public void onEnable() {
        kCoreGithubLogger.info(kCoreGithubEnum.PLUGIN_Enable.getMessage());
    }

    @Override
    public void onDisable() {
        kCoreGithubLogger.info(kCoreGithubEnum.PLUGIN_DISABLE.getMessage());
        kCoreGithubUtil.instance = null;
        kCoreGithubUtil.descriptionFile = null;
    }
}
