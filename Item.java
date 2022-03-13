/*     */ package bamboplugin.bamboplugin;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.inventory.ItemStack;
/*     */ import org.bukkit.inventory.meta.ItemMeta;
/*     */ 
/*     */ public class Item {
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
/*  21 */     giveColorfulGlass();
/*  22 */     giveColorfulGlass1();
/*  23 */     giveColorfulGlass2();
/*  24 */     giveColorfulGlass3();
/*  25 */     giveColorfulGlass4();
/*  26 */     giveColorfulGlass5();
/*  27 */     giveColorfulGlass6();
/*  28 */     talkingben();
/*     */   }
/*     */   private static void giveColorfulGlass() {
/*  31 */     ItemStack item = new ItemStack(Material.BLUE_STAINED_GLASS, 1);
/*  32 */     ItemMeta meta = item.getItemMeta();
/*  33 */     meta.setDisplayName("§9Very Expensive Colorful Glass Helmet");
/*  34 */     List<String> lore = new ArrayList<>();
/*  35 */     lore.add("§7Why did you bother buying this?");
/*  36 */     lore.add("");
/*  37 */     lore.add("§6LEFT CLICK§f§7 this item §7to put this on your head!");
/*  38 */     lore.add("§6RIGHT CLICK§f§7 this item §7switch the color of the helmet!");
/*  39 */     meta.setLore(lore);
/*  40 */     item.setItemMeta(meta);
/*  41 */     glasshelm = item;
/*     */   }
/*     */   private static void giveColorfulGlass1() {
/*  44 */     ItemStack item = new ItemStack(Material.LIGHT_BLUE_STAINED_GLASS, 1);
/*  45 */     ItemMeta meta = item.getItemMeta();
/*  46 */     meta.setDisplayName("§bVery Expensive Colorful Glass Helmet");
/*  47 */     List<String> lore = new ArrayList<>();
/*  48 */     lore.add("§7Why did you bother buying this?");
/*  49 */     lore.add("");
/*  50 */     lore.add("§6LEFT CLICK§f§7 this item §7to put this on your head!");
/*  51 */     lore.add("§6RIGHT CLICK§f§7 this item §7switch the color of the helmet!");
/*  52 */     meta.setLore(lore);
/*  53 */     item.setItemMeta(meta);
/*  54 */     glasshelm1 = item;
/*     */   }
/*     */   private static void giveColorfulGlass2() {
/*  57 */     ItemStack item = new ItemStack(Material.YELLOW_STAINED_GLASS, 1);
/*  58 */     ItemMeta meta = item.getItemMeta();
/*  59 */     meta.setDisplayName("§eVery Expensive Colorful Glass Helmet");
/*  60 */     List<String> lore = new ArrayList<>();
/*  61 */     lore.add("§7Why did you bother buying this?");
/*  62 */     lore.add("");
/*  63 */     lore.add("§6LEFT CLICK§f§7 this item §7to put this on your head!");
/*  64 */     lore.add("§6RIGHT CLICK§f§7 this item §7switch the color of the helmet!");
/*  65 */     meta.setLore(lore);
/*  66 */     item.setItemMeta(meta);
/*  67 */     glasshelm2 = item;
/*     */   }
/*     */   private static void giveColorfulGlass3() {
/*  70 */     ItemStack item = new ItemStack(Material.LIME_STAINED_GLASS, 1);
/*  71 */     ItemMeta meta = item.getItemMeta();
/*  72 */     meta.setDisplayName("§aVery Expensive Colorful Glass Helmet");
/*  73 */     List<String> lore = new ArrayList<>();
/*  74 */     lore.add("§7Why did you bother buying this?");
/*  75 */     lore.add("");
/*  76 */     lore.add("§6LEFT CLICK§f§7 this item §7to put this on your head!");
/*  77 */     lore.add("§6RIGHT CLICK§f§7 this item §7switch the color of the helmet!");
/*  78 */     meta.setLore(lore);
/*  79 */     item.setItemMeta(meta);
/*  80 */     glasshelm3 = item;
/*     */   }
/*     */   private static void giveColorfulGlass4() {
/*  83 */     ItemStack item = new ItemStack(Material.PINK_STAINED_GLASS, 1);
/*  84 */     ItemMeta meta = item.getItemMeta();
/*  85 */     meta.setDisplayName("§dVery Expensive Colorful Glass Helmet");
/*  86 */     List<String> lore = new ArrayList<>();
/*  87 */     lore.add("§7Why did you bother buying this?");
/*  88 */     lore.add("");
/*  89 */     lore.add("§6LEFT CLICK§f§7 this item §7to put this on your head!");
/*  90 */     lore.add("§6RIGHT CLICK§f§7 this item §7switch the color of the helmet!");
/*  91 */     meta.setLore(lore);
/*  92 */     item.setItemMeta(meta);
/*  93 */     glasshelm4 = item;
/*     */   }
/*     */   private static void giveColorfulGlass5() {
/*  96 */     ItemStack item = new ItemStack(Material.RED_STAINED_GLASS, 1);
/*  97 */     ItemMeta meta = item.getItemMeta();
/*  98 */     meta.setDisplayName("§cVery Expensive Colorful Glass Helmet");
/*  99 */     List<String> lore = new ArrayList<>();
/* 100 */     lore.add("§7Why did you bother buying this?");
/* 101 */     lore.add("");
/* 102 */     lore.add("§6LEFT CLICK§f§7 this item §7to put this on your head!");
/* 103 */     lore.add("§6RIGHT CLICK§f§7 this item §7switch the color of the helmet!");
/* 104 */     meta.setLore(lore);
/* 105 */     item.setItemMeta(meta);
/* 106 */     glasshelm5 = item;
/*     */   }
/*     */   private static void giveColorfulGlass6() {
/* 109 */     ItemStack item = new ItemStack(Material.ORANGE_STAINED_GLASS, 1);
/* 110 */     ItemMeta meta = item.getItemMeta();
/* 111 */     meta.setDisplayName("§6Very Expensive Colorful Glass Helmet");
/* 112 */     List<String> lore = new ArrayList<>();
/* 113 */     lore.add("§7Why did you bother buying this?");
/* 114 */     lore.add("");
/* 115 */     lore.add("§6LEFT CLICK§f§7 this item §7to put this on your head!");
/* 116 */     lore.add("§6RIGHT CLICK§f§7 this item §7switch the color of the helmet!");
/* 117 */     meta.setLore(lore);
/* 118 */     item.setItemMeta(meta);
/* 119 */     glasshelm6 = item;
/*     */   }
/*     */   private static void talkingben() {
/* 122 */     ItemStack item = new ItemStack(Material.PUFFERFISH);
/* 123 */     ItemMeta meta = item.getItemMeta();
/* 124 */     meta.setDisplayName("§6Talking Ben");
/* 125 */     List<String> lore = new ArrayList<>();
/* 126 */     lore.add("§7Why did you bother buying this?");
/* 127 */     lore.add("");
/* 128 */     lore.add("§6LEFT CLICK§f§7 this item §7to call talking ben!");
/* 129 */     meta.setLore(lore);
/* 130 */     item.setItemMeta(meta);
/* 131 */     Talkingben = item;
/*     */   }
/*     */ }


/* Location:              C:\Users\nikor\Downloads\Bambo-Plugin.jar!\bamboplugin\bamboplugin\Item.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */