package com.FutsalManagement.controller.algorithms;
import com.FutsalManagement.model.BookingModel;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Munal Pandey LMUID = 23048582
 */
public class MergeSort {
     public List<BookingModel> sortByName(List<BookingModel> bookings, boolean isDescending) {
        if (bookings.size() <= 1) {
            return bookings;
        }

        // Split the list into two halves
        int mid = bookings.size() / 2;
        List<BookingModel> left = new ArrayList<>(bookings.subList(0, mid));
        List<BookingModel> right = new ArrayList<>(bookings.subList(mid, bookings.size()));

        // Recursively sort both halves
        left = sortByName(left, isDescending);
        right = sortByName(right, isDescending);

        // Merge the sorted halves
        return merge(left, right, isDescending);
    }

    private List<BookingModel> merge(List<BookingModel> left, List<BookingModel> right, boolean isDescending) {
        List<BookingModel> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            boolean condition = isDescending
                ? left.get(i).getFullName().compareToIgnoreCase(right.get(j).getFullName()) > 0
                : left.get(i).getFullName().compareToIgnoreCase(right.get(j).getFullName()) < 0;

            if (condition) {
                merged.add(left.get(i));
                i++;
            } else {
                merged.add(right.get(j));
                j++;
            }
        }

        // Add remaining elements
        while (i < left.size()) {
            merged.add(left.get(i));
            i++;
        }
        while (j < right.size()) {
            merged.add(right.get(j));
            j++;
        }
        return merged;
    }    
}

