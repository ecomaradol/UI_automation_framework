package autotests.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/credentials.properties",
        "classpath:config/local.properties",
        "classpath:config/remote.properties"
})
public interface CredentialsConfig extends Config {

    @DefaultValue("chrome")
    String browser();
    @DefaultValue("100.0")
    String browserVersion();
    @DefaultValue("1920x1080")
    String browserSize();
    String remoteDriverUrl();
    String remoteDriverUser();
    String remoteDriverPassword();
    String videoStorage();
    @DefaultValue("https://www.dji.com")
    String webUrl();

}
