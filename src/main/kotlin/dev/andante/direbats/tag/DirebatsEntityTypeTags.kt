package dev.andante.direbats.tag

import dev.andante.direbats.Direbats
import net.minecraft.entity.EntityType
import net.minecraft.tag.TagKey
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object DirebatsEntityTypeTags {
    /**
     * Represents a list of entity types not affected by the effects of a Direbat Fang Arrow.
     */
    val DIREBAT_FANG_ARROW_EFFECTS_IMMUNE = register("direbat_fang_arrow_effects_immune")

    private fun register(id: String): TagKey<EntityType<*>> {
        return TagKey.of(Registry.ENTITY_TYPE_KEY, Identifier(Direbats.MOD_ID, id))
    }
}
