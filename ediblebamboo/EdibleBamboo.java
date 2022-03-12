/*    */ package bamboplugin.bamboplugin.ediblebamboo;
/*    */ 
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.block.Action;
/*    */ import org.bukkit.event.player.PlayerInteractEvent;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class EdibleBamboo
/*    */   implements Listener
/*    */ {
/*    */   @EventHandler
/*    */   public void onPlayerClicks(PlayerInteractEvent event) {
/* 18 */     Player player = event.getPlayer();
/* 19 */     Action action = event.getAction();
/* 20 */     ItemStack item = event.getItem();
/*    */ 
/*    */     
/* 23 */     if (action.equals(Action.RIGHT_CLICK_AIR) && 
/* 24 */       item != null && item.getType() == Material.BAMBOO) {
/* 25 */       player.setFoodLevel(player.getFoodLevel() + 1);
/* 26 */       if (player.getFoodLevel() <= 20)
/* 27 */         player.getInventory().removeItem(new ItemStack[] { new ItemStack(Material.BAMBOO, 1) }); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\nikor\Downloads\Bambo-Plugin.jar!\bamboplugin\bamboplugin\ediblebamboo\EdibleBamboo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */