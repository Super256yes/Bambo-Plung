/*    */ package bamboplugin.bamboplugin.glasshelms;
/*    */ 
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.block.Block;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.block.BlockPlaceEvent;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ 
/*    */ public class blockplacement implements Listener {
/*    */   @EventHandler
/*    */   public void onBlockPlace(BlockPlaceEvent event) {
/* 14 */     Block block = event.getBlockPlaced();
/* 15 */     Player player = event.getPlayer();
/*    */ 
/*    */ 
/*    */     
/* 19 */     if (block.getType() == Material.BLUE_STAINED_GLASS && 
/* 20 */       player.getInventory().getItemInMainHand().equals(Item.glasshelm)) {
/* 21 */       block.setType(Material.AIR);
/* 22 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm });
/* 23 */       player.getInventory().removeItem(new ItemStack[] { Item.glasshelm });
/*    */     } 
/*    */     
/* 26 */     if (block.getType() == Material.LIGHT_BLUE_STAINED_GLASS && 
/* 27 */       player.getInventory().getItemInMainHand().equals(Item.glasshelm1)) {
/* 28 */       block.setType(Material.AIR);
/* 29 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm1 });
/* 30 */       player.getInventory().removeItem(new ItemStack[] { Item.glasshelm1 });
/*    */     } 
/*    */     
/* 33 */     if (block.getType() == Material.YELLOW_STAINED_GLASS && 
/* 34 */       player.getInventory().getItemInMainHand().equals(Item.glasshelm2)) {
/* 35 */       block.setType(Material.AIR);
/* 36 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm2 });
/* 37 */       player.getInventory().removeItem(new ItemStack[] { Item.glasshelm2 });
/*    */     } 
/*    */     
/* 40 */     if (block.getType() == Material.LIME_STAINED_GLASS && 
/* 41 */       player.getInventory().getItemInMainHand().equals(Item.glasshelm3)) {
/* 42 */       block.setType(Material.AIR);
/* 43 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm3 });
/* 44 */       player.getInventory().removeItem(new ItemStack[] { Item.glasshelm3 });
/*    */     } 
/*    */     
/* 47 */     if (block.getType() == Material.PINK_STAINED_GLASS && 
/* 48 */       player.getInventory().getItemInMainHand().equals(Item.glasshelm4)) {
/* 49 */       block.setType(Material.AIR);
/* 50 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm4 });
/* 51 */       player.getInventory().removeItem(new ItemStack[] { Item.glasshelm4 });
/*    */     } 
/*    */     
/* 54 */     if (block.getType() == Material.RED_STAINED_GLASS && 
/* 55 */       player.getInventory().getItemInMainHand().equals(Item.glasshelm5)) {
/* 56 */       block.setType(Material.AIR);
/* 57 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm5 });
/* 58 */       player.getInventory().removeItem(new ItemStack[] { Item.glasshelm5 });
/*    */     } 
/*    */     
/* 61 */     if (block.getType() == Material.ORANGE_STAINED_GLASS && 
/* 62 */       player.getInventory().getItemInMainHand().equals(Item.glasshelm6)) {
/* 63 */       block.setType(Material.AIR);
/* 64 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm6 });
/* 65 */       player.getInventory().removeItem(new ItemStack[] { Item.glasshelm6 });
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\nikor\Downloads\Bambo-Plugin.jar!\bamboplugin\bamboplugin\glasshelms\blockplacement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */