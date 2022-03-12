/*    */ package bamboplugin.bamboplugin.glasshelms;
/*    */ 
/*    */ import bamboplugin.bamboplugin.Item;
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
/* 15 */     Block block = event.getBlockPlaced();
/* 16 */     Player player = event.getPlayer();
/*    */ 
/*    */ 
/*    */     
/* 20 */     if (block.getType() == Material.BLUE_STAINED_GLASS && 
/* 21 */       player.getInventory().getItemInMainHand().equals(Item.glasshelm)) {
/* 22 */       block.setType(Material.AIR);
/* 23 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm });
/* 24 */       player.getInventory().removeItem(new ItemStack[] { Item.glasshelm });
/*    */     } 
/*    */     
/* 27 */     if (block.getType() == Material.LIGHT_BLUE_STAINED_GLASS && 
/* 28 */       player.getInventory().getItemInMainHand().equals(Item.glasshelm1)) {
/* 29 */       block.setType(Material.AIR);
/* 30 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm1 });
/* 31 */       player.getInventory().removeItem(new ItemStack[] { Item.glasshelm1 });
/*    */     } 
/*    */     
/* 34 */     if (block.getType() == Material.YELLOW_STAINED_GLASS && 
/* 35 */       player.getInventory().getItemInMainHand().equals(Item.glasshelm2)) {
/* 36 */       block.setType(Material.AIR);
/* 37 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm2 });
/* 38 */       player.getInventory().removeItem(new ItemStack[] { Item.glasshelm2 });
/*    */     } 
/*    */     
/* 41 */     if (block.getType() == Material.LIME_STAINED_GLASS && 
/* 42 */       player.getInventory().getItemInMainHand().equals(Item.glasshelm3)) {
/* 43 */       block.setType(Material.AIR);
/* 44 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm3 });
/* 45 */       player.getInventory().removeItem(new ItemStack[] { Item.glasshelm3 });
/*    */     } 
/*    */     
/* 48 */     if (block.getType() == Material.PINK_STAINED_GLASS && 
/* 49 */       player.getInventory().getItemInMainHand().equals(Item.glasshelm4)) {
/* 50 */       block.setType(Material.AIR);
/* 51 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm4 });
/* 52 */       player.getInventory().removeItem(new ItemStack[] { Item.glasshelm4 });
/*    */     } 
/*    */     
/* 55 */     if (block.getType() == Material.RED_STAINED_GLASS && 
/* 56 */       player.getInventory().getItemInMainHand().equals(Item.glasshelm5)) {
/* 57 */       block.setType(Material.AIR);
/* 58 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm5 });
/* 59 */       player.getInventory().removeItem(new ItemStack[] { Item.glasshelm5 });
/*    */     } 
/*    */     
/* 62 */     if (block.getType() == Material.ORANGE_STAINED_GLASS && 
/* 63 */       player.getInventory().getItemInMainHand().equals(Item.glasshelm6)) {
/* 64 */       block.setType(Material.AIR);
/* 65 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm6 });
/* 66 */       player.getInventory().removeItem(new ItemStack[] { Item.glasshelm6 });
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\nikor\Downloads\Bambo-Plugin.jar!\bamboplugin\bamboplugin\glasshelms\blockplacement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */