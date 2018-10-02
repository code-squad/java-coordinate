package view;

import dto.PointDto;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

import static org.junit.Assert.*;

public class InputViewTest {

    @Test
    public void makePointDto() {
        String point = "(23,3)";
        PointDto dto = new PointDto(23,3);
        assertThat(InputView.makePointDto(point), is(dto));
    }



}