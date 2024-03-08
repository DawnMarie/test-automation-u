package dropdown;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import base.BaseTests;
import org.testng.annotations.Test;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOption() {
        var dropdownPage = homePage.clickDropDown();

        String option = "Option 1";
        dropdownPage.selectFromDropdown(option);
        var selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections.");
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
