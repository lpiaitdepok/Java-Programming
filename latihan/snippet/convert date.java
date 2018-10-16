//Convert String to Date

java.util.Date = java.text.DateFormat.getDateInstance().parse(date String);

//or

SimpleDateFormat format = new SimpleDateFormat( "dd.MM.yyyy" );
Date date = format.parse( myString );

//Convert Java util.Date to sql.Date

java.util.Date utilDate = new java.util.Date();
java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
