/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.controller;
import pos.mvc.model.customermodel;
import java.sql.Connection;
import java.sql.ResultSet;
import pos.mvc.db.dbconnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import pos.mvc.model.itemmodel;

/**
 *
 * @author Hirushi
 */
public class customercontroller {
   
      public String saveCustomer(customermodel customer) throws SQLException {
    Connection connection = dbconnection.getInstance().getConnection();
    String query = "INSERT INTO Customer VALUES (?,?,?,?,?,?,?,?,?)";

    PreparedStatement preparedStatement = connection.prepareStatement(query);
    preparedStatement.setString(1, customer.getCustomerid());
    preparedStatement.setString(2, customer.getCustomertitle());
    preparedStatement.setString(3, customer.getCustomername());
    preparedStatement.setString(4, customer.getCustomerdob());
    preparedStatement.setDouble(5, customer.getCustomersalary());
    preparedStatement.setString(6, customer.getCustomeraddress());
    preparedStatement.setString(7, customer.getCustomercity());
    preparedStatement.setString(8, customer.getCustomerprovince());
    preparedStatement.setString(9, customer.getCustmerpostalcode());

    if (preparedStatement.executeUpdate() > 0) {
        return "Success";
    } else {
        return "Fail";
    }
} // Missing brace added here

/**
 * Retrieves all customers from the database.
 *
 * @return ArrayList of customermodels
 * @throws SQLException
 */
public ArrayList<customermodel> getAllCustomers() throws SQLException {
    Connection connection = dbconnection.getInstance().getConnection();

    String query = "SELECT * FROM Customer";

    PreparedStatement statement = connection.prepareStatement(query);

    ResultSet rst = statement.executeQuery();

    ArrayList<customermodel> customerModels = new ArrayList<>();

    while (rst.next()) {
        customermodel cm = new customermodel(
                rst.getString(1),
                rst.getString(2),
                rst.getString(3),
                rst.getString(4),
                rst.getDouble(5),
                rst.getString(6),
                rst.getString(7),
                rst.getString(8),
                rst.getString(9));
        customerModels.add(cm);
    }
    return customerModels;
}
public customermodel getCustomer(String custId) throws SQLException{
    Connection connection = dbconnection.getInstance().getConnection();

    String query = "SELECT * FROM Customer WHERE CustID = ?";

    PreparedStatement statement = connection.prepareStatement(query);
    statement.setString(1, custId);

    ResultSet rst = statement.executeQuery();
    
    while (rst.next()) {        
         customermodel cm = new customermodel(
                rst.getString(1),
                rst.getString(2),
                rst.getString(3),
                rst.getString(4),
                rst.getDouble(5),
                rst.getString(6),
                rst.getString(7),
                rst.getString(8),
                rst.getString(9));
        return cm;
    }
        return null;
}

public  String updateCustomer(customermodel Customermodel) throws SQLException{
     Connection connection = dbconnection.getInstance().getConnection();
    String query = "UPDATE Customer SET CustTitle=?, CustName=?,DOB=?,salary=?,CustAddress=?, City=?,Province=?,PostalCode=? WHERE CustID =?";

    PreparedStatement preparedStatement = connection.prepareStatement(query);
   preparedStatement.setString(9, Customermodel.getCustomerid());
preparedStatement.setString(1, Customermodel.getCustomertitle());
preparedStatement.setString(2, Customermodel.getCustomername());
preparedStatement.setString(3, Customermodel.getCustomerdob());
preparedStatement.setDouble(4, Customermodel.getCustomersalary());
preparedStatement.setString(5, Customermodel.getCustomeraddress());
preparedStatement.setString(6, Customermodel.getCustomercity());
preparedStatement.setString(7, Customermodel.getCustomerprovince());
preparedStatement.setString(8, Customermodel.getCustmerpostalcode());

     if (preparedStatement.executeUpdate() > 0) {
        return "Success";
    } else {
        return "Fail";
    }
    
}

public String deleteCustomer(String custID) throws SQLException{
    Connection connection = dbconnection.getInstance().getConnection();
    String query = "DELETE FROM customer WHERE CustID =?";
    PreparedStatement statement = connection.prepareCall(query);
    statement.setString(1, custID);
    
     if (statement.executeUpdate() > 0) {
        return "Success";
    } else {
        return "Fail";
    }
}


}


    
