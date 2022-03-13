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
/*    */ public class tripleShot implements Listener {
/*    */   @EventHandler
/*    */   public void onBowInteract(PlayerInteractEvent event) {
/* 17 */     Player player = event.getPlayer();
/* 18 */     PlayerInventory playerInventory = player.getInventory();
/* 19 */     if (player.getInventory().getItemInMainHand().getType().equals(Material.CROSSBOW) && (
/* 20 */       event.getAction() == Action.LEFT_CLICK_AIR || event.getAction() == Action.LEFT_CLICK_BLOCK))
/* 21 */       for (int i = 0; i < playerInventory.getSize(); i++) {
/* 22 */         ItemStack itemStack = playerInventory.getItem(i);
/* 23 */         if (itemStack != null && 
/* 24 */           itemStack.getType() == Material.ARROW) {
/* 25 */           Arrow arrow = (Arrow)player.getWorld().spawn(player.getEyeLocation(), Arrow.class);
/* 26 */           arrow.setShooter((ProjectileSource)player);
/* 27 */           arrow.setVelocity(player.getLocation().getDirection().multiply(2.2D));
/* 28 */           arrow.setKnockbackStrength(1);
/* 29 */           Arrow arrow1 = (Arrow)player.getWorld().spawn(player.getEyeLocation(), Arrow.class);
/* 30 */           arrow1.setShooter((ProjectileSource)player);
/* 31 */           arrow1.setVelocity(player.getLocation().getDirection().multiply(2.2D));
/* 32 */           arrow1.setKnockbackStrength(1);
/* 33 */           arrow1.setVelocity(arrow.getVelocity().rotateAroundY(Math.toRadians(6.0D)));
/* 34 */           Arrow arrow2 = (Arrow)player.getWorld().spawn(player.getEyeLocation(), Arrow.class);
/* 35 */           arrow2.setShooter((ProjectileSource)player);
/* 36 */           arrow2.setVelocity(player.getLocation().getDirection().multiply(2.2D));
/* 37 */           arrow2.setKnockbackStrength(1);
/* 38 */           arrow2.setVelocity(arrow.getVelocity().rotateAroundY(Math.toRadians(-6.0D)));
/* 39 */           if (itemStack.getAmount() > 3) {
/* 40 */             itemStack.setAmount(itemStack.getAmount() - 3);
/*    */           } else {
/* 42 */             itemStack.setAmount(0);
/* 43 */             itemStack.setType(Material.AIR);
/*    */           } 
/* 45 */           player.updateInventory();
/*    */           break;
/*    */         } 
/*    */       }  
/*    */   }
/*    */ }


/* Location:              C:\Users\nikor\Downloads\Bambo-Plugin.jar!\bamboplugin\bamboplugin\betterbows\tripleShot.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */