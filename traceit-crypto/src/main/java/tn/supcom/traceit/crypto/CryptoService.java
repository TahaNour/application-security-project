package tn.supcom.traceit.crypto;

/** Propriétaire : B. AES-256-GCM, objectId utilisé comme AAD. */
public interface CryptoService {
    byte[] encrypt(byte[] plain, String objectId);
    byte[] decrypt(byte[] blob, String objectId);
}
