package com.FutsalManagement.util;

import java.util.regex.Pattern;

/**
 *
 * @author Munal Lmu Id = 23048582
 */
public class Validationutil {

    // Regular expression patterns
    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$");
    private static final Pattern BOOKING_ID_PATTERN = Pattern.compile("^\\d{6}$");
    private static final Pattern BOOKING_DATE_PATTERN = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
    private static final Pattern CONTACT_PATTERN = Pattern.compile("^98\\d{8}$");
    private static final Pattern LOCATION_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$");
    private static final Pattern TOTAL_COST_PATTERN = Pattern.compile("^\\d+(\\.\\d{1,2})?$");

    /**
     * Validates if a string is null or empty.
     *
     * @param value the string to validate
     * @return true if the string is null or empty, otherwise false
     */
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    /**
     * Validates if the name contains only alphabets and spaces.
     *
     * @param name the name to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidName(String name) {
        return !isNullOrEmpty(name) && NAME_PATTERN.matcher(name).matches();
    }

    /**
     * Validates if the Booking Id is exactly 6 digits.
     *
     * @param BookingId the Booking ID to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidBookingId(String BookingId) {
        return !isNullOrEmpty(BookingId) && BOOKING_ID_PATTERN.matcher(BookingId).matches();
    }

    /**
     * Validates if the Booking date is in the correct format.
     *
     * @param BookingDate the BookingDate to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidBookingDate(String BookingDate) {
        return !isNullOrEmpty(BookingDate) && BOOKING_DATE_PATTERN.matcher(BookingDate).matches();
    }

    /**
     * Validates if the contact number starts with 98 and has 10 digits in
     * total.
     *
     * @param contact the contact number to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidContact(String contact) {
        return !isNullOrEmpty(contact) && CONTACT_PATTERN.matcher(contact).matches();
    }

    /**
     * Validates if the location contains only alphabets and spaces.
     *
     * @param location the location to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidLocation(String location) {
        return !isNullOrEmpty(location) && LOCATION_PATTERN.matcher(location).matches();
    }

    /**
     * Validates if the total cost is a numeric value with up to two decimal
     * places.
     *
     * @param totalCost the total cost to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidTotalCost(String totalCost) {
        return !isNullOrEmpty(totalCost) && TOTAL_COST_PATTERN.matcher(totalCost).matches();
    }

    /**
     * Generic field validation utility that checks for non-empty and specific
     * criteria.
     *
     * @param value the field value to validate
     * @param isCriteria the specific criteria to validate against
     * @return true if both non-empty and criteria validation pass, otherwise
     * false
     */
    public static boolean validateField(String value, boolean isCriteria) {
        return !isNullOrEmpty(value) && isCriteria;
    }
}
