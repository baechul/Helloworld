package java.com.bestgo.interfacedemo;

import java.time.*;

public interface TimeClient {
  void setTime(int hour, int minute, int second);
  void setDate(int day, int month, int year);
  void setDateAndTime(int day, int month, int year, int hour, int minute, int second);
  LocalDateTime getLocalDateTime();

  // now interface can have static methods
  static ZoneId getZoneId(String zoneString) {
    try {
      return ZoneId.of(zoneString);
    } catch (DateTimeException e) {
      System.err.println("Invalid time zone: " + zoneString + "; using default time zone instead.");
      return ZoneId.systemDefault();
    }
  }

  // and default methods
  default ZonedDateTime getZoneDateTime(String zoneString) {
    return ZonedDateTime.of(getLocalDateTime(), getZoneId(zoneString));
  }
}
