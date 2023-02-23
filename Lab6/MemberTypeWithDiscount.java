package Lab6;

public enum MemberTypeWithDiscount {
    None(0, 0), SILVER(0.5, 0.5), GOLD(1.0, 2.0), PREMIUM(3.0, 4.5);

    private double productDiscountRate;
    private double serviceDiscountRate;

    MemberTypeWithDiscount(final double productDiscountRate, final double serviceDiscountRate) {
        this.productDiscountRate = productDiscountRate;
        this.serviceDiscountRate = serviceDiscountRate;
    }

    public double getProductDiscount() {
        return productDiscountRate;
    }

    public double getServiceDiscount() {
        return serviceDiscountRate;
    }

}
