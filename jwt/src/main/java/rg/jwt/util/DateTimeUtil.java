package rg.jwt.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.sql.Timestamp;

public class DateTimeUtil {

	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

	private static final SimpleDateFormat DATE_TIME_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public static java.sql.Date parseDate(String date) {
		if (date == null || "".equals(date)) {
			return null;
		}
		try {
	        return new Date(DATE_FORMAT.parse(date).getTime());
	    } catch (ParseException e) {
	        throw new IllegalArgumentException(e);
	    }
	}

	public static java.sql.Timestamp parseTimestamp(String timestamp) {
		if (timestamp == null || "".equals(timestamp)) {
			return null;
		}
	    try {
	        return new Timestamp(DATE_TIME_FORMAT.parse(timestamp).getTime());
	    } catch (ParseException e) {
	        throw new IllegalArgumentException(e);
	    }
	}

	public static String returnDate(Date date) {
		if (date == null) {
			return null;
		}
		return DATE_FORMAT.format(date);
	}

	public static String returnTimestamp(Timestamp dateCreated) {
		if (dateCreated == null) {
			return null;
		}
        return DATE_TIME_FORMAT.format(dateCreated);
	}
}
