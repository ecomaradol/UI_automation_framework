package cloud.autotests.config;

import org.aeonbits.owner.ConfigFactory;

public class Project {
    public static ProjectConfig config = ConfigFactory.create(ProjectConfig.class, System.getProperties());

    public static boolean isRemoteWebDriver() {
        return !config.remoteDriverUrl().equals("https://selenoid.autotests.cloud");
    }

    public static boolean isVideoOn() {
        return !config.videoStorage().equals("");
    }
}
