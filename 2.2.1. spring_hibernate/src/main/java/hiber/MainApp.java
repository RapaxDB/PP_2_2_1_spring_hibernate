package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.CarService;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
   public static void main(String[] args) {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);
      CarService carService = context.getBean(CarService.class);

      userService.addUser(new User("User1", "Lastname1", "user1@mail.ru", new Car("BJHW", 122134)));
      userService.addUser(new User("User2", "Lastname2", "user2@mail.ru", new Car("BMQ", 65656)));
      userService.addUser(new User("User3", "Lastname3", "user3@mail.ru", new Car("BQQ", 345345345)));
      userService.addUser(new User("User234", "Lastname4", "user4@mail.ru", new Car("BSD22", 1123)));

      List<User> users = userService.getUsers();
      for (User user : users) {
         System.out.println("Id = "+user.getId());
         System.out.println("First Name = "+user.getFirstName());
         System.out.println("Last Name = "+user.getLastName());
         System.out.println("Email = "+user.getEmail());
         System.out.println("car  = " + user.getCar());
      }

      User user = carService.getUser("BSD22", 1123);
      System.out.println(user);

      context.close();
   }
}
