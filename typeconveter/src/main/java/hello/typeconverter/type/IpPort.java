package hello.typeconverter.type;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class IpPort {
	private String ip;
	private int port;
	
	public IpPort(String ip, int port) {
		super();
		this.ip = ip;
		this.port = port;
	}
	
}
