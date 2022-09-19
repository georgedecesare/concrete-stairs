package net.fabricmc.concretestairs;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteStairs implements ModInitializer {
	public final static String MODID = "concretestairs";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	public static final StairsBlock WHITE_CONCRETE_STAIRS = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_STAIRS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock ORANGE_CONCRETE_STAIRS = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_STAIRS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock MAGENTA_CONCRETE_STAIRS = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_STAIRS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock LIGHT_BLUE_CONCRETE_STAIRS = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_STAIRS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock YELLOW_CONCRETE_STAIRS = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_STAIRS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock LIME_CONCRETE_STAIRS = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_STAIRS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock PINK_CONCRETE_STAIRS = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_STAIRS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock GRAY_CONCRETE_STAIRS = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_STAIRS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock LIGHT_GRAY_CONCRETE_STAIRS = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_STAIRS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock CYAN_CONCRETE_STAIRS = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_STAIRS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock PURPLE_CONCRETE_STAIRS = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_STAIRS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock BLUE_CONCRETE_STAIRS = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_STAIRS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock BROWN_CONCRETE_STAIRS = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_STAIRS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock GREEN_CONCRETE_STAIRS = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_STAIRS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock RED_CONCRETE_STAIRS = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_STAIRS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock BLACK_CONCRETE_STAIRS = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_STAIRS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());

	public static final SlabBlock WHITE_CONCRETE_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final SlabBlock ORANGE_CONCRETE_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final SlabBlock MAGENTA_CONCRETE_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final SlabBlock LIGHT_BLUE_CONCRETE_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final SlabBlock YELLOW_CONCRETE_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final SlabBlock LIME_CONCRETE_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final SlabBlock PINK_CONCRETE_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final SlabBlock GRAY_CONCRETE_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final SlabBlock LIGHT_GRAY_CONCRETE_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final SlabBlock CYAN_CONCRETE_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final SlabBlock PURPLE_CONCRETE_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final SlabBlock BLUE_CONCRETE_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final SlabBlock BROWN_CONCRETE_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final SlabBlock GREEN_CONCRETE_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final SlabBlock RED_CONCRETE_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final SlabBlock BLACK_CONCRETE_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());

	public static final StairsBlock WHITE_TERRACOTTA_STAIRS = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_STAIRS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock ORANGE_TERRACOTTA_STAIRS = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_STAIRS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock MAGENTA_TERRACOTTA_STAIRS = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_STAIRS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock LIGHT_BLUE_TERRACOTTA_STAIRS = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_STAIRS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock YELLOW_TERRACOTTA_STAIRS = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_STAIRS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock LIME_TERRACOTTA_STAIRS = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_STAIRS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock PINK_TERRACOTTA_STAIRS = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_STAIRS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock GRAY_TERRACOTTA_STAIRS = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_STAIRS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock LIGHT_GRAY_TERRACOTTA_STAIRS = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_STAIRS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock CYAN_TERRACOTTA_STAIRS = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_STAIRS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock PURPLE_TERRACOTTA_STAIRS = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_STAIRS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock BLUE_TERRACOTTA_STAIRS = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_STAIRS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock BROWN_TERRACOTTA_STAIRS = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_STAIRS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock GREEN_TERRACOTTA_STAIRS = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_STAIRS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock RED_TERRACOTTA_STAIRS = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_STAIRS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock BLACK_TERRACOTTA_STAIRS = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_STAIRS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());

	public static final SlabBlock WHITE_TERRACOTTA_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final SlabBlock ORANGE_TERRACOTTA_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final SlabBlock MAGENTA_TERRACOTTA_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final SlabBlock LIGHT_BLUE_TERRACOTTA_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final SlabBlock YELLOW_TERRACOTTA_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final SlabBlock LIME_TERRACOTTA_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final SlabBlock PINK_TERRACOTTA_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final SlabBlock GRAY_TERRACOTTA_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final SlabBlock LIGHT_GRAY_TERRACOTTA_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final SlabBlock CYAN_TERRACOTTA_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final SlabBlock PURPLE_TERRACOTTA_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final SlabBlock BLUE_TERRACOTTA_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final SlabBlock BROWN_TERRACOTTA_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final SlabBlock GREEN_TERRACOTTA_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final SlabBlock RED_TERRACOTTA_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final SlabBlock BLACK_TERRACOTTA_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());


	@Override
	public void onInitialize() {
		// white concrete stair
		Registry.register(Registry.BLOCK, new Identifier(MODID, "white_concrete_stairs"), WHITE_CONCRETE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "white_concrete_stairs"), new BlockItem(WHITE_CONCRETE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//orange concrete stair
		Registry.register(Registry.BLOCK, new Identifier(MODID, "orange_concrete_stairs"), ORANGE_CONCRETE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "orange_concrete_stairs"), new BlockItem(ORANGE_CONCRETE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//magenta concrete stair
		Registry.register(Registry.BLOCK, new Identifier(MODID, "magenta_concrete_stairs"), MAGENTA_CONCRETE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "magenta_concrete_stairs"), new BlockItem(MAGENTA_CONCRETE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//light blue concrete stair
		Registry.register(Registry.BLOCK, new Identifier(MODID, "light_blue_concrete_stairs"), LIGHT_BLUE_CONCRETE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "light_blue_concrete_stairs"), new BlockItem(LIGHT_BLUE_CONCRETE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//yellow concrete stair
		Registry.register(Registry.BLOCK, new Identifier(MODID, "yellow_concrete_stairs"), YELLOW_CONCRETE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "yellow_concrete_stairs"), new BlockItem(YELLOW_CONCRETE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//lime concrete stair
		Registry.register(Registry.BLOCK, new Identifier(MODID, "lime_concrete_stairs"), LIME_CONCRETE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "lime_concrete_stairs"), new BlockItem(LIME_CONCRETE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//pink concrete stair
		Registry.register(Registry.BLOCK, new Identifier(MODID, "pink_concrete_stairs"), PINK_CONCRETE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "pink_concrete_stairs"), new BlockItem(PINK_CONCRETE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//gray concrete stair
		Registry.register(Registry.BLOCK, new Identifier(MODID, "gray_concrete_stairs"), GRAY_CONCRETE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "gray_concrete_stairs"), new BlockItem(GRAY_CONCRETE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//light gray concrete stair
		Registry.register(Registry.BLOCK, new Identifier(MODID, "light_gray_concrete_stairs"), LIGHT_GRAY_CONCRETE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "light_gray_concrete_stairs"), new BlockItem(LIGHT_GRAY_CONCRETE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//cyan concrete stair
		Registry.register(Registry.BLOCK, new Identifier(MODID, "cyan_concrete_stairs"), CYAN_CONCRETE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "cyan_concrete_stairs"), new BlockItem(CYAN_CONCRETE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//purple concrete stair
		Registry.register(Registry.BLOCK, new Identifier(MODID, "purple_concrete_stairs"), PURPLE_CONCRETE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "purple_concrete_stairs"), new BlockItem(PURPLE_CONCRETE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//blue concrete stair
		Registry.register(Registry.BLOCK, new Identifier(MODID, "blue_concrete_stairs"), BLUE_CONCRETE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "blue_concrete_stairs"), new BlockItem(BLUE_CONCRETE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//brown concrete stair
		Registry.register(Registry.BLOCK, new Identifier(MODID, "brown_concrete_stairs"), BROWN_CONCRETE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "brown_concrete_stairs"), new BlockItem(BROWN_CONCRETE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//green concrete stair
		Registry.register(Registry.BLOCK, new Identifier(MODID, "green_concrete_stairs"), GREEN_CONCRETE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "green_concrete_stairs"), new BlockItem(GREEN_CONCRETE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//red concrete stair
		Registry.register(Registry.BLOCK, new Identifier(MODID, "red_concrete_stairs"), RED_CONCRETE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "red_concrete_stairs"), new BlockItem(RED_CONCRETE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//black concrete stair
		Registry.register(Registry.BLOCK, new Identifier(MODID, "black_concrete_stairs"), BLACK_CONCRETE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "black_concrete_stairs"), new BlockItem(BLACK_CONCRETE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//white concrete slab
		Registry.register(Registry.BLOCK, new Identifier(MODID, "white_concrete_slab"), WHITE_CONCRETE_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "white_concrete_slab"), new BlockItem(WHITE_CONCRETE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//orange concrete slab
		Registry.register(Registry.BLOCK, new Identifier(MODID, "orange_concrete_slab"), ORANGE_CONCRETE_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "orange_concrete_slab"), new BlockItem(ORANGE_CONCRETE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//magenta concrete slab
		Registry.register(Registry.BLOCK, new Identifier(MODID, "magenta_concrete_slab"), MAGENTA_CONCRETE_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "magenta_concrete_slab"), new BlockItem(MAGENTA_CONCRETE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//light blue concrete slab
		Registry.register(Registry.BLOCK, new Identifier(MODID, "light_blue_concrete_slab"), LIGHT_BLUE_CONCRETE_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "light_blue_concrete_slab"), new BlockItem(LIGHT_BLUE_CONCRETE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//yellow concrete slab
		Registry.register(Registry.BLOCK, new Identifier(MODID, "yellow_concrete_slab"), YELLOW_CONCRETE_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "yellow_concrete_slab"), new BlockItem(YELLOW_CONCRETE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//lime concrete slab
		Registry.register(Registry.BLOCK, new Identifier(MODID, "lime_concrete_slab"), LIME_CONCRETE_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "lime_concrete_slab"), new BlockItem(LIME_CONCRETE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//pink concrete slab
		Registry.register(Registry.BLOCK, new Identifier(MODID, "pink_concrete_slab"), PINK_CONCRETE_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "pink_concrete_slab"), new BlockItem(PINK_CONCRETE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//gray concrete slab
		Registry.register(Registry.BLOCK, new Identifier(MODID, "gray_concrete_slab"), GRAY_CONCRETE_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "gray_concrete_slab"), new BlockItem(GRAY_CONCRETE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//light gray concrete slab
		Registry.register(Registry.BLOCK, new Identifier(MODID, "light_gray_concrete_slab"), LIGHT_GRAY_CONCRETE_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "light_gray_concrete_slab"), new BlockItem(LIGHT_GRAY_CONCRETE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//cyan concrete slab
		Registry.register(Registry.BLOCK, new Identifier(MODID, "cyan_concrete_slab"), CYAN_CONCRETE_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "cyan_concrete_slab"), new BlockItem(CYAN_CONCRETE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//purple concrete slab
		Registry.register(Registry.BLOCK, new Identifier(MODID, "purple_concrete_slab"), PURPLE_CONCRETE_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "purple_concrete_slab"), new BlockItem(PURPLE_CONCRETE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//blue concrete slab
		Registry.register(Registry.BLOCK, new Identifier(MODID, "blue_concrete_slab"), BLUE_CONCRETE_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "blue_concrete_slab"), new BlockItem(BLUE_CONCRETE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//brown concrete slab
		Registry.register(Registry.BLOCK, new Identifier(MODID, "brown_concrete_slab"), BROWN_CONCRETE_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "brown_concrete_slab"), new BlockItem(BROWN_CONCRETE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//green concrete slab
		Registry.register(Registry.BLOCK, new Identifier(MODID, "green_concrete_slab"), GREEN_CONCRETE_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "green_concrete_slab"), new BlockItem(GREEN_CONCRETE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//red concrete slab
		Registry.register(Registry.BLOCK, new Identifier(MODID, "red_concrete_slab"), RED_CONCRETE_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "red_concrete_slab"), new BlockItem(RED_CONCRETE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//black concrete slab
		Registry.register(Registry.BLOCK, new Identifier(MODID, "black_concrete_slab"), BLACK_CONCRETE_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "black_concrete_slab"), new BlockItem(BLACK_CONCRETE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// white terracotta stair
		Registry.register(Registry.BLOCK, new Identifier(MODID, "white_terracotta_stairs"), WHITE_TERRACOTTA_STAIRS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "white_terracotta_stairs"), new BlockItem(WHITE_TERRACOTTA_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//orange terracotta stair
		Registry.register(Registry.BLOCK, new Identifier(MODID, "orange_terracotta_stairs"), ORANGE_TERRACOTTA_STAIRS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "orange_terracotta_stairs"), new BlockItem(ORANGE_TERRACOTTA_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//magenta terracotta stair
		Registry.register(Registry.BLOCK, new Identifier(MODID, "magenta_terracotta_stairs"), MAGENTA_TERRACOTTA_STAIRS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "magenta_terracotta_stairs"), new BlockItem(MAGENTA_TERRACOTTA_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//light blue terracotta stair
		Registry.register(Registry.BLOCK, new Identifier(MODID, "light_blue_terracotta_stairs"), LIGHT_BLUE_TERRACOTTA_STAIRS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "light_blue_terracotta_stairs"), new BlockItem(LIGHT_BLUE_TERRACOTTA_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//yellow terracotta stair
		Registry.register(Registry.BLOCK, new Identifier(MODID, "yellow_terracotta_stairs"), YELLOW_TERRACOTTA_STAIRS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "yellow_terracotta_stairs"), new BlockItem(YELLOW_TERRACOTTA_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//lime terracotta stair
		Registry.register(Registry.BLOCK, new Identifier(MODID, "lime_terracotta_stairs"), LIME_TERRACOTTA_STAIRS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "lime_terracotta_stairs"), new BlockItem(LIME_TERRACOTTA_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//pink terracotta stair
		Registry.register(Registry.BLOCK, new Identifier(MODID, "pink_terracotta_stairs"), PINK_TERRACOTTA_STAIRS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "pink_terracotta_stairs"), new BlockItem(PINK_TERRACOTTA_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//gray terracotta stair
		Registry.register(Registry.BLOCK, new Identifier(MODID, "gray_terracotta_stairs"), GRAY_TERRACOTTA_STAIRS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "gray_terracotta_stairs"), new BlockItem(GRAY_TERRACOTTA_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//light gray terracotta stair
		Registry.register(Registry.BLOCK, new Identifier(MODID, "light_gray_terracotta_stairs"), LIGHT_GRAY_TERRACOTTA_STAIRS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "light_gray_terracotta_stairs"), new BlockItem(LIGHT_GRAY_TERRACOTTA_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//cyan terracotta stair
		Registry.register(Registry.BLOCK, new Identifier(MODID, "cyan_terracotta_stairs"), CYAN_TERRACOTTA_STAIRS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "cyan_terracotta_stairs"), new BlockItem(CYAN_TERRACOTTA_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//purple terracotta stair
		Registry.register(Registry.BLOCK, new Identifier(MODID, "purple_terracotta_stairs"), PURPLE_TERRACOTTA_STAIRS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "purple_terracotta_stairs"), new BlockItem(PURPLE_TERRACOTTA_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//blue terracotta stair
		Registry.register(Registry.BLOCK, new Identifier(MODID, "blue_terracotta_stairs"), BLUE_TERRACOTTA_STAIRS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "blue_terracotta_stairs"), new BlockItem(BLUE_TERRACOTTA_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//brown terracotta stair
		Registry.register(Registry.BLOCK, new Identifier(MODID, "brown_terracotta_stairs"), BROWN_TERRACOTTA_STAIRS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "brown_terracotta_stairs"), new BlockItem(BROWN_TERRACOTTA_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//green terracotta stair
		Registry.register(Registry.BLOCK, new Identifier(MODID, "green_terracotta_stairs"), GREEN_TERRACOTTA_STAIRS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "green_terracotta_stairs"), new BlockItem(GREEN_TERRACOTTA_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//red terracotta stair
		Registry.register(Registry.BLOCK, new Identifier(MODID, "red_terracotta_stairs"), RED_TERRACOTTA_STAIRS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "red_terracotta_stairs"), new BlockItem(RED_TERRACOTTA_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//black terracotta stair
		Registry.register(Registry.BLOCK, new Identifier(MODID, "black_terracotta_stairs"), BLACK_TERRACOTTA_STAIRS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "black_terracotta_stairs"), new BlockItem(BLACK_TERRACOTTA_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//white terracotta slab
		Registry.register(Registry.BLOCK, new Identifier(MODID, "white_terracotta_slab"), WHITE_TERRACOTTA_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "white_terracotta_slab"), new BlockItem(WHITE_TERRACOTTA_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//orange terracotta slab
		Registry.register(Registry.BLOCK, new Identifier(MODID, "orange_terracotta_slab"), ORANGE_TERRACOTTA_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "orange_terracotta_slab"), new BlockItem(ORANGE_TERRACOTTA_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//magenta terracotta slab
		Registry.register(Registry.BLOCK, new Identifier(MODID, "magenta_terracotta_slab"), MAGENTA_TERRACOTTA_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "magenta_terracotta_slab"), new BlockItem(MAGENTA_TERRACOTTA_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//light blue terracotta slab
		Registry.register(Registry.BLOCK, new Identifier(MODID, "light_blue_terracotta_slab"), LIGHT_BLUE_TERRACOTTA_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "light_blue_terracotta_slab"), new BlockItem(LIGHT_BLUE_TERRACOTTA_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//yellow terracotta slab
		Registry.register(Registry.BLOCK, new Identifier(MODID, "yellow_terracotta_slab"), YELLOW_TERRACOTTA_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "yellow_terracotta_slab"), new BlockItem(YELLOW_TERRACOTTA_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//lime terracotta slab
		Registry.register(Registry.BLOCK, new Identifier(MODID, "lime_terracotta_slab"), LIME_TERRACOTTA_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "lime_terracotta_slab"), new BlockItem(LIME_TERRACOTTA_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//pink terracotta slab
		Registry.register(Registry.BLOCK, new Identifier(MODID, "pink_terracotta_slab"), PINK_TERRACOTTA_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "pink_terracotta_slab"), new BlockItem(PINK_TERRACOTTA_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//gray terracotta slab
		Registry.register(Registry.BLOCK, new Identifier(MODID, "gray_terracotta_slab"), GRAY_TERRACOTTA_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "gray_terracotta_slab"), new BlockItem(GRAY_TERRACOTTA_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//light gray terracotta slab
		Registry.register(Registry.BLOCK, new Identifier(MODID, "light_gray_terracotta_slab"), LIGHT_GRAY_TERRACOTTA_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "light_gray_terracotta_slab"), new BlockItem(LIGHT_GRAY_TERRACOTTA_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//cyan terracotta slab
		Registry.register(Registry.BLOCK, new Identifier(MODID, "cyan_terracotta_slab"), CYAN_TERRACOTTA_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "cyan_terracotta_slab"), new BlockItem(CYAN_TERRACOTTA_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//purple terracotta slab
		Registry.register(Registry.BLOCK, new Identifier(MODID, "purple_terracotta_slab"), PURPLE_TERRACOTTA_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "purple_terracotta_slab"), new BlockItem(PURPLE_TERRACOTTA_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//blue terracotta slab
		Registry.register(Registry.BLOCK, new Identifier(MODID, "blue_terracotta_slab"), BLUE_TERRACOTTA_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "blue_terracotta_slab"), new BlockItem(BLUE_TERRACOTTA_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//brown terracotta slab
		Registry.register(Registry.BLOCK, new Identifier(MODID, "brown_terracotta_slab"), BROWN_TERRACOTTA_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "brown_terracotta_slab"), new BlockItem(BROWN_TERRACOTTA_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//green terracotta slab
		Registry.register(Registry.BLOCK, new Identifier(MODID, "green_terracotta_slab"), GREEN_TERRACOTTA_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "green_terracotta_slab"), new BlockItem(GREEN_TERRACOTTA_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//red terracotta slab
		Registry.register(Registry.BLOCK, new Identifier(MODID, "red_terracotta_slab"), RED_TERRACOTTA_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "red_terracotta_slab"), new BlockItem(RED_TERRACOTTA_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//black terracotta slab
		Registry.register(Registry.BLOCK, new Identifier(MODID, "black_terracotta_slab"), BLACK_TERRACOTTA_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "black_terracotta_slab"), new BlockItem(BLACK_TERRACOTTA_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	}
}