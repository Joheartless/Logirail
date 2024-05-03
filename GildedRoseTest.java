package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;

class GildedRoseTest {
private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
private static final String STANDARD = "Standard product";

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }
    
    @Test
    @DisplayName("Sulfuras calidad 80")
    void Sulfuras80() {
        Item[] items = new Item[] { new Item(SULFURAS, 22, 80) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
      /*  assertEquals("Aged Brie", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);*/
     
        assertNotNull(items);
        assertAll("Propiedades",
        		
        		() -> assertEquals(SULFURAS, app.items[0].name, "name"),
        		() -> assertEquals(22, app.items[0].sellIn,"Sellin"),
        		() -> assertEquals(80, app.items[0].quality, "Quality")
        		);
        
        
        
    }
    
    @Test
    @DisplayName("Sulfuras error 79")
    void SulfurasError() {
        Item[] items = new Item[] { new Item(SULFURAS, 22, 79) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
      /*  assertEquals("Aged Brie", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);*/
     
        assertNotNull(items);
        assertAll("Propiedades",
        		
        		() -> assertEquals(SULFURAS, app.items[0].name, "name"),
        		() -> assertEquals(22, app.items[0].sellIn,"Sellin"),
        		() -> assertEquals(80, app.items[0].quality, "Quality")
        		);
        
        
        
    }
    
    @Test
    @DisplayName("Caso de prueba 1")
    void CP1() {
        Item[] items = new Item[] { new Item("name1", 2, 1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
     
        assertNotNull(items);
        assertAll("Propiedades",
        		
        		() -> assertEquals("name1", app.items[0].name, "name"),
        		() -> assertEquals(1, app.items[0].sellIn,"Sellin"),
        		() -> assertEquals(0, app.items[0].quality, "Quality")
        		);
        
        
        
    }
    
    
    @Test
    @DisplayName("Caso de prueba 2")
    void CP2() {
        Item[] items = new Item[] { new Item("name2", 0, 3) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
     
        assertNotNull(items);
        assertAll("Propiedades",
        		
        		() -> assertEquals("name2", app.items[0].name, "name"),
        		() -> assertEquals(-1, app.items[0].sellIn,"Sellin"),
        		() -> assertEquals(2, app.items[0].quality, "Quality")
        		);    
    }
    
    
    @Test
    @DisplayName("Caso de prueba 3")
    void CP3() {
        Item[] items = new Item[] { new Item("name3", -1, 1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
     
        assertNotNull(items);
        assertAll("Propiedades",
        		
        		() -> assertEquals("name3", app.items[0].name, "name"),
        		() -> assertEquals(-2, app.items[0].sellIn,"Sellin"),
        		() -> assertEquals(0, app.items[0].quality, "Quality")
        		);    
    }
    
    @Test
    @DisplayName("Caso de prueba 4")
    void CP4() {

        Item[] items = new Item[] { new Item("name4", -2, 3) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
     
        assertNotNull(items);
        assertAll("Propiedades",
        		
        		() -> assertEquals("name4", app.items[0].name, "name"),
        		() -> assertEquals(-3, app.items[0].sellIn,"Sellin"),
        		() -> assertEquals(1, app.items[0].quality, "Quality")
        		);    
    }
 
    @Test
    @DisplayName("Queso Brie, dias disponibles y max 50")
    void CPBrie() {
        Item[] items = new Item[] { new Item("Aged Brie", 7, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
     
        assertNotNull(items);
        assertAll("Propiedades",
        		
        		() -> assertEquals("Aged Brie", app.items[0].name, "name"),
        		() -> assertEquals(6, app.items[0].sellIn,"Sellin"),
        		() -> assertEquals(50, app.items[0].quality, "Quality")
        		);    
    }
    
    
    
    
    
    
    
    
    /* 
    @Test
    @DisplayName("Estandar")
    void Standard() {
        Item[] items = new Item[] { new Item(STANDARD, 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
     
        assertNotNull(items);
        assertAll("Propiedades",
        		
        		() -> assertEquals(STANDARD, app.items[0].name, "name"),
        		() -> assertEquals(0, app.items[0].sellIn,"Sellin"),
        		() -> assertEquals(0, app.items[0].quality, "Quality")
        		);
        
        
        
    }
    
    
  /*  @Test
    void sulfura() {
        Item[] items = new Item[] { new Item("sulfuras", 0, 80) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras", app.items[0].name);
    }*/

}
