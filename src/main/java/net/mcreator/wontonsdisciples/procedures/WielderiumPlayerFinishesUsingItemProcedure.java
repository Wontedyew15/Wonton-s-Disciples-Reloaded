package net.mcreator.wontonsdisciples.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class WielderiumPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 600, 1, false, false));
	}
}
