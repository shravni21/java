import java.util.Date;
import java.util.List;

public class CustomerTransaction implements Accounting, Reporting {

    private List<product>products;

    private customer c;
    public CustomerTransaction(customer c,List<product>products){
        this.c=c;
        this.products=products;
    }
    @Override
    public String getName(){
        return c.getName();
    }
    @Override
    public Date getDate(){
        return new Date();
    }
    @Override
    public String productBreakdown(){
        String reportListing = null;
        for(product p: products){
            reportListing+=p.getProductName();
        }
        return reportListing;
    }
    @Override
    public void prepareInvoice(){
        System.out.println("Invoice prepared.");
    }
    @Override
    public void  chargeCustomer(){
        System.out.println("Charged the customer.");
    }
}
