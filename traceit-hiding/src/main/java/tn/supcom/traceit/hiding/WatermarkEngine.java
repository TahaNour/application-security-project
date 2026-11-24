package tn.supcom.traceit.hiding;

import java.awt.image.BufferedImage;
import java.util.Optional;

/** Propriétaire : C. Optional vide = « Indéterminé ». */
public interface WatermarkEngine {
    BufferedImage embed(BufferedImage img, byte[] payload8Bytes, byte[] key);
    Optional<byte[]> extract(BufferedImage img, byte[] key);
}
