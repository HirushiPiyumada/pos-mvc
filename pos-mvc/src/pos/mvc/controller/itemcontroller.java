package pos.mvc.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import pos.mvc.db.dbconnection;
import pos.mvc.model.customermodel;
import pos.mvc.model.itemmodel;

public class itemcontroller {

    public String addItem(itemmodel Item) throws SQLException {
        Connection connection = dbconnection.getInstance().getConnection();
        String query = "INSERT INTO item (ItemCode, Description, PackSize, UnitPrice, QtyOnHand) VALUES (?,?,?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, Item.getItem_Code());
        preparedStatement.setString(2, Item.getDescription());
        preparedStatement.setString(3, Item.getPacksize());
        preparedStatement.setString(4, Item.getUnitprice());
        preparedStatement.setString(5, Item.getQtyonhand());

        if (preparedStatement.executeUpdate() > 0) {
            return "Success";
        } else {
            return "Fail";
        }
    }

    public ArrayList<itemmodel> getAllItems() throws SQLException {
        Connection connection = dbconnection.getInstance().getConnection();

        String query = "SELECT * FROM item";

        PreparedStatement statement = connection.prepareStatement(query);

        ResultSet rst = statement.executeQuery();

        ArrayList<itemmodel> Itemmodel = new ArrayList<>();

        while (rst.next()) {
            itemmodel im = new itemmodel(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5));

            Itemmodel.add(im);
        }
        return Itemmodel;
    }

    public itemmodel getItem(String Itemcode) throws SQLException {
        Connection connection = dbconnection.getInstance().getConnection();
        String query = "SELECT * FROM item WHERE ItemCode = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, Itemcode);
        ResultSet rst = statement.executeQuery();

        while (rst.next()) {
            itemmodel im = new itemmodel(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5));

            return im;
        }
        return null;
    }
    
    
          
    public String updateItem(itemmodel item) throws SQLException {
         Connection connection = dbconnection.getInstance().getConnection();
    String sql = "UPDATE item SET Description=?, PackSize=?, UnitPrice=?, QtyOnHand=? WHERE ItemCode=?";

    try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
        preparedStatement.setString(1, item.getDescription());
        preparedStatement.setString(2, item.getPacksize());
        preparedStatement.setString(3, item.getUnitprice());
        preparedStatement.setString(4, item.getQtyonhand());
        preparedStatement.setString(5, item.getItem_Code());

        int rowsAffected = preparedStatement.executeUpdate();

        if (rowsAffected > 0) {
            return "Item updated successfully.";
        } else {
            return "Failed to update item.";
        }
    }
}

    public String deleteItem(String Itemcode) throws SQLException{
         Connection connection = dbconnection.getInstance().getConnection();
         String sql = "DELETE FROM item WHERE ItemCode =?";
         PreparedStatement statement = connection.prepareCall(sql);
         statement.setString(1, sql);
         
         if (statement.executeUpdate()>0) {
            return "Sucess";
        } else {
             return "False";
        }
    }
    
}
