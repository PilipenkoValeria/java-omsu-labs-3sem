package ru.omsu.lab3.product;

import static ru.omsu.lab3.product.Utils.getProductWeight;

public class PackagedProductSet extends PackagedProduct {
    private final PackagedProduct[] products;

    public PackagedProductSet(String name, String description, ProductPackaging productPackaging, PackagedProduct... products) {
        super(name, description, productPackaging);
        this.products = products;
    }

    public PackagedProduct[] getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return String.format("Набор товаров в упаковке %s", productPackaging.getName());
    }


    public double getNetWeight() {
        return getProductWeight(getProducts());
    }

    public double getGrossWeight() {
        return getProductWeight(getProducts()) + productPackaging.getWeight();
    }
}
