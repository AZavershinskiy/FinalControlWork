package mvc;

import impl.CheckImpl;

public class Checker implements CheckImpl {

    @Override
    public boolean checkDateString(String date) {
        if (date.length() == 0 || !date.toLowerCase().matches("[^a-z]+"))
            return false;
        else if (!date.contains("."))
            return false;
        return true;
    }

    @Override
    public boolean checkDateArray(Integer[] date) {
        if (date.length != 3) {
            return false;
        }
        if (date[2] < 1950 || date[2] > 2023)
            return false;
        if (date[1] < 1 || date[1] > 12)
            return false;
        if (date[0] < 1)
            return false;
        switch (date[1]) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (date[0] > 31)
                    return false;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (date[0] > 30)
                    return false;
                break;
            case 2:
                if (date[2] % 4 != 0) {
                    if (date[0] > 28)
                        return false;
                } else {
                    if (date[0] > 29)
                        return false;
                }
                break;
        }
        return true;
    }
}
