package impl;

import java.util.Calendar;
import java.util.List;

public interface ParseImpl {
    Calendar parsBirthday(String date);

    List<String> parsCommand(String commands);
}
