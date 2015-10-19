package crypto.asymmetric.interfaces;

import java.security.interfaces.ECPrivateKey;

public interface PrivateKey extends ECPrivateKey {
	public String toHexString();
}
