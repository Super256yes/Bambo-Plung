/*     */ package bamboplugin.bamboplugin;
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
/*     */   public static ItemStack Talkingben;
/*     */   
/*     */   public static void init() {
/*  28 */     giveColorfulGlass();
/*  29 */     giveColorfulGlass1();
/*  30 */     giveColorfulGlass2();
/*  31 */     giveColorfulGlass3();
/*  32 */     giveColorfulGlass4();
/*  33 */     giveColorfulGlass5();
/*  34 */     giveColorfulGlass6();
/*  35 */     talkingben();
/*  36 */     air();
/*     */   }
/*     */ 
/*     */   
/*     */   private static void giveColorfulGlass() {
/*  41 */     ItemStack item = new ItemStack(Material.BLUE_STAINED_GLASS, 1);
/*  42 */     ItemMeta meta = item.getItemMeta();
/*  43 */     meta.setDisplayName("§9Very Expensive Colorful Glass Helmet");
/*  44 */     List<String> lore = new ArrayList<>();
/*  45 */     lore.add("§7Why did you bother buying this?");
/*  46 */     lore.add("");
/*  47 */     lore.add("§6LEFT CLICK§f§7 this item §7to put this on your head!");
/*  48 */     lore.add("§6RIGHT CLICK§f§7 this item §7switch the color of the helmet!");
/*  49 */     meta.setLore(lore);
/*  50 */     item.setItemMeta(meta);
/*  51 */     glasshelm = item;
/*     */   }
/*     */   private static void giveColorfulGlass1() {
/*  54 */     ItemStack item = new ItemStack(Material.LIGHT_BLUE_STAINED_GLASS, 1);
/*  55 */     ItemMeta meta = item.getItemMeta();
/*  56 */     meta.setDisplayName("§bVery Expensive Colorful Glass Helmet");
/*  57 */     List<String> lore = new ArrayList<>();
/*  58 */     lore.add("§7Why did you bother buying this?");
/*  59 */     lore.add("");
/*  60 */     lore.add("§6LEFT CLICK§f§7 this item §7to put this on your head!");
/*  61 */     lore.add("§6RIGHT CLICK§f§7 this item §7switch the color of the helmet!");
/*  62 */     meta.setLore(lore);
/*  63 */     item.setItemMeta(meta);
/*  64 */     glasshelm1 = item;
/*     */   }
/*     */   private static void giveColorfulGlass2() {
/*  67 */     ItemStack item = new ItemStack(Material.YELLOW_STAINED_GLASS, 1);
/*  68 */     ItemMeta meta = item.getItemMeta();
/*  69 */     meta.setDisplayName("§eVery Expensive Colorful Glass Helmet");
/*  70 */     List<String> lore = new ArrayList<>();
/*  71 */     lore.add("§7Why did you bother buying this?");
/*  72 */     lore.add("");
/*  73 */     lore.add("§6LEFT CLICK§f§7 this item §7to put this on your head!");
/*  74 */     lore.add("§6RIGHT CLICK§f§7 this item §7switch the color of the helmet!");
/*  75 */     meta.setLore(lore);
/*  76 */     item.setItemMeta(meta);
/*  77 */     glasshelm2 = item;
/*     */   }
/*     */   private static void giveColorfulGlass3() {
/*  80 */     ItemStack item = new ItemStack(Material.LIME_STAINED_GLASS, 1);
/*  81 */     ItemMeta meta = item.getItemMeta();
/*  82 */     meta.setDisplayName("§aVery Expensive Colorful Glass Helmet");
/*  83 */     List<String> lore = new ArrayList<>();
/*  84 */     lore.add("§7Why did you bother buying this?");
/*  85 */     lore.add("");
/*  86 */     lore.add("§6LEFT CLICK§f§7 this item §7to put this on your head!");
/*  87 */     lore.add("§6RIGHT CLICK§f§7 this item §7switch the color of the helmet!");
/*  88 */     meta.setLore(lore);
/*  89 */     item.setItemMeta(meta);
/*  90 */     glasshelm3 = item;
/*     */   }
/*     */   private static void giveColorfulGlass4() {
/*  93 */     ItemStack item = new ItemStack(Material.PINK_STAINED_GLASS, 1);
/*  94 */     ItemMeta meta = item.getItemMeta();
/*  95 */     meta.setDisplayName("§dVery Expensive Colorful Glass Helmet");
/*  96 */     List<String> lore = new ArrayList<>();
/*  97 */     lore.add("§7Why did you bother buying this?");
/*  98 */     lore.add("");
/*  99 */     lore.add("§6LEFT CLICK§f§7 this item §7to put this on your head!");
/* 100 */     lore.add("§6RIGHT CLICK§f§7 this item §7switch the color of the helmet!");
/* 101 */     meta.setLore(lore);
/* 102 */     item.setItemMeta(meta);
/* 103 */     glasshelm4 = item;
/*     */   }
/*     */   private static void giveColorfulGlass5() {
/* 106 */     ItemStack item = new ItemStack(Material.RED_STAINED_GLASS, 1);
/* 107 */     ItemMeta meta = item.getItemMeta();
/* 108 */     meta.setDisplayName("§cVery Expensive Colorful Glass Helmet");
/* 109 */     List<String> lore = new ArrayList<>();
/* 110 */     lore.add("§7Why did you bother buying this?");
/* 111 */     lore.add("");
/* 112 */     lore.add("§6LEFT CLICK§f§7 this item §7to put this on your head!");
/* 113 */     lore.add("§6RIGHT CLICK§f§7 this item §7switch the color of the helmet!");
/* 114 */     meta.setLore(lore);
/* 115 */     item.setItemMeta(meta);
/* 116 */     glasshelm5 = item;
/*     */   }
/*     */   private static void giveColorfulGlass6() {
/* 119 */     ItemStack item = new ItemStack(Material.ORANGE_STAINED_GLASS, 1);
/* 120 */     ItemMeta meta = item.getItemMeta();
/* 121 */     meta.setDisplayName("§6Very Expensive Colorful Glass Helmet");
/* 122 */     List<String> lore = new ArrayList<>();
/* 123 */     lore.add("§7Why did you bother buying this?");
/* 124 */     lore.add("");
/* 125 */     lore.add("§6LEFT CLICK§f§7 this item §7to put this on your head!");
/* 126 */     lore.add("§6RIGHT CLICK§f§7 this item §7switch the color of the helmet!");
/* 127 */     meta.setLore(lore);
/* 128 */     item.setItemMeta(meta);
/* 129 */     glasshelm6 = item;
/*     */   }
/*     */   private static void air() {
/* 132 */     ItemStack item = new ItemStack(Material.AIR);
/* 133 */     air = item;
/*     */   }
/*     */   private static void talkingben() {
/* 136 */     ItemStack item = new ItemStack(Material.PUFFERFISH);
/* 137 */     ItemMeta meta = item.getItemMeta();
/* 138 */     meta.setDisplayName("§6Talking Ben");
/* 139 */     List<String> lore = new ArrayList<>();
/* 140 */     lore.add("§7Why did you bother buying this?");
/* 141 */     lore.add("");
/* 142 */     lore.add("§6LEFT CLICK§f§7 this item §7to call talking ben!");
/* 143 */     meta.setLore(lore);
/* 144 */     item.setItemMeta(meta);
/* 145 */     Talkingben = item;
/*     */   }
/*     */ }


/* Location:              C:\Users\nikor\Downloads\Bambo-Plugin.jar!\bamboplugin\bamboplugin\Item.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */