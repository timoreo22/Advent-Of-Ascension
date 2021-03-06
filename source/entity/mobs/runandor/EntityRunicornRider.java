package net.tslat.aoa3.entity.mobs.runandor;

import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.LootSystemRegister;
import net.tslat.aoa3.common.registration.SoundsRegister;
import net.tslat.aoa3.entity.base.AoAMeleeMob;

import javax.annotation.Nullable;

public class EntityRunicornRider extends AoAMeleeMob {
	public static final float entityWidth = 0.7f;

	public EntityRunicornRider(World world) {
		super(world, entityWidth, 2.5625f);

		setSlipperyMovement();
		setAIMoveSpeed(2.3f);
	}

	@Override
	public float getEyeHeight() {
		return 2.34375f;
	}

	@Override
	protected double getBaseKnockbackResistance() {
		return 0.2;
	}

	@Override
	protected double getBaseMaxHealth() {
		return 132;
	}

	@Override
	protected double getBaseMeleeDamage() {
		return 14d;
	}

	@Override
	protected double getBaseMovementSpeed() {
		return 0.29;
	}

	@Nullable
	@Override
	protected SoundEvent getAmbientSound() {
		return SoundsRegister.mobRainicornLiving;
	}

	@Nullable
	@Override
	protected SoundEvent getDeathSound() {
		return SoundsRegister.mobRainicornDeath;
	}

	@Nullable
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundsRegister.mobRainicornHit;
	}

	@Nullable
	@Override
	protected ResourceLocation getLootTable() {
		return LootSystemRegister.entityRunicornRider;
	}

	@Override
	protected void damageEntity(DamageSource damageSrc, float damageAmount) {
		super.damageEntity(damageSrc, damageAmount);

		if (!world.isRemote && getHealth() <= getMaxHealth() / 0.45f) {
			EntityRunicorn runicorn = new EntityRunicorn(this, getHealth());

			world.spawnEntity(runicorn);
			onDeath(damageSrc);
		}
	}
}
