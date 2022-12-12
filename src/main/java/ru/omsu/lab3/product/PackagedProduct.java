package ru.omsu.lab3.product;

abstract public class PackagedProduct extends Product {
    protected ProductPackaging productPackaging;

    public PackagedProduct(String name, String description, ProductPackaging productPackaging) {
        super(name, description);
        this.productPackaging = productPackaging;
    }

    public ProductPackaging getProductPackaging() {
        return productPackaging;
    }

    abstract public double getNetWeight();

    abstract public double getGrossWeight();
}
