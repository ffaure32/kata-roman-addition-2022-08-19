package com.zenika.roman;

public record Conversion(String denormalized, String normalized) {

    public String normalize(String toNormalize) {
        return toNormalize.replace(denormalized, normalized);
    }

    public String denormalize(String toDenormalize) {
        return toDenormalize.replace(normalized, denormalized);
    }

}
