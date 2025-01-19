package com.FutsalManagement.controller.algorithms;

import com.FutsalManagement.model.BookingModel;
import java.util.List;

/**
 *
 * @author Munal Lmu Id = 23048582
 */
public class BinarySearch {

    // Search by FullName (String)
    public int searchByFullName(List<BookingModel> bookings, int low, int high, String searchKey) {
        if (high >= low) {
            int mid = (low + high) / 2;

            // Get the FullName value
            String fullName = bookings.get(mid).getFullName();

            // If the element is found
            if (fullName.equalsIgnoreCase(searchKey)) {
                return mid;
            }

            // If the search key is smaller, search in the left subarray
            if (fullName.compareToIgnoreCase(searchKey) > 0) {
                return searchByFullName(bookings, low, mid - 1, searchKey);
            }

            // Otherwise, search in the right subarray
            return searchByFullName(bookings, mid + 1, high, searchKey);
        }

        return -1; // Not found
    }

    // Search by BookingId (Integer)
    public int searchByBookingId(List<BookingModel> bookings, int low, int high, int searchKey) {
        if (high >= low) {
            int mid = (low + high) / 2;

            // Get the BookingId value
            int bookingId = Integer.parseInt(bookings.get(mid).getBookingId());

            // If the element is found
            if (bookingId == searchKey) {
                return mid;
            }

            // If the search key is smaller, search in the left subarray
            if (bookingId > searchKey) {
                return searchByBookingId(bookings, low, mid - 1, searchKey);
            }

            // Otherwise, search in the right subarray
            return searchByBookingId(bookings, mid + 1, high, searchKey);
        }

        return -1; // Not found
    }
}
