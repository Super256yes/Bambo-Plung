/*    */ package bamboplugin.bamboplugin.betterbows;
/*    */ 
/*    */ import org.bukkit.entity.LivingEntity;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.entity.EntityDamageByEntityEvent;
/*    */ 
/*    */ public class correctDetection
/*    */   implements Listener {
/*    */   @EventHandler
/*    */   public void onDamage(EntityDamageByEntityEvent event) {
/* 12 */     if (event.getDamager() instanceof org.bukkit.entity.Arrow && event
/* 13 */       .getEntity() instanceof LivingEntity) {
/* 14 */       System.out.println("Hit mob");
/* 15 */       ((LivingEntity)event.getEntity()).setNoDamageTicks(1);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\nikor\Downloads\Bambo-Plugin.jar!\bamboplugin\bamboplugin\betterbows\correctDetection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */