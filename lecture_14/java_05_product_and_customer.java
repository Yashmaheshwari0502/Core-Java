
// // 1. Product

// class Product {
//     private int itemNo;
//     private String name;
//     private double price;
//     private int qty;

//     public int getItemNo() {
//         return itemNo;
//     }

//     public String getName() {
//         return name;
//     }

//     public double getPrice() {
//         return price;
//     }

//     public int getQty() {
//         return qty;
//     }

//     public void setItemNo(int itemNo) {
//         this.itemNo = itemNo;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public void setPrice(double price) {
//         this.price = price;
//     }

//     public void setQty(int qty) {
//         this.qty = qty;
//     }

//     public Product(int itemNo, String name, double price, int qty) {
//         this.itemNo = itemNo;
//         this.name = name;
//         this.price = price;
//         this.qty = qty;
//     }

// }

// public class java_05_product_and_customer {
// public static void main(String[] args) {
//     Product p1=new Product(1,"Apple", 30, 1);
//     System.out.println("The product is: "+p1.getName());
// }

// }

// 2.Customer

class Customer {
    private int custId;
    private String name;
    private String address;
    private int phoneno;

    public int getCusId() {
        return custId;
    }

    public String getName() {
        return name;

    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNo() {
        return phoneno;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setphoneno(int phoneno) {
        this.phoneno = phoneno;
    }

    public Customer(int custId, String name, String address, int phoneno) {
        this.custId = custId;
        this.address = address;
        this.name = name;
        this.phoneno = phoneno;
    }
}

public class java_05_product_and_customer {

    public static void main(String[] args) {
        Customer c1 = new Customer(10, "yash", "vaishali", 96507005);
        System.out.println("The address is: "+c1.getAddress());
    }
}