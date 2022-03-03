/*    */ package bamboplugin.bamboplugin.glasshelms;
/*    */ 
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.player.PlayerInteractEvent;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ 
/*    */ public class offhand
/*    */   implements Listener {
/*    */   @EventHandler
/*    */   public void onPlayerClicks(PlayerInteractEvent event) {
/* 15 */     Player player = event.getPlayer();
/*    */     
/* 17 */     if (player.getInventory().getItemInOffHand().equals(Item.glasshelm)) {
/* 18 */       player.sendMessage(ChatColor.RED + "You can not put that item in your off-hand!");
/* 19 */       player.getInventory().setItemInOffHand(new ItemStack(Material.AIR));
/* 20 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm });
/*    */     } 
/* 22 */     if (player.getInventory().getItemInOffHand().equals(Item.glasshelm1)) {
/* 23 */       player.sendMessage(ChatColor.RED + "You can not put that item in your off-hand!");
/* 24 */       player.getInventory().setItemInOffHand(new ItemStack(Material.AIR));
/* 25 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm1 });
/*    */     } 
/* 27 */     if (player.getInventory().getItemInOffHand().equals(Item.glasshelm2)) {
/* 28 */       player.sendMessage(ChatColor.RED + "You can not put that item in your off-hand!");
/* 29 */       player.getInventory().setItemInOffHand(new ItemStack(Material.AIR));
/* 30 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm2 });
/*    */     } 
/* 32 */     if (player.getInventory().getItemInOffHand().equals(Item.glasshelm3)) {
/* 33 */       player.sendMessage(ChatColor.RED + "You can not put that item in your off-hand!");
/* 34 */       player.getInventory().setItemInOffHand(new ItemStack(Material.AIR));
/* 35 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm3 });
/*    */     } 
/* 37 */     if (player.getInventory().getItemInOffHand().equals(Item.glasshelm4)) {
/* 38 */       player.sendMessage(ChatColor.RED + "You can not put that item in your off-hand!");
/* 39 */       player.getInventory().setItemInOffHand(new ItemStack(Material.AIR));
/* 40 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm4 });
/*    */     } 
/* 42 */     if (player.getInventory().getItemInOffHand().equals(Item.glasshelm5)) {
/* 43 */       player.sendMessage(ChatColor.RED + "You can not put that item in your off-hand!");
/* 44 */       player.getInventory().setItemInOffHand(new ItemStack(Material.AIR));
/* 45 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm5 });
/*    */     } 
/* 47 */     if (player.getInventory().getItemInOffHand().equals(Item.glasshelm6)) {
/* 48 */       player.sendMessage(ChatColor.RED + "You can not put that item in your off-hand!");
/* 49 */       player.getInventory().setItemInOffHand(new ItemStack(Material.AIR));
/* 50 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm6 });
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\nikor\Downloads\Bambo-Plugin.jar!\bamboplugin\bamboplugin\glasshelms\offhand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */