package com.clsc.mainpackage;

public class User {
public void storeUserCredentials (String user_ID, String user_name, String user_password) {
Connect con=new Connect();
con.getConnection();
String query="insert into test.user_credentials3 values ('"+user_ID+"','"+user_name+"','"+user_password+"')";
con.executeUpdateQuery(query);
con.closeConnection();
}
public void viewUserCredentials() {
}
}
