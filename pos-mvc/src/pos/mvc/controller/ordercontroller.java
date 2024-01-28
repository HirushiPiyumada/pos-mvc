/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.controller;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import pos.mvc.db.dbconnection;
import pos.mvc.model.customermodel;
import pos.mvc.model.orderdeailsmodel;
import pos.mvc.model.ordermodel;

/**
 *
 * @author Hirushi
 */
public class ordercontroller {

    public String placeOrder(ordermodel Ordermodel, ArrayList<orderdeailsmodel> orderdetails) throws SQLException {
        java.sql.Connection connection = dbconnection.getInstance().getConnection();
        try {
            connection.setAutoCommit(false);
            String orderq = "INSERT INTO orders VALUES(?,?,?)";
            PreparedStatement statementq = connection.prepareStatement(orderq);
            statementq.setString(1, Ordermodel.getOrderID());
            statementq.setString(2, Ordermodel.getOrderDate());
            statementq.setString(3, Ordermodel.getCustID());

            if (statementq.executeUpdate() > 0) {

                boolean isOrderDetailSaved = true;

                String orderdetailq = "INSERT INTO orderdetail VALUES (?,?,?,?)";
                for (orderdeailsmodel order : orderdetails) {
                    PreparedStatement statementorderdetailsq = connection.prepareStatement(orderdetailq);
                    statementorderdetailsq.setString(1, Ordermodel.getOrderID());
                    statementorderdetailsq.setString(2, order.getItemcode());
                    statementorderdetailsq.setString(3, order.getOrderQty());
                    statementorderdetailsq.setString(4, order.getDiscouunt());

                    if (!(statementorderdetailsq.executeUpdate() > 0)) {
                        isOrderDetailSaved = false;
                    }
                }

                if (isOrderDetailSaved) {
                    boolean isItemUpdated = true;

                    String itemq = "UPDATE item SET QtyOnHand = QtyOnHand-? WHERE  ItemCode=?";
                    for (orderdeailsmodel order : orderdetails) {
                        PreparedStatement statementforitem = connection.prepareStatement(itemq);
                        statementforitem.setString(1, order.getOrderQty());
                        statementforitem.setString(2, order.getItemcode());

                        if (!(statementforitem.executeUpdate() >= 0)) {
                            isItemUpdated = false;
                        }
                    }

                    if (isItemUpdated) {
                        connection.commit();
                        return "Sucess";
                    } else {
                        connection.rollback();
                        return "Order Update Error";
                    }
                } else {
                    connection.rollback();
                    return "Order Save Error";
                }

            } else {

                connection.rollback();
                return "Order Detai Save Error";
            }
        } catch (Exception e) {
            connection.rollback();
            e.printStackTrace();
            return e.getMessage();

        } finally {
            connection.setAutoCommit(true);
        }

    }
}
