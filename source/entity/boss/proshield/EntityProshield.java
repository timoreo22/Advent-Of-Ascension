package net.tslat.aoa3.entity.boss.proshield;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.LootSystemRegister;
import net.tslat.aoa3.common.registration.SoundsRegister;
import net.tslat.aoa3.entity.base.AoAMeleeMob;
import net.tslat.aoa3.entity.properties.BossEntity;
import net.tslat.aoa3.utils.EntityUtil;

import javax.annotation.Nullable;

public class EntityProshield extends AoAMeleeMob implements BossEntity {
	public static final float entityWidth = 0.8f;

	public EntityProshield(World world) {
		super(world, entityWidth, 2f);
	}

	@Override
	public float getEyeHeight() {
		return 1.75f;
	}

	@Override
	protected double getBaseKnockbackResistance() {
		return 0.1;
	}

	@Override
	protected double getBaseMaxHealth() {
		return 500;
	}

	@Override
	protected double getBaseMeleeDamage() {
		return 5;
	}

	@Override
	protected double getBaseMovementSpeed() {
		return 0.2875;
	}

	@Nullable
	@Override
	protected SoundEvent getAmbientSound() {
		return SoundsRegister.mobImmortalLiving;
	}

	@Nullable
	@Override
	protected SoundEvent getDeathSound() {
		return SoundsRegister.mobImmortalDeath;
	}

	@Nullable
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundEvents.BLOCK_ANVIL_LAND;
	}

	@Nullable
	@Override
	protected ResourceLocation getLootTable() {
		return LootSystemRegister.entityProshield;
	}

	@Override
	public boolean isNonBoss() {
		return false;
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		if (super.attackEntityFrom(source, amount)) {
			if (EntityUtil.isMeleeDamage(source))
				source.getImmediateSource().attackEntityFrom(DamageSource.causeMobDamage(this), amount / 2);

			return true;
		}

		return false;
	}

	@Override
	public boolean startRiding(Entity entity, boolean force) {
		return false;
	}

	@Override
	public ResourceLocation getBossBarTexture() {
		return null;
	}

	@Nullable
	@Override
	public SoundEvent getBossMusic() {
		return null;
	}

	@Override
	public void setAttackTarget(@Nullable EntityLivingBase target) {
		if (target instanceof BossEntity)
			return;

		super.setAttackTarget(target);
	}
}
