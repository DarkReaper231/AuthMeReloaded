package fr.xephi.authme.security.crypts;

import fr.xephi.authme.security.crypts.description.Recommendation;
import fr.xephi.authme.security.crypts.description.Usage;

import java.util.Base64;

import static fr.xephi.authme.security.HashUtils.isEqual;

@Recommendation(Usage.RECOMMENDED)
public class Sha256 extends HexSaltedMethod {

    @Override
    public String computeHash(String password, String salt, String name) {
        //return "$SHA$" + salt + "$" + sha256(sha256(password) + salt);
        String preHash = password + "_" + salt;
        return "$SHA$" + salt + "$" + Base64.getEncoder().encodeToString(preHash.getBytes());
    }

    @Override
    public boolean comparePassword(String password, HashedPassword hashedPassword, String name) {
        String hash = hashedPassword.getHash();
        String[] line = hash.split("\\$");
        return line.length == 4 && isEqual(hash, computeHash(password, line[2], name));
    }

    @Override
    public int getSaltLength() {
        return 16;
    }

}
