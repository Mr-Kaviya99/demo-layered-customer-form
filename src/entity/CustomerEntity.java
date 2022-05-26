package entity;

public class CustomerEntity implements SuperEntity{
    private String customer_ID;
    private String customer_Name;
    private String customer_Address;
    private String customer_Contact;
    private String customer_NIC;

    public CustomerEntity(String customer_ID, String customer_Name, String customer_Address, String customer_Contact, String customer_NIC) {
        this.customer_ID = customer_ID;
        this.customer_Name = customer_Name;
        this.customer_Address = customer_Address;
        this.customer_Contact = customer_Contact;
        this.customer_NIC = customer_NIC;
    }

    public CustomerEntity() {
    }

    public String getCustomer_ID() {
        return customer_ID;
    }

    public void setCustomer_ID(String customer_ID) {
        this.customer_ID = customer_ID;
    }

    public String getCustomer_Name() {
        return customer_Name;
    }

    public void setCustomer_Name(String customer_Name) {
        this.customer_Name = customer_Name;
    }

    public String getCustomer_Address() {
        return customer_Address;
    }

    public void setCustomer_Address(String customer_Address) {
        this.customer_Address = customer_Address;
    }

    public String getCustomer_Contact() {
        return customer_Contact;
    }

    public void setCustomer_Contact(String customer_Contact) {
        this.customer_Contact = customer_Contact;
    }

    public String getCustomer_NIC() {
        return customer_NIC;
    }

    public void setCustomer_NIC(String customer_NIC) {
        this.customer_NIC = customer_NIC;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" +
                "customer_ID='" + customer_ID + '\'' +
                ", customer_Name='" + customer_Name + '\'' +
                ", customer_Address='" + customer_Address + '\'' +
                ", customer_Contact='" + customer_Contact + '\'' +
                ", customer_NIC='" + customer_NIC + '\'' +
                '}';
    }
}
