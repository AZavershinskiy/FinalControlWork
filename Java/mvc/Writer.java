package mvc;

import exceptions.*;
import impl.Enter;

import java.util.*;

public class Writer implements Enter {
    Checker checker;

    public Writer() {
        this.checker = new Checker();
    }

    @Override
    public int enterChoice() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice >= 0 && choice <= 4)
            return choice;
        else
            throw new EnterChoiceException();
    }

    @Override
    public String enterName() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (name.length() == 0 || !name.matches("[^0-9]+"))
            throw new NameException();
        return name;
    }

    @Override
    public Calendar enterBirthday() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine().toLowerCase();
        if (!checker.checkDateString(date))
            throw new BirthdayException();
        String[] arrDate = date.replace(".", "/").split("/");
        Integer[] arrInt = new Integer[arrDate.length];
        for (int i = 0; i < 3; i++) {
            arrInt[i] = Integer.parseInt(arrDate[i]);
        }
        if (!checker.checkDateArray(arrInt))
            throw new BirthdayException();
        return new GregorianCalendar(arrInt[2],arrInt[1]-1, arrInt[0]);
    }

    @Override
    public String enterCommand() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        if (command.length() == 0 || !command.matches("[^0-9]+"))
            throw new CommandException();
        return command;
    }

    @Override
    public List<String> enterCommands() throws InputMismatchException {
        return null;
    }

    @Override
    public String enterType() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine().toLowerCase();
        if (!type.equals("pet") && !type.equals("pack"))
            throw new TypeException();
        return type;
    }

    @Override
    public String enterKind(String type) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        String kind = scanner.nextLine().toLowerCase();
        if (type.equals("pet")) {
            if (!kind.equals("dog") && !kind.equals("cat") && !kind.equals("hamster"))
                throw new KindException();
        } else {
            if (!kind.equals("horse") && !kind.equals("camel") && !kind.equals("donkey"))
                throw new KindException();
        }
        return kind;
    }

    @Override
    public Boolean questionNewCommand() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (!answer.equals("yes") && !answer.equals("no") && !answer.equals("y") && !answer.equals("n")){
            throw new QuestionException();
        }
        if (answer.equals("no") || answer.equals("n"))
            return false;
        return true;
    }

    @Override
    public int choiceAnimal(int length) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice >= 1 && choice <= length)
            return choice;
        else
            throw new AnimalChoiceException();
    }

}
