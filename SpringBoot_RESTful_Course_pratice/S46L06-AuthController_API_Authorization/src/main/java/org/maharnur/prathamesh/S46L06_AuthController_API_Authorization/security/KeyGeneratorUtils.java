package org.maharnur.prathamesh.S46L06_AuthController_API_Authorization.security;

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
