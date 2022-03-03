/*    */ package bamboplugin.bamboplugin.glasshelms;
/*    */ 
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
/* 20 */     Player player = event.getPlayer();
/* 21 */     Action action = event.getAction();
/* 22 */     ItemStack item = event.getItem();
/* 23 */     if (event.getAction() == Action.RIGHT_CLICK_AIR && 
/* 24 */       event.getItem() != null && 
/* 25 */       event.getItem().getItemMeta().equals(Item.glasshelm.getItemMeta())) {
/* 26 */       player.getInventory().removeItem(new ItemStack[] { Item.glasshelm });
/* 27 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm1 });
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 32 */     if (event.getAction() == Action.RIGHT_CLICK_AIR && 
/* 33 */       event.getItem() != null && 
/* 34 */       event.getItem().getItemMeta().equals(Item.glasshelm1.getItemMeta())) {
/* 35 */       player.getInventory().removeItem(new ItemStack[] { Item.glasshelm1 });
/* 36 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm2 });
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 41 */     if (event.getAction() == Action.RIGHT_CLICK_AIR && 
/* 42 */       event.getItem() != null && 
/* 43 */       event.getItem().getItemMeta().equals(Item.glasshelm2.getItemMeta())) {
/* 44 */       player.getInventory().removeItem(new ItemStack[] { Item.glasshelm2 });
/* 45 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm3 });
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 50 */     if (event.getAction() == Action.RIGHT_CLICK_AIR && 
/* 51 */       event.getItem() != null && 
/* 52 */       event.getItem().getItemMeta().equals(Item.glasshelm3.getItemMeta())) {
/* 53 */       player.getInventory().removeItem(new ItemStack[] { Item.glasshelm3 });
/* 54 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm4 });
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 59 */     if (event.getAction() == Action.RIGHT_CLICK_AIR && 
/* 60 */       event.getItem() != null && 
/* 61 */       event.getItem().getItemMeta().equals(Item.glasshelm4.getItemMeta())) {
/* 62 */       player.getInventory().removeItem(new ItemStack[] { Item.glasshelm4 });
/* 63 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm5 });
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 68 */     if (event.getAction() == Action.RIGHT_CLICK_AIR && 
/* 69 */       event.getItem() != null && 
/* 70 */       event.getItem().getItemMeta().equals(Item.glasshelm5.getItemMeta())) {
/* 71 */       player.getInventory().removeItem(new ItemStack[] { Item.glasshelm5 });
/* 72 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm6 });
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 77 */     if (event.getAction() == Action.RIGHT_CLICK_AIR && 
/* 78 */       event.getItem() != null && 
/* 79 */       event.getItem().getItemMeta().equals(Item.glasshelm6.getItemMeta())) {
/* 80 */       player.getInventory().removeItem(new ItemStack[] { Item.glasshelm6 });
/* 81 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm });
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\nikor\Downloads\Bambo-Plugin.jar!\bamboplugin\bamboplugin\glasshelms\changeglasshelm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */