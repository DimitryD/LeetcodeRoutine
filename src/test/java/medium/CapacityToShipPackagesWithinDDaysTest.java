package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapacityToShipPackagesWithinDDaysTest {
    CapacityToShipPackagesWithinDDays capacityToShipPackagesWithinDDays = new CapacityToShipPackagesWithinDDays();

    @Test
    void test1() {
        int[] weights = new int[]{1,2,3,4,5,6,7,8,9,10};
        assertEquals(15, capacityToShipPackagesWithinDDays.shipWithinDays(weights, 5));
    }

    @Test
    void test2() {
        int[] weights = new int[]{3,2,2,4,1,4};
        assertEquals(6, capacityToShipPackagesWithinDDays.shipWithinDays(weights, 3));
    }

    @Test
    void test3() {
        int[] weights = new int[]{1,2,3,1,1};
        assertEquals(3, capacityToShipPackagesWithinDDays.shipWithinDays(weights, 4));
    }

}