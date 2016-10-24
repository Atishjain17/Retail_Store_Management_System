package atish;
import java.sql.*;

public class Atish {

     private Connection con;// object of coonnection for linking
    private Statement st;// object of statements of queries
    private ResultSet rs;//object of resultset for user and passes
    public Atish(){
    try
    {
        Class.forName("com.mysql.jdbc.Driver");//to give which software either mysql or sqlite
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atish","root","");//path can be changed //use the correct name of the database file
        st=con.createStatement();//if connection is not present no use of this line
        
    }
    catch(Exception ex){
    System.out.println(ex);
    }
}
    ResultSet getResult(String query){
        try{
            st=con.createStatement();
            ResultSet res=st.executeQuery(query);
            return res;
        }
        catch(Exception ex){
            ex.printStackTrace();
    }
        return null;
        }
    
    public void getData()
    {
        try{
            String query1="select * from employee_info";//start the query and mentinon the table name that is student
            rs=st.executeQuery(query1);//to retrieve data
            System.out.println("records:");
            while (rs.next()){//next is to check the records present after the func. for next values 
                String name=rs.getString("Employee_name");//enter column name as parameter
                String id=rs.getString("Employee_id");
                String add=rs.getString("Employee_address");
                String contact=rs.getString("Employee_contact");
                String sal=rs.getString("Employee_salary");
                String post=rs.getString("Employee_post");//enter column name as parameter
                System.out.println("name:"+name);
                System.out.println("Sap:"+id);
                System.out.println("Address:"+add);
                System.out.println("contact no. :"+contact);
                System.out.println("salary:"+sal);
                System.out.println("post:"+post);
            } 
            String query2="select * from customer_info";
             rs=st.executeQuery(query2);
             System.out.println("records:");
            while (rs.next()){//next is to check the records present after the func. for next values 
                String cname=rs.getString("Customer_Name");//enter column name as parameter
                String sn=rs.getString("Customer_id");
                String cadd=rs.getString("Customer_Address");
                String bill=rs.getString("Bill_no");
                String qpid=rs.getString("product_id");
                String q=rs.getString("Quantity");
                String ap=rs.getString("Amount_Paid");
                System.out.println("name:"+cname);
                System.out.println("Serial:"+sn);
                System.out.println("Address:"+cadd);
                System.out.println("bill no. :"+bill);
                System.out.println("Product_id:"+qpid);
                System.out.println("Qunatity :"+q);
                System.out.println("Amount Paid:"+ap);
            }
            
            String query3="select * from product_info";
             rs=st.executeQuery(query3);
             System.out.println("records:");
            while (rs.next()){//next is to check the records present after the func. for next values 
                String pname=rs.getString("Product_name");//enter column name as parameter
                String pmat=rs.getString("Product_material");
                String pid=rs.getString("product_id");
                String wname=rs.getString("wholesaler_name");//enter column name as parameter
                String pval=rs.getString("product_value");
                String mval=rs.getString("market_value");
                String pquan=rs.getString("product_quantity");//enter column name as parameter
                System.out.println("Product Name:"+pname);
                System.out.println("Product Material:"+pmat);
                System.out.println("ProductId:"+pid);
                System.out.println("Wholesaler Name:"+wname);
                System.out.println("Product Value:"+pval);
                System.out.println("Product Value:"+mval);
                System.out.println("ProductQuantiy:"+pquan);
            }
            
        }
        catch(Exception ex){
            System.out.println(ex);
    }
    }
    public static void main(String[] args) {
                Atish d=new Atish();
        d.getData();
         emp_ui eu=new emp_ui();
        eu.setVisible(true);
    }
        // TODO code application logic here
    }
    
