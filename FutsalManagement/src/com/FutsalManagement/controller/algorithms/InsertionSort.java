package com.FutsalManagement.controller.algorithms;

import com.FutsalManagement.model.BookingModel;
import java.util.List;

/**
 *
 * @author Munal Pandey LMUID = 23048582
 */
public class InsertionSort {

    public void sortByLocation(List<BookingModel> bookings, boolean isDescending) {
        for (int i = 1; i < bookings.size(); i++) {
            BookingModel key = bookings.get(i);
            int j = i - 1;

            // Compare locations in ascending or descending order
            while (j >= 0 && compare(bookings.get(j).getLocation(), key.getLocation(), isDescending)) {
                bookings.set(j + 1, bookings.get(j));
                j--;
            }
            bookings.set(j + 1, key);
        }
    }

    private boolean compare(String location1, String location2, boolean isDescending) {
        if (isDescending) {
            return location1.compareToIgnoreCase(location2) < 0; // Descending order
        } else {
            return location1.compareToIgnoreCase(location2) > 0; // Ascending order
        }
    }
}
