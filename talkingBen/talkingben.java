/*    */ package bamboplugin.bamboplugin.talkingBen;
/*    */ 
/*    */ import bamboplugin.bamboplugin.Item;
/*    */ import java.util.Random;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.block.Action;
/*    */ import org.bukkit.event.player.PlayerInteractEvent;
/*    */ 
/*    */ public class talkingben
/*    */   implements Listener {
/*    */   @EventHandler
/*    */   public void onPlayerClicks(PlayerInteractEvent event) {
/* 16 */     Player player = event.getPlayer();
/* 17 */     if (player.getInventory().getItemInMainHand().equals(Item.Talkingben) && (
/* 18 */       event.getAction() == Action.LEFT_CLICK_AIR || event.getAction() == Action.LEFT_CLICK_BLOCK)) {
/* 19 */       Random rand = new Random();
/* 20 */       int call = rand.nextInt(3);
/* 21 */       if (call == 0) {
/* 22 */         player.sendMessage(ChatColor.YELLOW + "Ben: yas");
/*    */       }
/* 24 */       if (call == 1) {
/* 25 */         player.sendMessage(ChatColor.YELLOW + "Ben: no.");
/*    */       }
/*    */       
/* 28 */       if (call == 2) {
/* 29 */         player.sendMessage(ChatColor.YELLOW + "Ben: HEHEHEHA");
/*    */       }
/*    */       
/* 32 */       if (call == 1)
/* 33 */         player.sendMessage(ChatColor.YELLOW + "Ben: ugh"); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\nikor\Downloads\Bambo-Plugin.jar!\bamboplugin\bamboplugin\talkingBen\talkingben.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */