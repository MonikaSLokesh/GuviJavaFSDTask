package com.task3.taxinterface;
import java.util.Scanner;

// Interface Taxable
interface Taxable {
    double salesTax = 0.07;   // 7%
    double incomeTax = 0.105; // 10.5%

    double calcTax();
}



