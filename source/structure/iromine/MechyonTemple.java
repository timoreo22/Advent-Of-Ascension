package net.tslat.aoa3.structure.iromine;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.common.registration.LootSystemRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class MechyonTemple extends AoAStructure { //StructureSize: 11x11x12
	private static final IBlockState stripedBrick = BlockRegister.bricksIroStriped.getDefaultState();
	private static final IBlockState dottedBrick = BlockRegister.bricksIroDotted.getDefaultState();
	private static final IBlockState confusionTrap = BlockRegister.iroBrickTrap.getDefaultState();
	private static final IBlockState mechyonSpawner = BlockRegister.spawnerMechyon.getDefaultState();
	private static final IBlockState chest = Blocks.CHEST.getDefaultState();

	public MechyonTemple() {
		super("MechyonTemple");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 0, 0, 0, dottedBrick);
		addBlock(world, basePos, 0, 0, 1, dottedBrick);
		addBlock(world, basePos, 0, 0, 2, dottedBrick);
		addBlock(world, basePos, 0, 0, 3, dottedBrick);
		addBlock(world, basePos, 0, 0, 4, dottedBrick);
		addBlock(world, basePos, 0, 0, 5, dottedBrick);
		addBlock(world, basePos, 0, 0, 6, dottedBrick);
		addBlock(world, basePos, 0, 0, 7, dottedBrick);
		addBlock(world, basePos, 0, 0, 8, dottedBrick);
		addBlock(world, basePos, 0, 0, 9, dottedBrick);
		addBlock(world, basePos, 0, 0, 10, dottedBrick);
		addBlock(world, basePos, 0, 0, 11, dottedBrick);
		addBlock(world, basePos, 1, 0, 0, dottedBrick);
		addBlock(world, basePos, 1, 0, 1, stripedBrick);
		addBlock(world, basePos, 1, 0, 2, stripedBrick);
		addBlock(world, basePos, 1, 0, 3, stripedBrick);
		addBlock(world, basePos, 1, 0, 4, stripedBrick);
		addBlock(world, basePos, 1, 0, 5, stripedBrick);
		addBlock(world, basePos, 1, 0, 6, stripedBrick);
		addBlock(world, basePos, 1, 0, 7, stripedBrick);
		addBlock(world, basePos, 1, 0, 8, stripedBrick);
		addBlock(world, basePos, 1, 0, 9, stripedBrick);
		addBlock(world, basePos, 1, 0, 10, stripedBrick);
		addBlock(world, basePos, 1, 0, 11, dottedBrick);
		addBlock(world, basePos, 2, 0, 0, dottedBrick);
		addBlock(world, basePos, 2, 0, 1, stripedBrick);
		addBlock(world, basePos, 2, 0, 2, stripedBrick);
		addBlock(world, basePos, 2, 0, 3, stripedBrick);
		addBlock(world, basePos, 2, 0, 4, stripedBrick);
		addBlock(world, basePos, 2, 0, 5, stripedBrick);
		addBlock(world, basePos, 2, 0, 6, stripedBrick);
		addBlock(world, basePos, 2, 0, 7, stripedBrick);
		addBlock(world, basePos, 2, 0, 8, stripedBrick);
		addBlock(world, basePos, 2, 0, 9, stripedBrick);
		addBlock(world, basePos, 2, 0, 10, stripedBrick);
		addBlock(world, basePos, 2, 0, 11, dottedBrick);
		addBlock(world, basePos, 3, 0, 0, dottedBrick);
		addBlock(world, basePos, 3, 0, 1, stripedBrick);
		addBlock(world, basePos, 3, 0, 2, stripedBrick);
		addBlock(world, basePos, 3, 0, 3, confusionTrap);
		addBlock(world, basePos, 3, 0, 4, confusionTrap);
		addBlock(world, basePos, 3, 0, 5, confusionTrap);
		addBlock(world, basePos, 3, 0, 6, confusionTrap);
		addBlock(world, basePos, 3, 0, 7, confusionTrap);
		addBlock(world, basePos, 3, 0, 8, confusionTrap);
		addBlock(world, basePos, 3, 0, 9, stripedBrick);
		addBlock(world, basePos, 3, 0, 10, stripedBrick);
		addBlock(world, basePos, 3, 0, 11, dottedBrick);
		addBlock(world, basePos, 4, 0, 0, dottedBrick);
		addBlock(world, basePos, 4, 0, 1, stripedBrick);
		addBlock(world, basePos, 4, 0, 2, stripedBrick);
		addBlock(world, basePos, 4, 0, 3, confusionTrap);
		addBlock(world, basePos, 4, 0, 4, stripedBrick);
		addBlock(world, basePos, 4, 0, 5, stripedBrick);
		addBlock(world, basePos, 4, 0, 6, stripedBrick);
		addBlock(world, basePos, 4, 0, 7, stripedBrick);
		addBlock(world, basePos, 4, 0, 8, confusionTrap);
		addBlock(world, basePos, 4, 0, 9, stripedBrick);
		addBlock(world, basePos, 4, 0, 10, stripedBrick);
		addBlock(world, basePos, 4, 0, 11, dottedBrick);
		addBlock(world, basePos, 5, 0, 0, dottedBrick);
		addBlock(world, basePos, 5, 0, 1, stripedBrick);
		addBlock(world, basePos, 5, 0, 2, stripedBrick);
		addBlock(world, basePos, 5, 0, 3, confusionTrap);
		addBlock(world, basePos, 5, 0, 4, stripedBrick);
		addBlock(world, basePos, 5, 0, 5, stripedBrick);
		addBlock(world, basePos, 5, 0, 6, stripedBrick);
		addBlock(world, basePos, 5, 0, 7, stripedBrick);
		addBlock(world, basePos, 5, 0, 8, confusionTrap);
		addBlock(world, basePos, 5, 0, 9, stripedBrick);
		addBlock(world, basePos, 5, 0, 10, stripedBrick);
		addBlock(world, basePos, 5, 0, 11, dottedBrick);
		addBlock(world, basePos, 6, 0, 0, dottedBrick);
		addBlock(world, basePos, 6, 0, 1, stripedBrick);
		addBlock(world, basePos, 6, 0, 2, stripedBrick);
		addBlock(world, basePos, 6, 0, 3, confusionTrap);
		addBlock(world, basePos, 6, 0, 4, stripedBrick);
		addBlock(world, basePos, 6, 0, 5, stripedBrick);
		addBlock(world, basePos, 6, 0, 6, stripedBrick);
		addBlock(world, basePos, 6, 0, 7, stripedBrick);
		addBlock(world, basePos, 6, 0, 8, confusionTrap);
		addBlock(world, basePos, 6, 0, 9, stripedBrick);
		addBlock(world, basePos, 6, 0, 10, stripedBrick);
		addBlock(world, basePos, 6, 0, 11, dottedBrick);
		addBlock(world, basePos, 7, 0, 0, dottedBrick);
		addBlock(world, basePos, 7, 0, 1, stripedBrick);
		addBlock(world, basePos, 7, 0, 2, stripedBrick);
		addBlock(world, basePos, 7, 0, 3, confusionTrap);
		addBlock(world, basePos, 7, 0, 4, confusionTrap);
		addBlock(world, basePos, 7, 0, 5, confusionTrap);
		addBlock(world, basePos, 7, 0, 6, confusionTrap);
		addBlock(world, basePos, 7, 0, 7, confusionTrap);
		addBlock(world, basePos, 7, 0, 8, confusionTrap);
		addBlock(world, basePos, 7, 0, 9, stripedBrick);
		addBlock(world, basePos, 7, 0, 10, stripedBrick);
		addBlock(world, basePos, 7, 0, 11, dottedBrick);
		addBlock(world, basePos, 8, 0, 0, dottedBrick);
		addBlock(world, basePos, 8, 0, 1, stripedBrick);
		addBlock(world, basePos, 8, 0, 2, stripedBrick);
		addBlock(world, basePos, 8, 0, 3, stripedBrick);
		addBlock(world, basePos, 8, 0, 4, stripedBrick);
		addBlock(world, basePos, 8, 0, 5, stripedBrick);
		addBlock(world, basePos, 8, 0, 6, stripedBrick);
		addBlock(world, basePos, 8, 0, 7, stripedBrick);
		addBlock(world, basePos, 8, 0, 8, stripedBrick);
		addBlock(world, basePos, 8, 0, 9, stripedBrick);
		addBlock(world, basePos, 8, 0, 10, stripedBrick);
		addBlock(world, basePos, 8, 0, 11, dottedBrick);
		addBlock(world, basePos, 9, 0, 0, dottedBrick);
		addBlock(world, basePos, 9, 0, 1, stripedBrick);
		addBlock(world, basePos, 9, 0, 2, stripedBrick);
		addBlock(world, basePos, 9, 0, 3, stripedBrick);
		addBlock(world, basePos, 9, 0, 4, stripedBrick);
		addBlock(world, basePos, 9, 0, 5, stripedBrick);
		addBlock(world, basePos, 9, 0, 6, stripedBrick);
		addBlock(world, basePos, 9, 0, 7, stripedBrick);
		addBlock(world, basePos, 9, 0, 8, stripedBrick);
		addBlock(world, basePos, 9, 0, 9, stripedBrick);
		addBlock(world, basePos, 9, 0, 10, stripedBrick);
		addBlock(world, basePos, 9, 0, 11, dottedBrick);
		addBlock(world, basePos, 10, 0, 0, dottedBrick);
		addBlock(world, basePos, 10, 0, 1, dottedBrick);
		addBlock(world, basePos, 10, 0, 2, dottedBrick);
		addBlock(world, basePos, 10, 0, 3, dottedBrick);
		addBlock(world, basePos, 10, 0, 4, dottedBrick);
		addBlock(world, basePos, 10, 0, 5, dottedBrick);
		addBlock(world, basePos, 10, 0, 6, dottedBrick);
		addBlock(world, basePos, 10, 0, 7, dottedBrick);
		addBlock(world, basePos, 10, 0, 8, dottedBrick);
		addBlock(world, basePos, 10, 0, 9, dottedBrick);
		addBlock(world, basePos, 10, 0, 10, dottedBrick);
		addBlock(world, basePos, 10, 0, 11, dottedBrick);
		addBlock(world, basePos, 0, 1, 0, dottedBrick);
		addBlock(world, basePos, 0, 1, 1, stripedBrick);
		addBlock(world, basePos, 0, 1, 2, stripedBrick);
		addBlock(world, basePos, 0, 1, 3, stripedBrick);
		addBlock(world, basePos, 0, 1, 4, stripedBrick);
		addBlock(world, basePos, 0, 1, 5, stripedBrick);
		addBlock(world, basePos, 0, 1, 6, stripedBrick);
		addBlock(world, basePos, 0, 1, 7, stripedBrick);
		addBlock(world, basePos, 0, 1, 8, stripedBrick);
		addBlock(world, basePos, 0, 1, 9, stripedBrick);
		addBlock(world, basePos, 0, 1, 10, stripedBrick);
		addBlock(world, basePos, 0, 1, 11, dottedBrick);
		addBlock(world, basePos, 1, 1, 0, stripedBrick);
		addBlock(world, basePos, 1, 1, 11, stripedBrick);
		addBlock(world, basePos, 2, 1, 0, stripedBrick);
		addBlock(world, basePos, 2, 1, 11, stripedBrick);
		addBlock(world, basePos, 3, 1, 0, stripedBrick);
		addBlock(world, basePos, 3, 1, 11, stripedBrick);
		addBlock(world, basePos, 4, 1, 0, stripedBrick);
		addBlock(world, basePos, 4, 1, 11, stripedBrick);
		addBlock(world, basePos, 5, 1, 0, stripedBrick);
		addBlock(world, basePos, 5, 1, 6, chest);
		addBlock(world, basePos, 5, 1, 11, stripedBrick);
		addBlock(world, basePos, 6, 1, 0, stripedBrick);
		addBlock(world, basePos, 6, 1, 11, stripedBrick);
		addBlock(world, basePos, 7, 1, 0, stripedBrick);
		addBlock(world, basePos, 7, 1, 11, stripedBrick);
		addBlock(world, basePos, 8, 1, 0, stripedBrick);
		addBlock(world, basePos, 8, 1, 11, stripedBrick);
		addBlock(world, basePos, 9, 1, 0, stripedBrick);
		addBlock(world, basePos, 9, 1, 11, stripedBrick);
		addBlock(world, basePos, 10, 1, 0, dottedBrick);
		addBlock(world, basePos, 10, 1, 1, stripedBrick);
		addBlock(world, basePos, 10, 1, 2, stripedBrick);
		addBlock(world, basePos, 10, 1, 3, stripedBrick);
		addBlock(world, basePos, 10, 1, 4, stripedBrick);
		addBlock(world, basePos, 10, 1, 5, stripedBrick);
		addBlock(world, basePos, 10, 1, 6, stripedBrick);
		addBlock(world, basePos, 10, 1, 7, stripedBrick);
		addBlock(world, basePos, 10, 1, 8, stripedBrick);
		addBlock(world, basePos, 10, 1, 9, stripedBrick);
		addBlock(world, basePos, 10, 1, 10, stripedBrick);
		addBlock(world, basePos, 10, 1, 11, dottedBrick);
		addBlock(world, basePos, 0, 2, 0, dottedBrick);
		addBlock(world, basePos, 0, 2, 1, stripedBrick);
		addBlock(world, basePos, 0, 2, 2, stripedBrick);
		addBlock(world, basePos, 0, 2, 3, stripedBrick);
		addBlock(world, basePos, 0, 2, 4, stripedBrick);
		addBlock(world, basePos, 0, 2, 5, stripedBrick);
		addBlock(world, basePos, 0, 2, 6, stripedBrick);
		addBlock(world, basePos, 0, 2, 7, stripedBrick);
		addBlock(world, basePos, 0, 2, 8, stripedBrick);
		addBlock(world, basePos, 0, 2, 9, stripedBrick);
		addBlock(world, basePos, 0, 2, 10, stripedBrick);
		addBlock(world, basePos, 0, 2, 11, dottedBrick);
		addBlock(world, basePos, 1, 2, 0, stripedBrick);
		addBlock(world, basePos, 1, 2, 8, dottedBrick);
		addBlock(world, basePos, 1, 2, 9, stripedBrick);
		addBlock(world, basePos, 1, 2, 10, stripedBrick);
		addBlock(world, basePos, 1, 2, 11, stripedBrick);
		addBlock(world, basePos, 2, 2, 0, stripedBrick);
		addBlock(world, basePos, 2, 2, 9, dottedBrick);
		addBlock(world, basePos, 2, 2, 10, stripedBrick);
		addBlock(world, basePos, 2, 2, 11, stripedBrick);
		addBlock(world, basePos, 3, 2, 0, stripedBrick);
		addBlock(world, basePos, 3, 2, 10, dottedBrick);
		addBlock(world, basePos, 3, 2, 11, stripedBrick);
		addBlock(world, basePos, 4, 2, 0, stripedBrick);
		addBlock(world, basePos, 4, 2, 11, stripedBrick);
		addBlock(world, basePos, 5, 2, 0, stripedBrick);
		addBlock(world, basePos, 5, 2, 11, stripedBrick);
		addBlock(world, basePos, 6, 2, 0, stripedBrick);
		addBlock(world, basePos, 6, 2, 11, stripedBrick);
		addBlock(world, basePos, 7, 2, 0, stripedBrick);
		addBlock(world, basePos, 7, 2, 1, dottedBrick);
		addBlock(world, basePos, 7, 2, 11, stripedBrick);
		addBlock(world, basePos, 8, 2, 0, stripedBrick);
		addBlock(world, basePos, 8, 2, 1, stripedBrick);
		addBlock(world, basePos, 8, 2, 2, dottedBrick);
		addBlock(world, basePos, 8, 2, 11, stripedBrick);
		addBlock(world, basePos, 9, 2, 0, stripedBrick);
		addBlock(world, basePos, 9, 2, 1, stripedBrick);
		addBlock(world, basePos, 9, 2, 2, stripedBrick);
		addBlock(world, basePos, 9, 2, 3, dottedBrick);
		addBlock(world, basePos, 9, 2, 11, stripedBrick);
		addBlock(world, basePos, 10, 2, 0, dottedBrick);
		addBlock(world, basePos, 10, 2, 1, stripedBrick);
		addBlock(world, basePos, 10, 2, 2, stripedBrick);
		addBlock(world, basePos, 10, 2, 3, stripedBrick);
		addBlock(world, basePos, 10, 2, 4, stripedBrick);
		addBlock(world, basePos, 10, 2, 5, stripedBrick);
		addBlock(world, basePos, 10, 2, 6, stripedBrick);
		addBlock(world, basePos, 10, 2, 7, stripedBrick);
		addBlock(world, basePos, 10, 2, 8, stripedBrick);
		addBlock(world, basePos, 10, 2, 9, stripedBrick);
		addBlock(world, basePos, 10, 2, 10, stripedBrick);
		addBlock(world, basePos, 10, 2, 11, dottedBrick);
		addBlock(world, basePos, 0, 3, 0, dottedBrick);
		addBlock(world, basePos, 0, 3, 1, stripedBrick);
		addBlock(world, basePos, 0, 3, 2, stripedBrick);
		addBlock(world, basePos, 0, 3, 3, stripedBrick);
		addBlock(world, basePos, 0, 3, 4, stripedBrick);
		addBlock(world, basePos, 0, 3, 5, stripedBrick);
		addBlock(world, basePos, 0, 3, 6, stripedBrick);
		addBlock(world, basePos, 0, 3, 7, stripedBrick);
		addBlock(world, basePos, 0, 3, 8, stripedBrick);
		addBlock(world, basePos, 0, 3, 9, stripedBrick);
		addBlock(world, basePos, 0, 3, 10, stripedBrick);
		addBlock(world, basePos, 0, 3, 11, dottedBrick);
		addBlock(world, basePos, 1, 3, 0, stripedBrick);
		addBlock(world, basePos, 1, 3, 11, stripedBrick);
		addBlock(world, basePos, 2, 3, 0, stripedBrick);
		addBlock(world, basePos, 2, 3, 9, mechyonSpawner);
		addBlock(world, basePos, 2, 3, 11, stripedBrick);
		addBlock(world, basePos, 3, 3, 0, stripedBrick);
		addBlock(world, basePos, 3, 3, 11, stripedBrick);
		addBlock(world, basePos, 4, 3, 0, stripedBrick);
		addBlock(world, basePos, 4, 3, 11, stripedBrick);
		addBlock(world, basePos, 5, 3, 0, stripedBrick);
		addBlock(world, basePos, 5, 3, 11, stripedBrick);
		addBlock(world, basePos, 6, 3, 0, stripedBrick);
		addBlock(world, basePos, 6, 3, 11, stripedBrick);
		addBlock(world, basePos, 7, 3, 0, stripedBrick);
		addBlock(world, basePos, 7, 3, 11, stripedBrick);
		addBlock(world, basePos, 8, 3, 0, stripedBrick);
		addBlock(world, basePos, 8, 3, 2, mechyonSpawner);
		addBlock(world, basePos, 8, 3, 11, stripedBrick);
		addBlock(world, basePos, 9, 3, 0, stripedBrick);
		addBlock(world, basePos, 9, 3, 11, stripedBrick);
		addBlock(world, basePos, 10, 3, 0, dottedBrick);
		addBlock(world, basePos, 10, 3, 1, stripedBrick);
		addBlock(world, basePos, 10, 3, 2, stripedBrick);
		addBlock(world, basePos, 10, 3, 3, stripedBrick);
		addBlock(world, basePos, 10, 3, 4, stripedBrick);
		addBlock(world, basePos, 10, 3, 5, stripedBrick);
		addBlock(world, basePos, 10, 3, 6, stripedBrick);
		addBlock(world, basePos, 10, 3, 7, stripedBrick);
		addBlock(world, basePos, 10, 3, 8, stripedBrick);
		addBlock(world, basePos, 10, 3, 9, stripedBrick);
		addBlock(world, basePos, 10, 3, 10, stripedBrick);
		addBlock(world, basePos, 10, 3, 11, dottedBrick);
		addBlock(world, basePos, 0, 4, 0, dottedBrick);
		addBlock(world, basePos, 0, 4, 1, stripedBrick);
		addBlock(world, basePos, 0, 4, 2, stripedBrick);
		addBlock(world, basePos, 0, 4, 3, stripedBrick);
		addBlock(world, basePos, 0, 4, 4, stripedBrick);
		addBlock(world, basePos, 0, 4, 5, stripedBrick);
		addBlock(world, basePos, 0, 4, 6, stripedBrick);
		addBlock(world, basePos, 0, 4, 7, stripedBrick);
		addBlock(world, basePos, 0, 4, 8, stripedBrick);
		addBlock(world, basePos, 0, 4, 9, stripedBrick);
		addBlock(world, basePos, 0, 4, 10, stripedBrick);
		addBlock(world, basePos, 0, 4, 11, dottedBrick);
		addBlock(world, basePos, 1, 4, 0, stripedBrick);
		addBlock(world, basePos, 1, 4, 11, stripedBrick);
		addBlock(world, basePos, 2, 4, 0, stripedBrick);
		addBlock(world, basePos, 2, 4, 11, stripedBrick);
		addBlock(world, basePos, 3, 4, 0, stripedBrick);
		addBlock(world, basePos, 3, 4, 11, stripedBrick);
		addBlock(world, basePos, 4, 4, 0, stripedBrick);
		addBlock(world, basePos, 4, 4, 11, stripedBrick);
		addBlock(world, basePos, 5, 4, 0, stripedBrick);
		addBlock(world, basePos, 5, 4, 11, stripedBrick);
		addBlock(world, basePos, 6, 4, 0, stripedBrick);
		addBlock(world, basePos, 6, 4, 11, stripedBrick);
		addBlock(world, basePos, 7, 4, 0, stripedBrick);
		addBlock(world, basePos, 7, 4, 11, stripedBrick);
		addBlock(world, basePos, 8, 4, 0, stripedBrick);
		addBlock(world, basePos, 8, 4, 11, stripedBrick);
		addBlock(world, basePos, 9, 4, 0, stripedBrick);
		addBlock(world, basePos, 9, 4, 11, stripedBrick);
		addBlock(world, basePos, 10, 4, 0, dottedBrick);
		addBlock(world, basePos, 10, 4, 1, stripedBrick);
		addBlock(world, basePos, 10, 4, 2, stripedBrick);
		addBlock(world, basePos, 10, 4, 3, stripedBrick);
		addBlock(world, basePos, 10, 4, 4, stripedBrick);
		addBlock(world, basePos, 10, 4, 5, stripedBrick);
		addBlock(world, basePos, 10, 4, 6, stripedBrick);
		addBlock(world, basePos, 10, 4, 7, stripedBrick);
		addBlock(world, basePos, 10, 4, 8, stripedBrick);
		addBlock(world, basePos, 10, 4, 9, stripedBrick);
		addBlock(world, basePos, 10, 4, 10, stripedBrick);
		addBlock(world, basePos, 10, 4, 11, dottedBrick);
		addBlock(world, basePos, 0, 5, 0, dottedBrick);
		addBlock(world, basePos, 0, 5, 1, dottedBrick);
		addBlock(world, basePos, 0, 5, 2, dottedBrick);
		addBlock(world, basePos, 0, 5, 3, dottedBrick);
		addBlock(world, basePos, 0, 5, 4, dottedBrick);
		addBlock(world, basePos, 0, 5, 5, dottedBrick);
		addBlock(world, basePos, 0, 5, 6, dottedBrick);
		addBlock(world, basePos, 0, 5, 7, dottedBrick);
		addBlock(world, basePos, 0, 5, 8, dottedBrick);
		addBlock(world, basePos, 0, 5, 9, dottedBrick);
		addBlock(world, basePos, 0, 5, 10, dottedBrick);
		addBlock(world, basePos, 0, 5, 11, dottedBrick);
		addBlock(world, basePos, 1, 5, 0, dottedBrick);
		addBlock(world, basePos, 1, 5, 1, stripedBrick);
		addBlock(world, basePos, 1, 5, 2, stripedBrick);
		addBlock(world, basePos, 1, 5, 3, stripedBrick);
		addBlock(world, basePos, 1, 5, 4, stripedBrick);
		addBlock(world, basePos, 1, 5, 5, stripedBrick);
		addBlock(world, basePos, 1, 5, 6, stripedBrick);
		addBlock(world, basePos, 1, 5, 7, stripedBrick);
		addBlock(world, basePos, 1, 5, 8, stripedBrick);
		addBlock(world, basePos, 1, 5, 9, stripedBrick);
		addBlock(world, basePos, 1, 5, 10, stripedBrick);
		addBlock(world, basePos, 1, 5, 11, dottedBrick);
		addBlock(world, basePos, 2, 5, 0, dottedBrick);
		addBlock(world, basePos, 2, 5, 1, stripedBrick);
		addBlock(world, basePos, 2, 5, 10, stripedBrick);
		addBlock(world, basePos, 2, 5, 11, dottedBrick);
		addBlock(world, basePos, 3, 5, 0, dottedBrick);
		addBlock(world, basePos, 3, 5, 1, stripedBrick);
		addBlock(world, basePos, 3, 5, 10, stripedBrick);
		addBlock(world, basePos, 3, 5, 11, dottedBrick);
		addBlock(world, basePos, 4, 5, 0, dottedBrick);
		addBlock(world, basePos, 4, 5, 1, stripedBrick);
		addBlock(world, basePos, 4, 5, 10, stripedBrick);
		addBlock(world, basePos, 4, 5, 11, dottedBrick);
		addBlock(world, basePos, 5, 5, 0, dottedBrick);
		addBlock(world, basePos, 5, 5, 1, stripedBrick);
		addBlock(world, basePos, 5, 5, 10, stripedBrick);
		addBlock(world, basePos, 5, 5, 11, dottedBrick);
		addBlock(world, basePos, 6, 5, 0, dottedBrick);
		addBlock(world, basePos, 6, 5, 1, stripedBrick);
		addBlock(world, basePos, 6, 5, 10, stripedBrick);
		addBlock(world, basePos, 6, 5, 11, dottedBrick);
		addBlock(world, basePos, 7, 5, 0, dottedBrick);
		addBlock(world, basePos, 7, 5, 1, stripedBrick);
		addBlock(world, basePos, 7, 5, 10, stripedBrick);
		addBlock(world, basePos, 7, 5, 11, dottedBrick);
		addBlock(world, basePos, 8, 5, 0, dottedBrick);
		addBlock(world, basePos, 8, 5, 1, stripedBrick);
		addBlock(world, basePos, 8, 5, 10, stripedBrick);
		addBlock(world, basePos, 8, 5, 11, dottedBrick);
		addBlock(world, basePos, 9, 5, 0, dottedBrick);
		addBlock(world, basePos, 9, 5, 1, stripedBrick);
		addBlock(world, basePos, 9, 5, 2, stripedBrick);
		addBlock(world, basePos, 9, 5, 3, stripedBrick);
		addBlock(world, basePos, 9, 5, 4, stripedBrick);
		addBlock(world, basePos, 9, 5, 5, stripedBrick);
		addBlock(world, basePos, 9, 5, 6, stripedBrick);
		addBlock(world, basePos, 9, 5, 7, stripedBrick);
		addBlock(world, basePos, 9, 5, 8, stripedBrick);
		addBlock(world, basePos, 9, 5, 9, stripedBrick);
		addBlock(world, basePos, 9, 5, 10, stripedBrick);
		addBlock(world, basePos, 9, 5, 11, dottedBrick);
		addBlock(world, basePos, 10, 5, 0, dottedBrick);
		addBlock(world, basePos, 10, 5, 1, dottedBrick);
		addBlock(world, basePos, 10, 5, 2, dottedBrick);
		addBlock(world, basePos, 10, 5, 3, dottedBrick);
		addBlock(world, basePos, 10, 5, 4, dottedBrick);
		addBlock(world, basePos, 10, 5, 5, dottedBrick);
		addBlock(world, basePos, 10, 5, 6, dottedBrick);
		addBlock(world, basePos, 10, 5, 7, dottedBrick);
		addBlock(world, basePos, 10, 5, 8, dottedBrick);
		addBlock(world, basePos, 10, 5, 9, dottedBrick);
		addBlock(world, basePos, 10, 5, 10, dottedBrick);
		addBlock(world, basePos, 10, 5, 11, dottedBrick);
		addBlock(world, basePos, 2, 6, 2, dottedBrick);
		addBlock(world, basePos, 2, 6, 3, dottedBrick);
		addBlock(world, basePos, 2, 6, 4, dottedBrick);
		addBlock(world, basePos, 2, 6, 5, dottedBrick);
		addBlock(world, basePos, 2, 6, 6, dottedBrick);
		addBlock(world, basePos, 2, 6, 7, dottedBrick);
		addBlock(world, basePos, 2, 6, 8, dottedBrick);
		addBlock(world, basePos, 2, 6, 9, dottedBrick);
		addBlock(world, basePos, 3, 6, 2, dottedBrick);
		addBlock(world, basePos, 3, 6, 9, dottedBrick);
		addBlock(world, basePos, 4, 6, 2, dottedBrick);
		addBlock(world, basePos, 4, 6, 9, dottedBrick);
		addBlock(world, basePos, 5, 6, 2, dottedBrick);
		addBlock(world, basePos, 5, 6, 9, dottedBrick);
		addBlock(world, basePos, 6, 6, 2, dottedBrick);
		addBlock(world, basePos, 6, 6, 9, dottedBrick);
		addBlock(world, basePos, 7, 6, 2, dottedBrick);
		addBlock(world, basePos, 7, 6, 9, dottedBrick);
		addBlock(world, basePos, 8, 6, 2, dottedBrick);
		addBlock(world, basePos, 8, 6, 3, dottedBrick);
		addBlock(world, basePos, 8, 6, 4, dottedBrick);
		addBlock(world, basePos, 8, 6, 5, dottedBrick);
		addBlock(world, basePos, 8, 6, 6, dottedBrick);
		addBlock(world, basePos, 8, 6, 7, dottedBrick);
		addBlock(world, basePos, 8, 6, 8, dottedBrick);
		addBlock(world, basePos, 8, 6, 9, dottedBrick);
		addBlock(world, basePos, 2, 7, 2, dottedBrick);
		addBlock(world, basePos, 2, 7, 3, stripedBrick);
		addBlock(world, basePos, 2, 7, 4, stripedBrick);
		addBlock(world, basePos, 2, 7, 5, stripedBrick);
		addBlock(world, basePos, 2, 7, 6, stripedBrick);
		addBlock(world, basePos, 2, 7, 7, stripedBrick);
		addBlock(world, basePos, 2, 7, 8, stripedBrick);
		addBlock(world, basePos, 2, 7, 9, dottedBrick);
		addBlock(world, basePos, 3, 7, 2, stripedBrick);
		addBlock(world, basePos, 3, 7, 9, stripedBrick);
		addBlock(world, basePos, 4, 7, 2, stripedBrick);
		addBlock(world, basePos, 4, 7, 9, stripedBrick);
		addBlock(world, basePos, 5, 7, 2, stripedBrick);
		addBlock(world, basePos, 5, 7, 9, stripedBrick);
		addBlock(world, basePos, 6, 7, 2, stripedBrick);
		addBlock(world, basePos, 6, 7, 9, stripedBrick);
		addBlock(world, basePos, 7, 7, 2, stripedBrick);
		addBlock(world, basePos, 7, 7, 9, stripedBrick);
		addBlock(world, basePos, 8, 7, 2, dottedBrick);
		addBlock(world, basePos, 8, 7, 3, stripedBrick);
		addBlock(world, basePos, 8, 7, 4, stripedBrick);
		addBlock(world, basePos, 8, 7, 5, stripedBrick);
		addBlock(world, basePos, 8, 7, 6, stripedBrick);
		addBlock(world, basePos, 8, 7, 7, stripedBrick);
		addBlock(world, basePos, 8, 7, 8, stripedBrick);
		addBlock(world, basePos, 8, 7, 9, dottedBrick);
		addBlock(world, basePos, 2, 8, 2, dottedBrick);
		addBlock(world, basePos, 2, 8, 3, stripedBrick);
		addBlock(world, basePos, 2, 8, 4, stripedBrick);
		addBlock(world, basePos, 2, 8, 5, stripedBrick);
		addBlock(world, basePos, 2, 8, 6, stripedBrick);
		addBlock(world, basePos, 2, 8, 7, stripedBrick);
		addBlock(world, basePos, 2, 8, 8, stripedBrick);
		addBlock(world, basePos, 2, 8, 9, dottedBrick);
		addBlock(world, basePos, 3, 8, 2, stripedBrick);
		addBlock(world, basePos, 3, 8, 9, stripedBrick);
		addBlock(world, basePos, 4, 8, 2, stripedBrick);
		addBlock(world, basePos, 4, 8, 9, stripedBrick);
		addBlock(world, basePos, 5, 8, 2, stripedBrick);
		addBlock(world, basePos, 5, 8, 9, stripedBrick);
		addBlock(world, basePos, 6, 8, 2, stripedBrick);
		addBlock(world, basePos, 6, 8, 9, stripedBrick);
		addBlock(world, basePos, 7, 8, 2, stripedBrick);
		addBlock(world, basePos, 7, 8, 9, stripedBrick);
		addBlock(world, basePos, 8, 8, 2, dottedBrick);
		addBlock(world, basePos, 8, 8, 3, stripedBrick);
		addBlock(world, basePos, 8, 8, 4, stripedBrick);
		addBlock(world, basePos, 8, 8, 5, stripedBrick);
		addBlock(world, basePos, 8, 8, 6, stripedBrick);
		addBlock(world, basePos, 8, 8, 7, stripedBrick);
		addBlock(world, basePos, 8, 8, 8, stripedBrick);
		addBlock(world, basePos, 8, 8, 9, dottedBrick);
		addBlock(world, basePos, 2, 9, 2, dottedBrick);
		addBlock(world, basePos, 2, 9, 3, stripedBrick);
		addBlock(world, basePos, 2, 9, 4, stripedBrick);
		addBlock(world, basePos, 2, 9, 5, stripedBrick);
		addBlock(world, basePos, 2, 9, 6, stripedBrick);
		addBlock(world, basePos, 2, 9, 7, stripedBrick);
		addBlock(world, basePos, 2, 9, 8, stripedBrick);
		addBlock(world, basePos, 2, 9, 9, dottedBrick);
		addBlock(world, basePos, 3, 9, 2, stripedBrick);
		addBlock(world, basePos, 3, 9, 9, stripedBrick);
		addBlock(world, basePos, 4, 9, 2, stripedBrick);
		addBlock(world, basePos, 4, 9, 9, stripedBrick);
		addBlock(world, basePos, 5, 9, 2, stripedBrick);
		addBlock(world, basePos, 5, 9, 9, stripedBrick);
		addBlock(world, basePos, 6, 9, 2, stripedBrick);
		addBlock(world, basePos, 6, 9, 9, stripedBrick);
		addBlock(world, basePos, 7, 9, 2, stripedBrick);
		addBlock(world, basePos, 7, 9, 9, stripedBrick);
		addBlock(world, basePos, 8, 9, 2, dottedBrick);
		addBlock(world, basePos, 8, 9, 3, stripedBrick);
		addBlock(world, basePos, 8, 9, 4, stripedBrick);
		addBlock(world, basePos, 8, 9, 5, stripedBrick);
		addBlock(world, basePos, 8, 9, 6, stripedBrick);
		addBlock(world, basePos, 8, 9, 7, stripedBrick);
		addBlock(world, basePos, 8, 9, 8, stripedBrick);
		addBlock(world, basePos, 8, 9, 9, dottedBrick);
		addBlock(world, basePos, 2, 10, 2, dottedBrick);
		addBlock(world, basePos, 2, 10, 3, dottedBrick);
		addBlock(world, basePos, 2, 10, 4, dottedBrick);
		addBlock(world, basePos, 2, 10, 5, dottedBrick);
		addBlock(world, basePos, 2, 10, 6, dottedBrick);
		addBlock(world, basePos, 2, 10, 7, dottedBrick);
		addBlock(world, basePos, 2, 10, 8, dottedBrick);
		addBlock(world, basePos, 2, 10, 9, dottedBrick);
		addBlock(world, basePos, 3, 10, 2, dottedBrick);
		addBlock(world, basePos, 3, 10, 3, stripedBrick);
		addBlock(world, basePos, 3, 10, 4, stripedBrick);
		addBlock(world, basePos, 3, 10, 5, stripedBrick);
		addBlock(world, basePos, 3, 10, 6, stripedBrick);
		addBlock(world, basePos, 3, 10, 7, stripedBrick);
		addBlock(world, basePos, 3, 10, 8, stripedBrick);
		addBlock(world, basePos, 3, 10, 9, dottedBrick);
		addBlock(world, basePos, 4, 10, 2, dottedBrick);
		addBlock(world, basePos, 4, 10, 3, stripedBrick);
		addBlock(world, basePos, 4, 10, 8, stripedBrick);
		addBlock(world, basePos, 4, 10, 9, dottedBrick);
		addBlock(world, basePos, 5, 10, 2, dottedBrick);
		addBlock(world, basePos, 5, 10, 3, stripedBrick);
		addBlock(world, basePos, 5, 10, 8, stripedBrick);
		addBlock(world, basePos, 5, 10, 9, dottedBrick);
		addBlock(world, basePos, 6, 10, 2, dottedBrick);
		addBlock(world, basePos, 6, 10, 3, stripedBrick);
		addBlock(world, basePos, 6, 10, 8, stripedBrick);
		addBlock(world, basePos, 6, 10, 9, dottedBrick);
		addBlock(world, basePos, 7, 10, 2, dottedBrick);
		addBlock(world, basePos, 7, 10, 3, stripedBrick);
		addBlock(world, basePos, 7, 10, 4, stripedBrick);
		addBlock(world, basePos, 7, 10, 5, stripedBrick);
		addBlock(world, basePos, 7, 10, 6, stripedBrick);
		addBlock(world, basePos, 7, 10, 7, stripedBrick);
		addBlock(world, basePos, 7, 10, 8, stripedBrick);
		addBlock(world, basePos, 7, 10, 9, dottedBrick);
		addBlock(world, basePos, 8, 10, 2, dottedBrick);
		addBlock(world, basePos, 8, 10, 3, dottedBrick);
		addBlock(world, basePos, 8, 10, 4, dottedBrick);
		addBlock(world, basePos, 8, 10, 5, dottedBrick);
		addBlock(world, basePos, 8, 10, 6, dottedBrick);
		addBlock(world, basePos, 8, 10, 7, dottedBrick);
		addBlock(world, basePos, 8, 10, 8, dottedBrick);
		addBlock(world, basePos, 8, 10, 9, dottedBrick);
	}

	@Override
	protected void doPostBuildOps(World world, Random rand, BlockPos basePos) {
		assignLootChests(world, rand, LootSystemRegister.structureIroPassageChests, basePos.add(5, 1, 6));
	}
}
