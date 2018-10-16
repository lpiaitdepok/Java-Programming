public static Date stringToDate(String date, String format) throws ParseException {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
    return simpleDateFormat.parse(date);
}
