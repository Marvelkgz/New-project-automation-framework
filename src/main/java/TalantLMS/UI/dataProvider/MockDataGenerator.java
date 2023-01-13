package TalantLMS.UI.dataProvider;

import com.github.javafaker.Faker;

public class MockDataGenerator {

    Faker faker = new Faker();
   public String generateMockFirstName(){
      return faker.name().firstName();
   }

   public String generateMockLastName(){
       return faker.name().lastName();
   }
   public String generateMockEmail(){
       return faker.internet().emailAddress();
   }
   public String generateMockUsername(){
       return faker.name().username();
   }
   public String generateMockPassword(){
       return faker.internet().password();
   }
    public String generateMockBio(){
        return faker.country().name();
    }


}
