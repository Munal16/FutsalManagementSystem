package com.FutsalManagement.controller.algorithms;

import com.FutsalManagement.model.BookingModel;
import java.util.List;

/**
 *
 * @author Munal Lmu Id = 23048582
 */
public class SelectionSort {

    public List<BookingModel> sortByBookingId(List<BookingModel> bookings, boolean isDescending) {
        for (int i = 0; i < bookings.size() - 1; i++) {
            int index = i;
            for (int j = i + 1; j < bookings.size(); j++) {
                boolean condition = isDescending
                        ? bookings.get(j).getBookingId().compareTo(bookings.get(index).getBookingId()) > 0
                        : bookings.get(j).getBookingId().compareTo(bookings.get(index).getBookingId()) < 0;

                if (condition) {
                    index = j;
                }
            }
            // Swap
            BookingModel temp = bookings.get(index);
            bookings.set(index, bookings.get(i));
            bookings.set(i, temp);
        }
        return bookings;
    }
}
