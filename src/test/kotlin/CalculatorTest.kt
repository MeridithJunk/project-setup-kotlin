import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CalculatorTest {

    @Test
    fun `Given the numbers two and three When I call Calculator Then return five`() {
        // Arrange
        val calculator = Calculator()
        val expected = 5
        // Act
        val actual = calculator.add(2, 3)
        // Assert
        assertEquals(expected, actual)
    }
}