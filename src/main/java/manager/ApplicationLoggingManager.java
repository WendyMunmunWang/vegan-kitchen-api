package manager;

import database.utility.ConnectionFactory;
import model.ApplicationLogging;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by wendywang on 2015-11-14.
 */
public class ApplicationLoggingManager {

    public ArrayList<ApplicationLogging> getApplicationLogging(Connection con) throws SQLException
    {
        ArrayList<ApplicationLogging> applicationLoggings = new ArrayList<ApplicationLogging>();
        try (Connection connection = ConnectionFactory.getConnection())
        {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM applicationLogging");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                ApplicationLogging applicationLoggingObj = new ApplicationLogging();
                applicationLoggingObj.setSessionID(rs.getString("session_id"));
                applicationLoggingObj.setSessionID(rs.getString("user_id"));
                applicationLoggings.add(applicationLoggingObj);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return applicationLoggings;
    }


}