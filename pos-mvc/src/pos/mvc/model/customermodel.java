/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.model;

/**
 *
 * @author Hirushi
 */
public class customermodel {
    private  String customerid;
    private  String customertitle;
    private  String customername;
    private  String customerdob;
    private  Double customersalary;
    private  String customeraddress;
    private  String customercity;
    private  String customerprovince;
    private  String custmerpostalcode;

    /**
     * @return the customerid
     */
    public String getCustomerid() {
        return customerid;
    }

    /**
     * @param customerid the customerid to set
     */
    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    /**
     * @return the customertitle
     */
    public String getCustomertitle() {
        return customertitle;
    }

    /**
     * @param customertitle the customertitle to set
     */
    public void setCustomertitle(String customertitle) {
        this.customertitle = customertitle;
    }

    /**
     * @return the customername
     */
    public String getCustomername() {
        return customername;
    }

    /**
     * @param customername the customername to set
     */
    public void setCustomername(String customername) {
        this.customername = customername;
    }

    /**
     * @return the customerdob
     */
    public String getCustomerdob() {
        return customerdob;
    }

    /**
     * @param customerdob the customerdob to set
     */
    public void setCustomerdob(String customerdob) {
        this.customerdob = customerdob;
    }

    /**
     * @return the customeraddress
     */
    public String getCustomeraddress() {
        return customeraddress;
    }

    /**
     * @param customeraddress the customeraddress to set
     */
    public void setCustomeraddress(String customeraddress) {
        this.customeraddress = customeraddress;
    }

    /**
     * @return the customersalary
     */
    public Double getCustomersalary() {
        return customersalary;
    }

    /**
     * @param customersalary the customersalary to set
     */
    public void setCustomersalary(Double customersalary) {
        this.customersalary = customersalary;
    }

    /**
     * @return the customercity
     */
    public String getCustomercity() {
        return customercity;
    }

    /**
     * @param customercity the customercity to set
     */
    public void setCustomercity(String customercity) {
        this.customercity = customercity;
    }

    /**
     * @return the customerprovince
     */
    public String getCustomerprovince() {
        return customerprovince;
    }

    /**
     * @param customerprovince the customerprovince to set
     */
    public void setCustomerprovince(String customerprovince) {
        this.customerprovince = customerprovince;
    }

    /**
     * @return the custmerpostalcode
     */
    public String getCustmerpostalcode() {
        return custmerpostalcode;
    }

    /**
     * @param custmerpostalcode the custmerpostalcode to set
     */
    public void setCustmerpostalcode(String custmerpostalcode) {
        this.custmerpostalcode = custmerpostalcode;
    }

    @Override
    public String toString() {
        return "customermodel{" + "customerid=" + customerid + ", customertitle=" + customertitle + ", customername=" + customername + ", customerdob=" + customerdob + ", customersalary=" + customersalary + ", customeraddress=" + customeraddress + ", customercity=" + customercity + ", customerprovince=" + customerprovince + ", custmerpostalcode=" + custmerpostalcode + '}';
    }

    

    public customermodel() {
    }

    public customermodel(String customerid, String customertitle, String customername, String customerdob, Double customersalary, String customeraddress, String customercity, String customerprovince, String custmerpostalcode) {
        this.customerid = customerid;
        this.customertitle = customertitle;
        this.customername = customername;
        this.customerdob = customerdob;
        this.customersalary = customersalary;
        this.customeraddress = customeraddress;
        this.customercity = customercity;
        this.customerprovince = customerprovince;
        this.custmerpostalcode = custmerpostalcode;
    }

    public String getCustomerpostalcode() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
    
             
             
    
}
