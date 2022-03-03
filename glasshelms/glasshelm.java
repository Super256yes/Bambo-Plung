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
/*    */ public class glasshelm
/*    */   implements Listener
/*    */ {
/*    */   @EventHandler
/*    */   public void onPlayerClicks(PlayerInteractEvent event) {
/* 19 */     Player player = event.getPlayer();
/*    */     
/* 21 */     if (player.getInventory().getHelmet() == null) {
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 26 */       if (event.getAction() == Action.LEFT_CLICK_AIR && 
/* 27 */         event.getItem() != null && 
/* 28 */         event.getItem().getItemMeta().equals(Item.glasshelm.getItemMeta())) {
/* 29 */         player.getInventory().removeItem(new ItemStack[] { Item.glasshelm });
/* 30 */         player.getInventory().setHelmet(Item.glasshelm);
/*    */       } 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 36 */       if (event.getAction() == Action.LEFT_CLICK_AIR && 
/* 37 */         event.getItem() != null && 
/* 38 */         event.getItem().getItemMeta().equals(Item.glasshelm1.getItemMeta())) {
/* 39 */         player.getInventory().removeItem(new ItemStack[] { Item.glasshelm1 });
/* 40 */         player.getInventory().setHelmet(Item.glasshelm1);
/*    */       } 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 46 */       if (event.getAction() == Action.LEFT_CLICK_AIR && 
/* 47 */         event.getItem() != null && 
/* 48 */         event.getItem().getItemMeta().equals(Item.glasshelm2.getItemMeta())) {
/*    */         
/* 50 */         player.getInventory().removeItem(new ItemStack[] { Item.glasshelm2 });
/* 51 */         player.getInventory().setHelmet(Item.glasshelm2);
/*    */       } 
/*    */ 
/*    */ 
/*    */       
/* 56 */       if (event.getAction() == Action.LEFT_CLICK_AIR && 
/* 57 */         event.getItem() != null && 
/* 58 */         event.getItem().getItemMeta().equals(Item.glasshelm3.getItemMeta())) {
/* 59 */         player.getInventory().removeItem(new ItemStack[] { Item.glasshelm3 });
/* 60 */         player.getInventory().setHelmet(Item.glasshelm3);
/*    */       } 
/*    */ 
/*    */ 
/*    */       
/* 65 */       if (event.getAction() == Action.LEFT_CLICK_AIR && 
/* 66 */         event.getItem() != null && 
/* 67 */         event.getItem().getItemMeta().equals(Item.glasshelm4.getItemMeta())) {
/* 68 */         player.getInventory().removeItem(new ItemStack[] { Item.glasshelm4 });
/* 69 */         player.getInventory().setHelmet(Item.glasshelm4);
/*    */       } 
/*    */ 
/*    */ 
/*    */       
/* 74 */       if (event.getAction() == Action.LEFT_CLICK_AIR && 
/* 75 */         event.getItem() != null && 
/* 76 */         event.getItem().getItemMeta().equals(Item.glasshelm5.getItemMeta())) {
/* 77 */         player.getInventory().removeItem(new ItemStack[] { Item.glasshelm5 });
/* 78 */         player.getInventory().setHelmet(Item.glasshelm5);
/*    */       } 
/*    */ 
/*    */ 
/*    */       
/* 83 */       if (event.getAction() == Action.LEFT_CLICK_AIR && 
/* 84 */         event.getItem() != null && 
/* 85 */         event.getItem().getItemMeta().equals(Item.glasshelm6.getItemMeta())) {
/* 86 */         player.getInventory().removeItem(new ItemStack[] { Item.glasshelm6 });
/* 87 */         player.getInventory().setHelmet(Item.glasshelm6);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\nikor\Downloads\Bambo-Plugin.jar!\bamboplugin\bamboplugin\glasshelms\glasshelm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */