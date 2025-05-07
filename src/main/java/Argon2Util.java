import com.password4j.Argon2Function;
import com.password4j.Password;
import com.password4j.types.Argon2;

public class Argon2Util {
    private static final int ARGON2_HASH_LENGTH = 64;
    private static final int ARGON2_VERSION = 19;
    private static final CharSequence PEPPER = "PEPPER";

    public String hashWithArgon2Defaults(String password) {
        return Password.hash(password).addRandomSalt(32).addPepper(PEPPER).with(getDefaultArgon2Instance()).getResult();
    }

    public boolean equals(String password, String existingHash) {
        return Password.check(password, existingHash).addPepper(PEPPER).with(getArgon2InstanceFromHash(existingHash));
    }

    private Argon2Function getArgon2InstanceFromHash(String existingHash) {
        return Argon2Function.getInstanceFromHash(existingHash);
    }

    private Argon2Function getDefaultArgon2Instance() {
        return Argon2Function.getInstance(128000, 6, 2, ARGON2_HASH_LENGTH, Argon2.ID, ARGON2_VERSION);
    }
}

