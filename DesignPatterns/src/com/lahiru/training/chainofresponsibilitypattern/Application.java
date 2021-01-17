package com.lahiru.training.chainofresponsibilitypattern;

public class Application {

    // Discount = basicDiscount
    // standardDiscount = basicDiscount + standardDiscount
    // premiumDiscount = basicDiscount + standardDiscount + premiumDiscount
    // ultimateDiscount = basicDiscount + standardDiscount + premiumDiscount + ultimateDiscount

    public static void main(String[] args) {

        Discount discount = new Discount();
        BasicDiscount basicDiscount = new BasicDiscount();
        StandardDiscount standardDiscount = new StandardDiscount();
        PremiumDiscount premiumDiscount = new PremiumDiscount();
        UltimateDiscount ultimateDiscount = new UltimateDiscount();

        discount.setSuccessor(basicDiscount);
        basicDiscount.setSuccessor(standardDiscount);
        standardDiscount.setSuccessor(premiumDiscount);
        premiumDiscount.setSuccessor(ultimateDiscount);

        double finalValue;

        Invoice invoice = new Invoice(101, 900, "Basic");
        finalValue = invoice.getTotalAmount() - discount.applyDiscount(invoice);
        System.out.println("InvoiceId: " + invoice.getInvoiceId() + ", TotalAmount: " + invoice.getTotalAmount() + ", Discount: " + discount.applyDiscount(invoice) + ", FinalValue: " + finalValue);

        Invoice invoice1 = new Invoice(102, 1900, "Standard");
        finalValue = invoice1.getTotalAmount() - discount.applyDiscount(invoice1);
        System.out.println("InvoiceId: " + invoice1.getInvoiceId() + ", TotalAmount: " + invoice1.getTotalAmount() + ", Discount: " + discount.applyDiscount(invoice1) + ", FinalValue: " + finalValue);

        Invoice invoice2 = new Invoice(103, 2900, "Premium");
        finalValue = invoice2.getTotalAmount() - discount.applyDiscount(invoice2);
        System.out.println("InvoiceId: " + invoice2.getInvoiceId() + ", TotalAmount: " + invoice2.getTotalAmount() + ", Discount: " + discount.applyDiscount(invoice2) + ", FinalValue: " + finalValue);

        Invoice invoice3 = new Invoice(104, 3900, "Ultimate");
        finalValue = invoice3.getTotalAmount() - discount.applyDiscount(invoice3);
        System.out.println("InvoiceId: " + invoice3.getInvoiceId() + ", TotalAmount: " + invoice3.getTotalAmount() + ", Discount: " + discount.applyDiscount(invoice3) + ", FinalValue: " + finalValue);

    }

}
