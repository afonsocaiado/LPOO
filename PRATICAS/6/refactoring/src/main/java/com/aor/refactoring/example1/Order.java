package com.aor.refactoring.example1;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderLine> lines;

    public Order() {
        lines = new ArrayList<>();
    }

    public void add(Product product, int quantity) {
        lines.add(new OrderLine(product, quantity));
    }

    public boolean isElegibleForFreeDelivery() {
        return calculateOrderPrice() > 100;
    }

    public String printOrder() {
        double total = 0;
        StringBuffer printBuffer = new StringBuffer();

        for (OrderLine line : lines) {
            total += line.Total();
            printBuffer.append(line.printOrderLine());
        }

        printBuffer.append("Total: " + total);

        return printBuffer.toString();
    }

    private double calculateOrderPrice() {
        return lines.stream().mapToDouble(OrderLine::Total).sum();
    }
}