package com.amido.stacks.workloads.menu.domain.utility;

import com.amido.stacks.workloads.menu.domain.Item;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ItemHelper {

  private ItemHelper() {
    // Utility class
  }

  public static Item createItem(int counter) {
    return new Item(
        UUID.randomUUID().toString(), counter + " New item", "New item Description", 12.1d, true);
  }

  public static List<Item> createItems(int count) {
    List<Item> itemList = new ArrayList<>();
    for (int i = 0; i < count; i++) {
      itemList.add(createItem(i));
    }
    return itemList;
  }
}
