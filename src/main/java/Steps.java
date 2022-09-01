import io.qameta.allure.Step;
import model.Pet;
import org.testng.Assert;

import java.util.List;
import java.util.Map;
import java.util.Random;

import static http.endPoints.*;
import static io.restassured.RestAssured.given;

public class Steps {

    @Step("Отправка запроса на получение списка животных")
    public static List<Pet> getAvailablePets(){
        return null;
    }

    @Step("Найти рандомного pet")
    public static Pet getRandomPet(List<Pet> list){
        return null;
    }

    @Step("Изменение статуса на \"sold\"")
    public static void changeStatusPet(Pet pet){

    }

    @Step("Отправка запроса на изменение")
    public static void sendEditRequest(Pet body){

    }

    @Step("Отправка запроса на получение карточки Pet")
    public static Pet sendGetRequest(Long id){
        return null;
    }

    @Step("ПРоверка, что карточка успешно обновилась")
    public static void checkUpdatedStatus(String actual, String expected){

    }
}