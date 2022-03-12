/*    */ package bamboplugin.bamboplugin.glasshelms;
/*    */ 
/*    */ import bamboplugin.bamboplugin.Item;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ 
/*    */ public class getItems_all
/*    */   implements CommandExecutor {
/*    */   public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
/* 14 */     if (!(sender instanceof Player)) {
/* 15 */       return true;
/*    */     }
/*    */     
/* 18 */     Player player = (Player)sender;
/* 19 */     if (command.getName().equalsIgnoreCase("give_all_glasshelms")) {
/* 20 */       if (player.isOp()) {
/* 21 */         sender.sendMessage(ChatColor.GREEN + "Gave items to the player!");
/* 22 */         player.getInventory().addItem(new ItemStack[] { Item.glasshelm });
/* 23 */         player.getInventory().addItem(new ItemStack[] { Item.glasshelm1 });
/* 24 */         player.getInventory().addItem(new ItemStack[] { Item.glasshelm2 });
/* 25 */         player.getInventory().addItem(new ItemStack[] { Item.glasshelm3 });
/* 26 */         player.getInventory().addItem(new ItemStack[] { Item.glasshelm4 });
/* 27 */         player.getInventory().addItem(new ItemStack[] { Item.glasshelm5 });
/* 28 */         player.getInventory().addItem(new ItemStack[] { Item.glasshelm6 });
/*    */       } else {
/* 30 */         sender.sendMessage(ChatColor.RED + "Only operators can use this command!");
/*    */       } 
/*    */     }
/* 33 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\nikor\Downloads\Bambo-Plugin.jar!\bamboplugin\bamboplugin\glasshelms\getItems_all.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */