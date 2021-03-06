package com.team.kalstuff;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class KalStuffRecipes {

	public static void add() {
   	 GameRegistry.addShapelessRecipe(new ItemStack(StartupCommon.itemEnderPowder, 4), new Object[] {
		 new ItemStack(Items.ender_pearl),
		 new ItemStack(Items.flint)
		 });
 
 GameRegistry.addShapelessRecipe(new ItemStack(StartupCommon.itemCoffee, 1), new Object[] {
	 new ItemStack(Blocks.dirt),
	 new ItemStack(StartupCommon.itemCoffeeMug)
	 });
 
 GameRegistry.addShapelessRecipe(new ItemStack(StartupCommon.itemTea, 1), new Object[] {
	 new ItemStack(Blocks.leaves),
	 new ItemStack(StartupCommon.itemCoffeeMug)
	 });
 

 GameRegistry.addShapelessRecipe(new ItemStack(StartupCommon.itemLightCoffee, 1), new Object[] {
	 new ItemStack(Items.milk_bucket),
	 new ItemStack(StartupCommon.itemCoffee)
	 });
  
 GameRegistry.addRecipe(new ItemStack(StartupCommon.itemCoffeeMug, 1),  new Object[] {
	 "PC",
	 'C', Items.clay_ball,
	 'P', Items.flower_pot,
		 });
 
 GameRegistry.addRecipe(new ItemStack(StartupCommon.blockBridge, 1),  new Object[] {
	 "SPS",
	 "PEP",
	 "SPS",
	 'S', Items.stick,
	 'P', Blocks.planks,
	 'E', StartupCommon.itemEnderPowder
		 });
 
 GameRegistry.addRecipe(new ItemStack(StartupCommon.blockEnder, 1), new Object[] {
	 "PPP",
	 "PPP",
	 "PPP",
	 'P', Items.ender_pearl
 });

 GameRegistry.addRecipe(new ItemStack(StartupCommon.blockMystery, 1), new Object[] {
	 "PPP",
	 "PPP",
	 "PPP",
	 'P', Blocks.planks
 });
 
 GameRegistry.addRecipe(new ItemStack(StartupCommon.blockBlaze, 1), new Object[] {
	 "PPP",
	 "PPP",
	 "PPP",
	 'P', Items.blaze_rod
 });
 
 GameRegistry.addRecipe(new ItemStack(StartupCommon.blockCarrot, 1), new Object[] {
	 "PPP",
	 "PPP",
	 "PPP",
	 'P', Items.carrot
 });
 
 GameRegistry.addRecipe(new ItemStack(StartupCommon.blockApple, 4), new Object[] {
	 "PPP",
	 "PPP",
	 "PPP",
	 'P', Items.apple
 });
 
 GameRegistry.addRecipe(new ItemStack(StartupCommon.blockPotato, 4), new Object[] {
	 "PPP",
	 "PPP",
	 "PPP",
	 'P', Items.potato
 });
 
 GameRegistry.addRecipe(new ItemStack(StartupCommon.itemGoldenMug, 1), new Object[] {
	 "...",
	 "p.p",
	 ".p.",
	 'P', Items.gold_ingot
 });
 
 GameRegistry.addShapelessRecipe(new ItemStack(StartupCommon.itemJewelSoup, 1), new Object[] {
	 new ItemStack(Items.diamond),
	 new ItemStack(StartupCommon.itemGoldenMug)
	 });
 
	}
	
}
