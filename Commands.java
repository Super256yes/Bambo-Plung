/*    */ package bamboplugin.bamboplugin;
/*    */ 
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ 
/*    */ public class Commands
/*    */   implements CommandExecutor
/*    */ {
/*    */   public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
/* 14 */     if (!(sender instanceof Player)) {
/* 15 */       return true;
/*    */     }
/*    */     
/* 18 */     Player player = (Player)sender;
/* 19 */     if (command.getName().equalsIgnoreCase("glasshelm")) {
/* 20 */       if (player.isOp()) {
/* 21 */         sender.sendMessage(ChatColor.GREEN + "Gave item to the player!");
/* 22 */         player.getInventory().addItem(new ItemStack[] { Item.glasshelm });
/*    */       } else {
/* 24 */         sender.sendMessage(ChatColor.RED + "Only operators can use this command!");
/*    */       } 
/*    */     }
/* 27 */     if (command.getName().equalsIgnoreCase("ben")) {
/* 28 */       if (player.isOp()) {
/* 29 */         sender.sendMessage(ChatColor.GREEN + "Gave item to the player!");
/* 30 */         player.getInventory().addItem(new ItemStack[] { Item.Talkingben });
/*    */       } else {
/*    */         
/* 33 */         sender.sendMessage(ChatColor.RED + "Only operators can use this command!");
/*    */       } 
/*    */     }
/* 36 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\nikor\Downloads\Bambo-Plugin.jar!\bamboplugin\bamboplugin\Commands.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */