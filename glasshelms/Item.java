/*     */ package bamboplugin.bamboplugin.glasshelms;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.inventory.ItemStack;
/*     */ import org.bukkit.inventory.meta.ItemMeta;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Item
/*     */ {
/*     */   public static ItemStack glasshelm;
/*     */   public static ItemStack glasshelm1;
/*     */   public static ItemStack glasshelm2;
/*     */   public static ItemStack glasshelm3;
/*     */   public static ItemStack glasshelm4;
/*     */   public static ItemStack glasshelm5;
/*     */   public static ItemStack glasshelm6;
/*     */   public static ItemStack air;
/*     */   
/*     */   public static void init() {
/*  27 */     giveColorfulGlass();
/*  28 */     giveColorfulGlass1();
/*  29 */     giveColorfulGlass2();
/*  30 */     giveColorfulGlass3();
/*  31 */     giveColorfulGlass4();
/*  32 */     giveColorfulGlass5();
/*  33 */     giveColorfulGlass6();
/*  34 */     air();
/*     */   }
/*     */   
/*     */   private static void giveColorfulGlass() {
/*  38 */     ItemStack item = new ItemStack(Material.BLUE_STAINED_GLASS, 1);
/*  39 */     ItemMeta meta = item.getItemMeta();
/*  40 */     meta.setDisplayName("§9Very Expensive Colorful Glass Helmet");
/*  41 */     List<String> lore = new ArrayList<>();
/*  42 */     lore.add("§7Why did you bother buying this?");
/*  43 */     lore.add("");
/*  44 */     lore.add("§6LEFT CLICK§f§7 this item §7to put this on your head!");
/*  45 */     lore.add("§6RIGHT CLICK§f§7 this item §7switch the color of the helmet!");
/*  46 */     meta.setLore(lore);
/*  47 */     item.setItemMeta(meta);
/*  48 */     glasshelm = item;
/*     */   }
/*     */   private static void giveColorfulGlass1() {
/*  51 */     ItemStack item = new ItemStack(Material.LIGHT_BLUE_STAINED_GLASS, 1);
/*  52 */     ItemMeta meta = item.getItemMeta();
/*  53 */     meta.setDisplayName("§bVery Expensive Colorful Glass Helmet");
/*  54 */     List<String> lore = new ArrayList<>();
/*  55 */     lore.add("§7Why did you bother buying this?");
/*  56 */     lore.add("");
/*  57 */     lore.add("§6LEFT CLICK§f§7 this item §7to put this on your head!");
/*  58 */     lore.add("§6RIGHT CLICK§f§7 this item §7switch the color of the helmet!");
/*  59 */     meta.setLore(lore);
/*  60 */     item.setItemMeta(meta);
/*  61 */     glasshelm1 = item;
/*     */   }
/*     */   private static void giveColorfulGlass2() {
/*  64 */     ItemStack item = new ItemStack(Material.YELLOW_STAINED_GLASS, 1);
/*  65 */     ItemMeta meta = item.getItemMeta();
/*  66 */     meta.setDisplayName("§eVery Expensive Colorful Glass Helmet");
/*  67 */     List<String> lore = new ArrayList<>();
/*  68 */     lore.add("§7Why did you bother buying this?");
/*  69 */     lore.add("");
/*  70 */     lore.add("§6LEFT CLICK§f§7 this item §7to put this on your head!");
/*  71 */     lore.add("§6RIGHT CLICK§f§7 this item §7switch the color of the helmet!");
/*  72 */     meta.setLore(lore);
/*  73 */     item.setItemMeta(meta);
/*  74 */     glasshelm2 = item;
/*     */   }
/*     */   private static void giveColorfulGlass3() {
/*  77 */     ItemStack item = new ItemStack(Material.LIME_STAINED_GLASS, 1);
/*  78 */     ItemMeta meta = item.getItemMeta();
/*  79 */     meta.setDisplayName("§aVery Expensive Colorful Glass Helmet");
/*  80 */     List<String> lore = new ArrayList<>();
/*  81 */     lore.add("§7Why did you bother buying this?");
/*  82 */     lore.add("");
/*  83 */     lore.add("§6LEFT CLICK§f§7 this item §7to put this on your head!");
/*  84 */     lore.add("§6RIGHT CLICK§f§7 this item §7switch the color of the helmet!");
/*  85 */     meta.setLore(lore);
/*  86 */     item.setItemMeta(meta);
/*  87 */     glasshelm3 = item;
/*     */   }
/*     */   private static void giveColorfulGlass4() {
/*  90 */     ItemStack item = new ItemStack(Material.PINK_STAINED_GLASS, 1);
/*  91 */     ItemMeta meta = item.getItemMeta();
/*  92 */     meta.setDisplayName("§dVery Expensive Colorful Glass Helmet");
/*  93 */     List<String> lore = new ArrayList<>();
/*  94 */     lore.add("§7Why did you bother buying this?");
/*  95 */     lore.add("");
/*  96 */     lore.add("§6LEFT CLICK§f§7 this item §7to put this on your head!");
/*  97 */     lore.add("§6RIGHT CLICK§f§7 this item §7switch the color of the helmet!");
/*  98 */     meta.setLore(lore);
/*  99 */     item.setItemMeta(meta);
/* 100 */     glasshelm4 = item;
/*     */   }
/*     */   private static void giveColorfulGlass5() {
/* 103 */     ItemStack item = new ItemStack(Material.RED_STAINED_GLASS, 1);
/* 104 */     ItemMeta meta = item.getItemMeta();
/* 105 */     meta.setDisplayName("§cVery Expensive Colorful Glass Helmet");
/* 106 */     List<String> lore = new ArrayList<>();
/* 107 */     lore.add("§7Why did you bother buying this?");
/* 108 */     lore.add("");
/* 109 */     lore.add("§6LEFT CLICK§f§7 this item §7to put this on your head!");
/* 110 */     lore.add("§6RIGHT CLICK§f§7 this item §7switch the color of the helmet!");
/* 111 */     meta.setLore(lore);
/* 112 */     item.setItemMeta(meta);
/* 113 */     glasshelm5 = item;
/*     */   }
/*     */   private static void giveColorfulGlass6() {
/* 116 */     ItemStack item = new ItemStack(Material.ORANGE_STAINED_GLASS, 1);
/* 117 */     ItemMeta meta = item.getItemMeta();
/* 118 */     meta.setDisplayName("§6Very Expensive Colorful Glass Helmet");
/* 119 */     List<String> lore = new ArrayList<>();
/* 120 */     lore.add("§7Why did you bother buying this?");
/* 121 */     lore.add("");
/* 122 */     lore.add("§6LEFT CLICK§f§7 this item §7to put this on your head!");
/* 123 */     lore.add("§6RIGHT CLICK§f§7 this item §7switch the color of the helmet!");
/* 124 */     meta.setLore(lore);
/* 125 */     item.setItemMeta(meta);
/* 126 */     glasshelm6 = item;
/*     */   }
/*     */   private static void air() {
/* 129 */     ItemStack item = new ItemStack(Material.AIR);
/* 130 */     air = item;
/*     */   }
/*     */ }


/* Location:              C:\Users\nikor\Downloads\Bambo-Plugin.jar!\bamboplugin\bamboplugin\glasshelms\Item.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */