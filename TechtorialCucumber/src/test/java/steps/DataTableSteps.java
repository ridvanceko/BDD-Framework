package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class DataTableSteps {

    @Given("the user print product titles")
    public void the_user_print_product_titles(DataTable dataTable) {

        List<String> productInfo = dataTable.asList();
        for(String info: productInfo) {
            System.out.println(info);
        }


    }

    @Then("user print credentials")
    public void user_print_credentials(DataTable dataTable) {

        Map<String, String> credentials = dataTable.asMap(String.class, String.class);

        Set<String> keys = credentials.keySet();

        for(String key: keys) {
            System.out.println("Key: " + key + "Value: " + credentials.get(key));
        }

        
    }

    @Then("the user print product info")
    public void the_user_print_product_info(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }

}
