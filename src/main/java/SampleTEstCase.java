import models.User;
import org.springframework.web.client.RestTemplate;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTEstCase {
    @Test
    public void testUserInfoResponse(){
        RestTemplate restTemplate = new RestTemplate(); // класс который позволяет делать разные запросы
        User user = restTemplate.getForObject("https://api.github.com/users/igorzip228", User.class); // какой url используем и куда его сохранять,
        // надо создать новый package models, а в нем  класс User и сохраняем в переменную user типа User
        Assert.assertTrue(user.getHtml_url().contains("https://github.com/igorzip228"));

    }

}
