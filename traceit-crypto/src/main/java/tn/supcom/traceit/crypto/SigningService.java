package tn.supcom.traceit.crypto;

/** Propriétaire : C. Ed25519. */
public interface SigningService {
    byte[] sign(byte[] canonicalJson);
    boolean verify(byte[] data, byte[] sig, String kid);
}
