package zadania.ex8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParcelValidatorTest {

    @Test
    void shouldReturnTrueWhenSizeAndExpressModeValid() {
        //given
        int x = 40;
        int y = 40;
        int z = 40;
        int weight = 10;
        boolean express = true;
        Parcel parcel = new Parcel(x, y, z, weight, express);
        boolean expectedResult = true;

        //when
        ParcelValidator validator = new ParcelValidator();
        boolean validate = validator.validate(parcel);

        //then
        assertEquals(expectedResult, validate);
    }

}