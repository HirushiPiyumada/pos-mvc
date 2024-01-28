/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.model;

/**
 *
 * @author Hirushi
 */
public class orderdeailsmodel {
    private  String orderID;
    private String Itemcode;
    private String orderQty;
    private String discouunt;

    /**
     * @return the orderID
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * @param orderID the orderID to set
     */
    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    /**
     * @return the Itemcode
     */
    public String getItemcode() {
        return Itemcode;
    }

    /**
     * @param Itemcode the Itemcode to set
     */
    public void setItemcode(String Itemcode) {
        this.Itemcode = Itemcode;
    }

    /**
     * @return the orderQty
     */
    public String getOrderQty() {
        return orderQty;
    }

    /**
     * @param orderQty the orderQty to set
     */
    public void setOrderQty(String orderQty) {
        this.orderQty = orderQty;
    }

    /**
     * @return the discouunt
     */
    public String getDiscouunt() {
        return discouunt;
    }

    /**
     * @param discouunt the discouunt to set
     */
    public void setDiscouunt(String discouunt) {
        this.discouunt = discouunt;
    }

    @Override
    public String toString() {
        return "orderdeailsmodel{" + "orderID=" + orderID + ", Itemcode=" + Itemcode + ", orderQty=" + orderQty + ", discouunt=" + discouunt + '}';
    }

    public orderdeailsmodel(String orderID, String Itemcode, String orderQty, String discouunt) {
        this.orderID = orderID;
        this.Itemcode = Itemcode;
        this.orderQty = orderQty;
        this.discouunt = discouunt;
    }
    
     
}
