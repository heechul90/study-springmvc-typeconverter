package study.springmvc.typeconverter.type;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class IpPort {

    private String ip;
    public int port;

    public IpPort(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }
}
