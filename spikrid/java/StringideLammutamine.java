package spikrid.java;

public class StringideLammutamine {
       
// <ORDER_ID>#<CUSTOMER_NAME>#<PRODUCT_CODE>#<QUANTITY>#<STATUS>
    // 0: order-id
    // 1: customer-name
    // 2: product-code
    // 3: quantity
    // 4: status
    
    //helper 
    public static String osa(String logLine, int osaNr) {
    int start = 0; //eeldame, et v2li algab stringi algusest
    for (int i = 0; i < osaNr; i++) {
        start = logLine.indexOf("#", start) + 1;
    }
    int end = logLine.indexOf("#", start);

    if (end == -1) {
        return logLine.substring(start);
    } 

    return logLine.substring(start, end);
    }
 

    public static String orderId(String logLine) { 
        return osa(logLine, 0);
    }

    public static String customer(String logLine) { 
        return osa(logLine, 1).toLowerCase();
    }

    public static String product(String logLine) { 
        return osa(logLine, 2).toLowerCase().replace('_', ' ');
    }

    public static int quantity(String logLine) { 
        String kogus = osa(logLine, 3);
        return Integer.parseInt(kogus);
    }

    public static boolean isShipped(String logLine) { 
        String status = osa(logLine, 4);
        return status.equals("SHIPPED");
    }

    public static String reformat(String logLine) { 
        String customer = customer(logLine);
        int quantity = quantity(logLine);
        String product = product(logLine);
        String id = orderId(logLine);
        String status = osa(logLine, 4).toLowerCase();

        return "Customer " + customer + " ordered " + quantity + " x " + product + " (order " + id + ") → " + status; 


    }

}
