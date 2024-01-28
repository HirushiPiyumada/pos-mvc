/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.model;

/**
 *
 * @author Hirushi
 */
public class itemmodel {
    private String Item_Code;
    private String Description;
    private String Packsize;
    private String Unitprice;
    private String Qtyonhand;

    /**
     * @return the Item_Code
     */
    public String getItem_Code() {
        return Item_Code;
    }

    /**
     * @param Item_Code the Item_Code to set
     */
    public void setItem_Code(String Item_Code) {
        this.Item_Code = Item_Code;
    }

    /**
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * @return the Packsize
     */
    public String getPacksize() {
        return Packsize;
    }

    /**
     * @param Packsize the Packsize to set
     */
    public void setPacksize(String Packsize) {
        this.Packsize = Packsize;
    }

    /**
     * @return the Unitprice
     */
    public String getUnitprice() {
        return Unitprice;
    }

    /**
     * @param Unitprice the Unitprice to set
     */
    public void setUnitprice(String Unitprice) {
        this.Unitprice = Unitprice;
    }

    /**
     * @return the Qtyonhand
     */
    public String getQtyonhand() {
        return Qtyonhand;
    }

    /**
     * @param Qtyonhand the Qtyonhand to set
     */
    public void setQtyonhand(String Qtyonhand) {
        this.Qtyonhand = Qtyonhand;
    }

    @Override
    public String toString() {
        return "itemmodel{" + "Item_Code=" + Item_Code + ", Description=" + Description + ", Packsize=" + Packsize + ", Unitprice=" + Unitprice + ", Qtyonhand=" + Qtyonhand + '}';
    }

    public itemmodel() {
    }

    public itemmodel(String Item_Code, String Description, String Packsize, String Unitprice, String Qtyonhand) {
        this.Item_Code = Item_Code;
        this.Description = Description;
        this.Packsize = Packsize;
        this.Unitprice = Unitprice;
        this.Qtyonhand = Qtyonhand;
    }
    
    
}
