package io.github.cutecarsmc;

import net.minecraft.resources.Identifier;

public final class CuteCars {
    public static final String MOD_ID = "@MODID@";
    public static final String VERSION = "@VERSION@";
    public static final String COMMIT_HASH = "@COMMIT_HASH@";

    public static Identifier identifier(final String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
}
