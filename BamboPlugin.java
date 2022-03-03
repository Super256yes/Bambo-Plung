/*    */ package bamboplugin.bamboplugin;
/*    */ import bamboplugin.bamboplugin.betterbows.correctDetection;
/*    */ import bamboplugin.bamboplugin.betterbows.tripleShot;
/*    */ import bamboplugin.bamboplugin.glasshelms.Item;
/*    */ import bamboplugin.bamboplugin.glasshelms.changeglasshelm;
/*    */ import bamboplugin.bamboplugin.glasshelms.getItems;
/*    */ import bamboplugin.bamboplugin.glasshelms.glasshelm;
/*    */ import bamboplugin.bamboplugin.glasshelms.offhand;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.plugin.Plugin;
/*    */ 
/*    */ public final class BamboPlugin extends JavaPlugin {
/*    */   public void onEnable() {
/* 15 */     System.out.println("Enabling Plugin Modules");
/* 16 */     getItems commands = new getItems();
/* 17 */     Item.init();
/* 18 */     getServer().getPluginManager().registerEvents((Listener)new EdibleBamboo(), (Plugin)this);
/* 19 */     getServer().getPluginManager().registerEvents((Listener)new BetterBows(), (Plugin)this);
/* 20 */     getServer().getPluginManager().registerEvents((Listener)new glasshelm(), (Plugin)this);
/* 21 */     getServer().getPluginManager().registerEvents((Listener)new tripleShot(), (Plugin)this);
/* 22 */     getServer().getPluginManager().registerEvents((Listener)new offhand(), (Plugin)this);
/* 23 */     getServer().getPluginManager().registerEvents((Listener)new blockplacement(), (Plugin)this);
/* 24 */     getServer().getPluginManager().registerEvents((Listener)new changeglasshelm(), (Plugin)this);
/* 25 */     getServer().getPluginManager().registerEvents((Listener)new correctDetection(), (Plugin)this);
/* 26 */     getCommand("glasshelm").setExecutor((CommandExecutor)new getItems());
/* 27 */     getCommand("give_all_glasshelms").setExecutor((CommandExecutor)new getItems_all());
/* 28 */     System.out.println("Plugin Modules have been Successfully Enabled!");
/*    */   }
/*    */   
/*    */   public void onDisable() {}
/*    */ }


/* Location:              C:\Users\nikor\Downloads\Bambo-Plugin.jar!\bamboplugin\bamboplugin\BamboPlugin.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */