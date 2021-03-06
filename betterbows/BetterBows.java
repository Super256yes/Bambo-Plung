/*    */ package bamboplugin.bamboplugin.betterbows;
/*    */ 
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.entity.Arrow;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.block.Action;
/*    */ import org.bukkit.event.player.PlayerInteractEvent;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.inventory.PlayerInventory;
/*    */ import org.bukkit.projectiles.ProjectileSource;
/*    */ 
/*    */ public class BetterBows implements Listener {
/*    */   @EventHandler
/*    */   public void onBowInteract(PlayerInteractEvent event) {
/* 17 */     Player player = event.getPlayer();
/* 18 */     PlayerInventory playerInventory = player.getInventory();
/* 19 */     if (player.getInventory().getItemInMainHand().getType().equals(Material.BOW) && (
/* 20 */       event.getAction() == Action.LEFT_CLICK_AIR || event.getAction() == Action.LEFT_CLICK_BLOCK))
/* 21 */       for (int i = 0; i < playerInventory.getSize(); i++) {
/* 22 */         ItemStack itemStack = playerInventory.getItem(i);
/* 23 */         if (itemStack != null && 
/* 24 */           itemStack.getType() == Material.ARROW) {
/* 25 */           Arrow arrow = (Arrow)player.getWorld().spawn(player.getEyeLocation(), Arrow.class);
/* 26 */           arrow.setShooter((ProjectileSource)player);
/* 27 */           arrow.setVelocity(player.getLocation().getDirection().multiply(1.7D));
/* 28 */           arrow.setKnockbackStrength(1);
/* 29 */           System.out.println("Launched Arrow");
/*    */           
/* 31 */           if (itemStack.getAmount() > 1) {
/* 32 */             itemStack.setAmount(itemStack.getAmount() - 1);
/*    */           } else {
/* 34 */             itemStack.setAmount(0);
/* 35 */             itemStack.setType(Material.AIR);
/*    */           } 
/* 37 */           player.updateInventory();
/*    */           break;
/*    */         } 
/*    */       }  
/*    */   }
/*    */ }


/* Location:              C:\Users\nikor\Downloads\Bambo-Plugin.jar!\bamboplugin\bamboplugin\betterbows\BetterBows.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */