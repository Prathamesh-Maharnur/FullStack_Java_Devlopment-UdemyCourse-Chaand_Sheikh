package org.maharnur.prathamesh.S46L11_AuthController_DeleteProfile.security;

import java.security.KeyPair;
import java.security.KeyPairGenerator;

import org.springframework.stereotype.Component;

@Component
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
