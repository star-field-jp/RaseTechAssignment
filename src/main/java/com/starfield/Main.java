package com.starfield;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


class Main {
public static void main(String[] args) {
    List<Product> prdList = new ArrayList<>();
    prdList.add(new Product("1", "iPhone X","iPhone",BigDecimal.valueOf(120000),2));
    prdList.add(new Product("2", "iPhone 8 Plus","iPhone", BigDecimal.valueOf(110000),3));
    prdList.add(new Product("3", "iPhone 8","iPhone",BigDecimal.valueOf(100000),1));
    prdList.add(new Product("4", "Galaxy S9","Android",BigDecimal.valueOf(100000),4));
    prdList.add(new Product("5", "Galaxy S9 plus","Android",BigDecimal.valueOf(110000),3));
    prdList.add(new Product("6", "Windows phone","Others",BigDecimal.valueOf(80000),1));
    prdList.add(new Product("7", "Windows phone","Others",BigDecimal.valueOf(85000),2));

    // 複合キーを作成
    Function<Product, String> compositeKey = prd -> {
        StringBuffer sb = new StringBuffer();
        sb.append(prd.getProductType()).append("-").append(prd.getProductName());
        return sb.toString();
    };

    // 複合キーでグルーピング
    Map<String, List<Product>> grpByComplexKeys = prdList.stream().collect(
            Collectors.groupingBy(compositeKey));
    System.out.println(grpByComplexKeys);

    // BigDeciamlの合計
    Map<Object, BigDecimal> grpByTypeSum = prdList.stream().collect(
            Collectors.groupingBy(Product::getProductType,
                    Collectors.reducing(BigDecimal.ZERO, Product::getPrice, BigDecimal::add)));
    System.out.println(grpByTypeSum);

}

}