# Groovy Null Handling Bug

This repository demonstrates a subtle bug in a Groovy method's handling of null values.  The `myMethod` function is supposed to add two numbers, but it doesn't gracefully handle cases where either input is null.  Instead of throwing an exception or returning an indication of the error, it silently returns null.

## Bug Description
The issue lies in how the method handles the null check.  A more robust approach would be to either throw an exception or return a more descriptive result when a null value is encountered.

## Solution
The provided solution enhances the error handling to either throw an `IllegalArgumentException` when a null is passed or to return a more informative result such as -1 or a String indicating failure.
