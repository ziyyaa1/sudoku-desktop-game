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

        //Negative numbers should throw exception
        assertThrows(IllegalArgumentException.class, () -> field.setValue(-1),
            "Should throw exception for negative numbers");

        //Values > 9 should throw exception
        assertThrows(IllegalArgumentException.class, () -> field.setValue(10),
            "Should throw exception for values > 9");

        assertThrows(IllegalArgumentException.class, () -> field.setValue(99),
            "Should throw exception for large numbers");
            
    }

    @Test
    void testValidBoundaryValues() 
    {
        SudokuField field = new SudokuField();

        //0 is a valid boundary (Empty Cell)
        field.setValue(0);
        assertEquals(0, field.getValue(), "Zero should be valid as an empty cell");

        //existing valid boundaries
        field.setValue(1);
        assertEquals(1, field.getValue());

        field.setValue(9);
        assertEquals(9, field.getValue());
    }
}