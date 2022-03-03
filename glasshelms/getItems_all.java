/*    */ package bamboplugin.bamboplugin.glasshelms;
/*    */ 
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
/* 13 */     if (!(sender instanceof Player)) {
/* 14 */       return true;
/*    */     }
/*    */     
/* 17 */     Player player = (Player)sender;
/* 18 */     if (command.getName().equalsIgnoreCase("give_all_glasshelms")) {
/* 19 */       if (player.isOp()) {
/* 20 */         sender.sendMessage(ChatColor.GREEN + "Gave items to the player!");
/* 21 */         player.getInventory().addItem(new ItemStack[] { Item.glasshelm });
/* 22 */         player.getInventory().addItem(new ItemStack[] { Item.glasshelm1 });
/* 23 */         player.getInventory().addItem(new ItemStack[] { Item.glasshelm2 });
/* 24 */         player.getInventory().addItem(new ItemStack[] { Item.glasshelm3 });
/* 25 */         player.getInventory().addItem(new ItemStack[] { Item.glasshelm4 });
/* 26 */         player.getInventory().addItem(new ItemStack[] { Item.glasshelm5 });
/* 27 */         player.getInventory().addItem(new ItemStack[] { Item.glasshelm6 });
/*    */       } else {
/* 29 */         sender.sendMessage(ChatColor.RED + "Only operators can use this command!");
/*    */       } 
/*    */     }
/* 32 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\nikor\Downloads\Bambo-Plugin.jar!\bamboplugin\bamboplugin\glasshelms\getItems_all.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */