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


	/*
	public static final StairsBlock WHITE_CONCRETE_SLAB = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_SLAB.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock ORANGE_CONCRETE_SLAB = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_SLAB.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock MAGENTA_CONCRETE_SLAB = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_SLAB.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock LIGHT_BLUE_CONCRETE_SLAB = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_SLAB.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock YELLOW_CONCRETE_SLAB = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_SLAB.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock LIME_CONCRETE_SLAB = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_SLAB.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock PINK_CONCRETE_SLAB = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_SLAB.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock GRAY_CONCRETE_SLAB = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_SLAB.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock LIGHT_GRAY_CONCRETE_SLAB = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_SLAB.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock CYAN_CONCRETE_SLAB = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_SLAB.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock PURPLE_CONCRETE_SLAB = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_SLAB.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock BLUE_CONCRETE_SLAB = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_SLAB.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock BROWN_CONCRETE_SLAB = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_SLAB.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock GREEN_CONCRETE_SLAB = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_SLAB.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock RED_CONCRETE_SLAB = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_SLAB.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	public static final StairsBlock BLACK_CONCRETE_SLAB = new StairsBlock(net.minecraft.block.Blocks.ANDESITE_SLAB.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());
	*/

	public static final SlabBlock WHITE_CONCRETE_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(1.8f).requiresTool());

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
	}
}