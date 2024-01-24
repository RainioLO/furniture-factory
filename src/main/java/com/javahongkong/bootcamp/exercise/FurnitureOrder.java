package com.javahongkong.bootcamp.exercise;

import java.util.HashMap;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    HashMap<Furniture, Integer> ordersOfFurnitures;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        // TODO: Complete the constructor
        this.ordersOfFurnitures = new HashMap<>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
        if (!this.ordersOfFurnitures.containsKey(type)) {
            this.ordersOfFurnitures.put(type, furnitureCount);
        } else {
            this.ordersOfFurnitures.replace(type, ordersOfFurnitures.get(type),
                    (ordersOfFurnitures.get(type) + furnitureCount));
        }

    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        return this.ordersOfFurnitures.isEmpty() ? null
                : this.ordersOfFurnitures;

    }

    public float getTotalOrderCost() {
        // TODO: Complete the method
        float cost = 0;
        for (HashMap.Entry<Furniture, Integer> entry : this.ordersOfFurnitures
                .entrySet()) {
            cost += entry.getKey().cost() * entry.getValue();
        }
        return cost;
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
        return this.ordersOfFurnitures.getOrDefault(type, 0);
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        return this.ordersOfFurnitures.getOrDefault(type, 0) * type.cost();
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
        int quantity = 0;
        for (HashMap.Entry<Furniture, Integer> entry : this.ordersOfFurnitures
                .entrySet()) {
            quantity += entry.getValue();
        }
        return quantity;
    }
}
