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
/*    */ public class getItems implements CommandExecutor {
/*    */   public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
/* 13 */     if (!(sender instanceof Player)) {
/* 14 */       return true;
/*    */     }
/*    */     
/* 17 */     Player player = (Player)sender;
/* 18 */     if (command.getName().equalsIgnoreCase("glasshelm")) {
/* 19 */       if (player.isOp()) {
/* 20 */         sender.sendMessage(ChatColor.GREEN + "Gave item to the player!");
/* 21 */         player.getInventory().addItem(new ItemStack[] { Item.glasshelm });
/*    */       } else {
/* 23 */         sender.sendMessage(ChatColor.RED + "Only operators can use this command!");
/*    */       } 
/*    */     }
/* 26 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\nikor\Downloads\Bambo-Plugin.jar!\bamboplugin\bamboplugin\glasshelms\getItems.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */