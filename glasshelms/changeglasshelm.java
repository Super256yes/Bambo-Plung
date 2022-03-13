/*    */ package bamboplugin.bamboplugin.glasshelms;
/*    */ 
/*    */ import bamboplugin.bamboplugin.Item;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.block.Action;
/*    */ import org.bukkit.event.player.PlayerInteractEvent;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class changeglasshelm
/*    */   implements Listener
/*    */ {
/*    */   @EventHandler
/*    */   public void onPlayerClicks(PlayerInteractEvent event) {
/* 21 */     Player player = event.getPlayer();
/* 22 */     Action action = event.getAction();
/* 23 */     ItemStack item = event.getItem();
/* 24 */     if (event.getAction() == Action.RIGHT_CLICK_AIR && 
/* 25 */       event.getItem() != null && 
/* 26 */       event.getItem().getItemMeta().equals(Item.glasshelm.getItemMeta())) {
/* 27 */       player.getInventory().removeItem(new ItemStack[] { Item.glasshelm });
/* 28 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm1 });
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 33 */     if (event.getAction() == Action.RIGHT_CLICK_AIR && 
/* 34 */       event.getItem() != null && 
/* 35 */       event.getItem().getItemMeta().equals(Item.glasshelm1.getItemMeta())) {
/* 36 */       player.getInventory().removeItem(new ItemStack[] { Item.glasshelm1 });
/* 37 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm2 });
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 42 */     if (event.getAction() == Action.RIGHT_CLICK_AIR && 
/* 43 */       event.getItem() != null && 
/* 44 */       event.getItem().getItemMeta().equals(Item.glasshelm2.getItemMeta())) {
/* 45 */       player.getInventory().removeItem(new ItemStack[] { Item.glasshelm2 });
/* 46 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm3 });
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 51 */     if (event.getAction() == Action.RIGHT_CLICK_AIR && 
/* 52 */       event.getItem() != null && 
/* 53 */       event.getItem().getItemMeta().equals(Item.glasshelm3.getItemMeta())) {
/* 54 */       player.getInventory().removeItem(new ItemStack[] { Item.glasshelm3 });
/* 55 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm4 });
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 60 */     if (event.getAction() == Action.RIGHT_CLICK_AIR && 
/* 61 */       event.getItem() != null && 
/* 62 */       event.getItem().getItemMeta().equals(Item.glasshelm4.getItemMeta())) {
/* 63 */       player.getInventory().removeItem(new ItemStack[] { Item.glasshelm4 });
/* 64 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm5 });
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 69 */     if (event.getAction() == Action.RIGHT_CLICK_AIR && 
/* 70 */       event.getItem() != null && 
/* 71 */       event.getItem().getItemMeta().equals(Item.glasshelm5.getItemMeta())) {
/* 72 */       player.getInventory().removeItem(new ItemStack[] { Item.glasshelm5 });
/* 73 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm6 });
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 78 */     if (event.getAction() == Action.RIGHT_CLICK_AIR && 
/* 79 */       event.getItem() != null && 
/* 80 */       event.getItem().getItemMeta().equals(Item.glasshelm6.getItemMeta())) {
/* 81 */       player.getInventory().removeItem(new ItemStack[] { Item.glasshelm6 });
/* 82 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm });
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\nikor\Downloads\Bambo-Plugin.jar!\bamboplugin\bamboplugin\glasshelms\changeglasshelm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */