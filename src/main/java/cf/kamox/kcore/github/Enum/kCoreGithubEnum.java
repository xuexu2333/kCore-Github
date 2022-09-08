package cf.kamox.kcore.github.Enum;

import cf.kamox.kcore.github.Util.kCoreGithubUtil;
import org.bukkit.ChatColor;

public enum kCoreGithubEnum {
    PLUGIN_NAME("kCore-Github"),
    PLUGIN_LOAD("Loaded " + kCoreGithubUtil.descriptionFile.getName() + " v" + kCoreGithubUtil.descriptionFile.getVersion()),
    PLUGIN_Enable("Enable " + kCoreGithubUtil.descriptionFile.getName() + " v" + kCoreGithubUtil.descriptionFile.getVersion()),
    PLUGIN_DISABLE("Disable " + kCoreGithubUtil.descriptionFile.getName() + " v" + kCoreGithubUtil.descriptionFile.getVersion()),
    PLUGIN_RENAMEWARNING("Dont edit/rename plugin name!, Please re-download this plugin!"),
    ADMIN_PERMISSION("kcore.admin");

    private final String message;

    kCoreGithubEnum(String message) {
        this.message = message;
    }

    public static String format(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }

    public String getMessage() {
        return message;
    }
}
