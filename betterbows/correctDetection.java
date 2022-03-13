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
/* 12 */     if (event.getDamager() instanceof org.bukkit.entity.Arrow)
/* 13 */       ((LivingEntity)event.getEntity()).setNoDamageTicks(0); 
/*    */   }
/*    */ }


/* Location:              C:\Users\nikor\Downloads\Bambo-Plugin.jar!\bamboplugin\bamboplugin\betterbows\correctDetection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */