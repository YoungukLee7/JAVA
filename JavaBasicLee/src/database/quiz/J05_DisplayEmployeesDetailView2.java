package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import database.OjdbConnection;

public class J05_DisplayEmployeesDetailView2 {

   /*
       emp_details_view를 자바 콘솔에 보기 좋게 출력해보세요
   */
   public static void main(String[] args) {
      
      String sql = "SELECT * FROM emp_details_view";
      
      try (
            Connection conn = OjdbConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
      ) {
         ResultSetMetaData meta = rs.getMetaData();
         
         ArrayList<Integer> columnDisplaySize = new ArrayList<>();
         ArrayList<String> columnLabel = new ArrayList<>();
         
         int columnSize =  meta.getColumnCount();         
         
         for (int i = 1; i <= columnSize; ++i) {      
            int size = meta.getColumnDisplaySize(i);
            String label = meta.getColumnLabel(i);
            
            size = size > label.length() ? size : label.length();
            
            columnLabel.add(label);
         // 컬럼 사이즈마다 공간을 만들어준다
		 //	System.out.println(formet);
            String format = String.format("%%-%ds (%%2d) │ ", size);            
            System.out.printf(format, meta.getColumnLabel(i), meta.getColumnDisplaySize(i));
            
            columnDisplaySize.add(size + 8);
         }
         System.out.println();   
         
         for (int i = 0; i < columnSize; ++i) {
            int displaySize = columnDisplaySize.get(i);
            int lastIndex = displaySize - 1;
            
            for (int j = 0; j < displaySize; ++j) {
               if (j == lastIndex - 1) {
                  System.out.print('┴');
               } else {
                  System.out.print('─');                  
               }
            }            
         }
         System.out.println();
         
         while (rs.next()) {
            for (int i = 0; i < columnSize; ++i) {
               int size = columnDisplaySize.get(i);
               String label = columnLabel.get(i);
               
               String format = String.format("%%-%ds", size);               
               System.out.printf(format, rs.getObject(label));
            }   
            System.out.println();
         }         
      } catch (SQLException e) {
         e.printStackTrace();
      }
      
   }
   
}

