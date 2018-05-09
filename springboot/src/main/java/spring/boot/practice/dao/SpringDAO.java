package spring.boot.practice.dao;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import spring.boot.practice.model.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;

@Repository
public class SpringDAO {
	
	@Autowired
   private JdbcTemplate jdbcTemplate;
	
	private static final String SQL = "select * from customer";
	 
    
	



	public List<Customer> isData() {

         List<Customer> customers = new ArrayList<Customer>();
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(SQL);

         for (Map<String, Object> row : rows) 
         {
              Customer customer = new Customer();
              customer.setSno((int)row.get("sno"));
              customer.setSname((String)row.get("sname"));
              customer.setBname((String)row.get("branch"));
              customers.add(customer);
          }

        return customers;
    }
}
