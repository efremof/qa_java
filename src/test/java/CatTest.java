import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)

public class CatTest {

    @Mock
    private Feline feline;

    @Test
    public void getSoundReturnCorrectValue() {
        //Arrange
        String expectedSound = "Мяу";
        Cat cat = new Cat(feline);

        //Act
        String actualSound = cat.getSound();

        //Assert
        assertEquals(expectedSound, actualSound);
    }

    @Test
    public void getFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(cat.getFood()).thenReturn(List.of("Мышь"));
        Assert.assertEquals(List.of("Мышь"), cat.getFood());
    }

}


