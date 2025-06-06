//import java.util.ArrayList;


public class SalesCalculusWithTax {
    public void main(String[] args) {
        double [] sales = {60,800,300,70,45};
        
        double salesWithTax=0;


        for (double individualSale : sales) {
            salesWithTax+= individualSale *1.16;
        }

        System.out.printf("Total de ventas con IVA: $%.2f%n", salesWithTax);
    }
}



