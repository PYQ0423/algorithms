import java.util.Arrays;

/**
 * @program: algorithms
 * @author: Programming Queen
 * @create: 2019-11-13 10:11
 **/

public class FindChoices {
    // You have certain amount of money,
    // You want to spend all your money, and buy 2 flavor of ice cream.
    // You shall return the indices, not the value.
    // Note: the two flavors cannot be the same.

    private static int indexOf(int[] menu, int value, int excludeThis) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == value && i != excludeThis)
                return i;
        }
        return -1;
    }

    private static int[] getIndicesFromValues(int[] menu, int value1, int value2) {
        int index1 = indexOf(menu, value1, -1);
        int index2 = indexOf(menu, value2, index1);
        int[] indices = {Math.min(index1, index2), Math.max(index1, index2)};
        return indices;
    }

    public static int[] findChoices(int[] menu, int money) {
        int[] sortedMenu = menu.clone();
        Arrays.sort(sortedMenu);

        for (int i = 0; i < sortedMenu.length; i++) {
            int complement = money - sortedMenu[i];
            int Location = Arrays.binarySearch(sortedMenu, i + 1, sortedMenu.length, complement);
            if (Location >= 0 && Location < sortedMenu.length && sortedMenu[Location] == complement) {
                int[] indices = getIndicesFromValues(menu, sortedMenu[i], complement);
                return indices;
            }
        }
        return null;
    }
}

