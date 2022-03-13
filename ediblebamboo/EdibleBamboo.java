/*    */ package bamboplugin.bamboplugin.ediblebamboo;
/*    */ 
/*    */ import java.util.Random;
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
/* 19 */     Player player = event.getPlayer();
/* 20 */     Action action = event.getAction();
/* 21 */     ItemStack item = event.getItem();
/*    */ 
/*    */     
/* 24 */     if (action.equals(Action.RIGHT_CLICK_AIR) && 
/* 25 */       item != null && item.getType() == Material.BAMBOO) {
/* 26 */       Random rand = new Random();
/* 27 */       int temp = rand.nextInt(2);
/* 28 */       player.setFoodLevel(player.getFoodLevel() + 1);
/* 29 */       if (temp >= 1) {
/* 30 */         player.setSaturation(2.0F);
/*    */       }
/* 32 */       if (player.getFoodLevel() <= 20)
/* 33 */         player.getInventory().removeItem(new ItemStack[] { new ItemStack(Material.BAMBOO, 1) }); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\nikor\Downloads\Bambo-Plugin.jar!\bamboplugin\bamboplugin\ediblebamboo\EdibleBamboo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */