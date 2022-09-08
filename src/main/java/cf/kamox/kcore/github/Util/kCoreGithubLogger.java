package cf.kamox.kcore.github.Util;

import org.bukkit.Bukkit;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class kCoreGithubLogger {
    public static String getTIME() {
        Date date = new Date();
        String strDateFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        return sdf.format(date);
    }

    public static void info(String str) {
        kCoreGithubUtil.instance.getLogger().info(str);
        File Logs = new File(kCoreGithubUtil.instance.getDataFolder(), "kCore.log");
        if (!Logs.exists()) {
            try {
                Logs.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileConfiguration configuration = YamlConfiguration.loadConfiguration(Logs);
        configuration.set(kCoreGithubLogger.getTIME() + " [INFO] ", str);
        try {
            configuration.save(Logs);
            configuration.load(Logs);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
        YamlConfiguration.loadConfiguration(Logs);
    }

    public static void warning(String str) {
        kCoreGithubUtil.instance.getLogger().warning(str);
        File Logs = new File(kCoreGithubUtil.instance.getDataFolder(), "kCore.log");
        if (!Logs.exists()) {
            try {
                Logs.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileConfiguration configuration = YamlConfiguration.loadConfiguration(Logs);
        configuration.set(kCoreGithubLogger.getTIME() + " [WARN] ", str);
        try {
            configuration.save(Logs);
            configuration.load(Logs);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
        YamlConfiguration.loadConfiguration(Logs);
    }

    public static void rawInfo(String str) {
        Bukkit.getLogger().info(str);
        File Logs = new File(kCoreGithubUtil.instance.getDataFolder(), "kCore.log");
        if (!Logs.exists()) {
            try {
                Logs.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileConfiguration configuration = YamlConfiguration.loadConfiguration(Logs);
        configuration.set(kCoreGithubLogger.getTIME() + " [RAW INFO] ", str);
        try {
            configuration.save(Logs);
            configuration.load(Logs);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
        YamlConfiguration.loadConfiguration(Logs);
    }
}
