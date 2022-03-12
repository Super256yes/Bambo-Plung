/*    */ package bamboplugin.bamboplugin.glasshelms;
/*    */ 
/*    */ import bamboplugin.bamboplugin.Item;
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
/* 16 */     Player player = event.getPlayer();
/*    */     
/* 18 */     if (player.getInventory().getItemInOffHand().equals(Item.glasshelm)) {
/* 19 */       player.sendMessage(ChatColor.RED + "You can not put that item in your off-hand!");
/* 20 */       player.getInventory().setItemInOffHand(new ItemStack(Material.AIR));
/* 21 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm });
/*    */     } 
/* 23 */     if (player.getInventory().getItemInOffHand().equals(Item.glasshelm1)) {
/* 24 */       player.sendMessage(ChatColor.RED + "You can not put that item in your off-hand!");
/* 25 */       player.getInventory().setItemInOffHand(new ItemStack(Material.AIR));
/* 26 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm1 });
/*    */     } 
/* 28 */     if (player.getInventory().getItemInOffHand().equals(Item.glasshelm2)) {
/* 29 */       player.sendMessage(ChatColor.RED + "You can not put that item in your off-hand!");
/* 30 */       player.getInventory().setItemInOffHand(new ItemStack(Material.AIR));
/* 31 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm2 });
/*    */     } 
/* 33 */     if (player.getInventory().getItemInOffHand().equals(Item.glasshelm3)) {
/* 34 */       player.sendMessage(ChatColor.RED + "You can not put that item in your off-hand!");
/* 35 */       player.getInventory().setItemInOffHand(new ItemStack(Material.AIR));
/* 36 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm3 });
/*    */     } 
/* 38 */     if (player.getInventory().getItemInOffHand().equals(Item.glasshelm4)) {
/* 39 */       player.sendMessage(ChatColor.RED + "You can not put that item in your off-hand!");
/* 40 */       player.getInventory().setItemInOffHand(new ItemStack(Material.AIR));
/* 41 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm4 });
/*    */     } 
/* 43 */     if (player.getInventory().getItemInOffHand().equals(Item.glasshelm5)) {
/* 44 */       player.sendMessage(ChatColor.RED + "You can not put that item in your off-hand!");
/* 45 */       player.getInventory().setItemInOffHand(new ItemStack(Material.AIR));
/* 46 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm5 });
/*    */     } 
/* 48 */     if (player.getInventory().getItemInOffHand().equals(Item.glasshelm6)) {
/* 49 */       player.sendMessage(ChatColor.RED + "You can not put that item in your off-hand!");
/* 50 */       player.getInventory().setItemInOffHand(new ItemStack(Material.AIR));
/* 51 */       player.getInventory().addItem(new ItemStack[] { Item.glasshelm6 });
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\nikor\Downloads\Bambo-Plugin.jar!\bamboplugin\bamboplugin\glasshelms\offhand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */