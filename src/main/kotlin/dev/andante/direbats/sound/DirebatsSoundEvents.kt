package dev.andante.direbats.sound

import dev.andante.direbats.entity.DirebatsEntityTypes
import net.minecraft.entity.EntityType
import net.minecraft.sound.SoundEvent
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object DirebatsSoundEvents {
    val ENTITY_DIREBAT_AMBIENT = direbat("ambient")
    val ENTITY_DIREBAT_HURT = direbat("hurt")
    val ENTITY_DIREBAT_ATTACK = direbat("attack")
    val ENTITY_DIREBAT_DEATH = direbat("death")

    private fun direbat(id: String): SoundEvent {
        return registerEntity(DirebatsEntityTypes.DIREBAT, id)
    }

    private fun registerEntity(entity: EntityType<*>, id: String): SoundEvent {
        val identifier = Registry.ENTITY_TYPE.getId(entity)
        val soundIdentifier = Identifier(identifier.namespace, "entity.${identifier.path}.$id")
        return Registry.register(Registry.SOUND_EVENT, soundIdentifier, SoundEvent(soundIdentifier))
    }
}
