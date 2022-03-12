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
/* 17 */     if (player.getInventory().getItemInMainHand().equals(Item.Talkingben) && 
/* 18 */       event.getAction() == Action.LEFT_CLICK_AIR) {
/* 19 */       Random rand = new Random();
/* 20 */       int call = rand.nextInt(3);
/* 21 */       if (call == 0) {
/* 22 */         System.out.println("Rolled 1");
/* 23 */         player.sendMessage(ChatColor.YELLOW + "Ben: yas");
/*    */       } 
/* 25 */       if (call == 1) {
/* 26 */         System.out.println("Rolled 2");
/* 27 */         player.sendMessage(ChatColor.YELLOW + "Ben: no.");
/*    */       } 
/*    */       
/* 30 */       if (call == 2) {
/* 31 */         System.out.println("Rolled 3");
/* 32 */         player.sendMessage(ChatColor.YELLOW + "Ben: HEHEHEHA");
/*    */       } 
/*    */       
/* 35 */       if (call == 1) {
/* 36 */         System.out.println("Rolled 4");
/* 37 */         player.sendMessage(ChatColor.YELLOW + "Ben: ugh");
/*    */       } 
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 44 */     if (player.getInventory().getItemInMainHand().equals(Item.Talkingben) && 
/* 45 */       event.getAction() == Action.LEFT_CLICK_BLOCK) {
/* 46 */       Random rand = new Random();
/* 47 */       int call = rand.nextInt(3);
/* 48 */       if (call == 0) {
/* 49 */         System.out.println("Rolled 1");
/* 50 */         player.sendMessage(ChatColor.YELLOW + "Ben: yas");
/*    */       } 
/* 52 */       if (call == 1) {
/* 53 */         System.out.println("Rolled 2");
/* 54 */         player.sendMessage(ChatColor.YELLOW + "Ben: no.");
/*    */       } 
/*    */       
/* 57 */       if (call == 2) {
/* 58 */         System.out.println("Rolled 3");
/* 59 */         player.sendMessage(ChatColor.YELLOW + "Ben: HEHEHEHA");
/*    */       } 
/*    */       
/* 62 */       if (call == 1) {
/* 63 */         System.out.println("Rolled 4");
/* 64 */         player.sendMessage(ChatColor.YELLOW + "Ben: ugh");
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\nikor\Downloads\Bambo-Plugin.jar!\bamboplugin\bamboplugin\talkingBen\talkingben.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */