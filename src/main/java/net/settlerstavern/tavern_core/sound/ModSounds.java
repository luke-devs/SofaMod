package net.settlerstavern.tavern_core.sound;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.settlerstavern.tavern_core.TavernCore;

public class ModSounds {
    public static SoundEvent KRAKEN_IDLE = registerSoundEvent("kraken_idle");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(TavernCore.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

    public static void registerModSounds() {
        TavernCore.LOGGER.debug("Registering mod sounds for Research Table.");
    }

}
