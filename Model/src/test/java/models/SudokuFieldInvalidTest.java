package models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sudoku.model.models.SudokuField;

public class SudokuFieldInvalidTest 
{

    @Test
    void testInvalidNumericValues() 
    {
        SudokuField field = new SudokuField();

        //invalid values should throw exception
        assertThrows(IllegalArgumentException.class, () -> field.setValue(-1),
            "Should throw exception for negative numbers");

        assertThrows(IllegalArgumentException.class, () -> field.setValue(0),
            "Should throw exception for zero");

        assertThrows(IllegalArgumentException.class, () -> field.setValue(10),
            "Should throw exception for values > 9");

        assertThrows(IllegalArgumentException.class, () -> field.setValue(99),
            "Should throw exception for large numbers");
    }

    @Test
    void testValidBoundaryValues() 
    {
        SudokuField field = new SudokuField();

        //Valid boundaries
        field.setValue(1);
        assertEquals(1, field.getValue());

        field.setValue(9);
        assertEquals(9, field.getValue());
    }
}