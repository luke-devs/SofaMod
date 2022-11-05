package net.settlerstavern.tavern_core.world.feature;

import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.settlerstavern.tavern_core.block.ModBlocksTrees;

public class ModConfiguredFeatures {


    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> MAPLE_TREE =
            ConfiguredFeatures.register("maple_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocksTrees.MAPLE_LOG),
                    new StraightTrunkPlacer(10, 6, 3),
                    BlockStateProvider.of(ModBlocksTrees.MAPLE_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> SCULK_MUSHROOM =
            ConfiguredFeatures.register("sculk_mushroom", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocksTrees.SCULK_MUSHROOM_LOG),
                    new StraightTrunkPlacer(5,3,4),
                    BlockStateProvider.of(ModBlocksTrees.SCULK_MUSHROOM_MEMBRANE),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static void registerConfiguredFeatures(){

    }
}
