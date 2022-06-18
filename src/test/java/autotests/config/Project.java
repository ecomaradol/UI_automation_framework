package autotests.config;

import org.aeonbits.owner.ConfigFactory;

public class Project {
    public static CredentialsConfig config = ConfigFactory.create(CredentialsConfig.class, System.getProperties());

    public static boolean isRemoteWebDriver() {
        return !config.remoteDriverUrl().equals("");
    }
    public static String getWebRemoteDriver() {
        return String.format(config.remoteDriverUrl(),
                config.remoteDriverUser(),
                config.remoteDriverPassword());
    }

    public static boolean isVideoOn() {
        return !config.videoStorage().equals("");
    }
}
