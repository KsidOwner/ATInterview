
import http.Specification;
import io.restassured.RestAssured;
import model.Pet;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;


public class PetTest {
    @BeforeClass
    private void settings(){
        RestAssured.requestSpecification = Specification.requestSpecification();
        RestAssured.responseSpecification = Specification.responseSpecification();
    }
    /*
    1. найти любого pet c "status": "available"
    2. изменить его статус на sold
    3. проверить что статус изменился
     */
    @Test(description = "Проверка редактирования статуса")
    public void getPetsList() {

    }
}
