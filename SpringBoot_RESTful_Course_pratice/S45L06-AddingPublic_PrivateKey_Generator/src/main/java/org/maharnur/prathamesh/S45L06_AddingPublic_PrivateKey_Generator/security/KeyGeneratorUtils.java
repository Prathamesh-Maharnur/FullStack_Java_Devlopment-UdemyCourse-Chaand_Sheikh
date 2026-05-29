package org.maharnur.prathamesh.S45L06_AddingPublic_PrivateKey_Generator.security;

import java.security.KeyPair;
import java.security.KeyPairGenerator;

final class KeyGeneratorUtils {
    
    private KeyGeneratorUtils(){}

    static KeyPair generateKeyPair(){
        
        KeyPair keyPair;
        KeyPairGenerator keyPairGenerator;
        try {
            keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            keyPair = keyPairGenerator.generateKeyPair();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        } 
        return keyPair;
    }
}
