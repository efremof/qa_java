import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    private Feline feline;

    @Before
    public void setup() {
        feline = new Feline();
    }

    @Test
    public void getFamilyReturnsCorrectValue() {
        //Arrange
        String expectedFamily = "Кошачьи";
        //Перенес в @Before
//        Feline feline = new Feline();

        //Act
        String actualFamily = feline.getFamily();

        //Assert
        assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getKittensReturnsCorrectValue() {
        //Arrange
        int expectedKittensCount = 1;

        //Act
        int actualKittensCount = feline.getKittens();

        //Assert
        assertEquals(expectedKittensCount, actualKittensCount);
    }

     @Test
    public void eatMeatReturnsCorrectValue() throws Exception {
        //Arrange
        List<String> expectedEatMeat = List.of("Животные", "Птицы", "Рыба");

        //Act
        List<String> actualEatMeat = feline.eatMeat();

        //Assert
        assertEquals(expectedEatMeat, actualEatMeat);
    }

}
