package ru.otus.homeworks.hw06_exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Budget implements Runnable {
    private final ArrayList<Account> accountList;
    private final ArrayList<String> goalsList;
    private final ArrayList<Integer> distributionPercentageList;
    static Scanner scanInt = new Scanner(System.in);
    static Scanner scanStr = new Scanner(System.in);

    public Budget() {
        accountList = new ArrayList<>();
        goalsList = new ArrayList<>();
        distributionPercentageList = new ArrayList<>();
    }

    public void run() {
        User user = new User();
        String name;
        try {
            name = user.verifyUserName();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        user.setUserName(name);

        Budget budget = new Budget();
        System.out.println(user.getUserName() + ", введите размер Вашей месячной заработной платы:");

        int salary = 0;
        try {
            salary = scanInt.nextInt();
        } catch (Exception e) {
            System.out.println("Неверно указан уровень заработной платы.");
        }

        Income income = new Income(salary);
        Expense expense = new Expense();

        createFinancialPlan(budget);

        boolean checked = true;
        while (checked) {
            String command = doCommand(null);
            if (command.equalsIgnoreCase("баланс")) {
                showBalance(budget);
            }

            if (command.equalsIgnoreCase("зп")) {
                distributeIncome(budget, income);
                showBalance(budget);
            }

            if (command.equalsIgnoreCase("расход")) {
                doExpense(budget, expense);
            }

            if (command.equalsIgnoreCase("выход")) {
                checked = false;
            }

            if (command.equalsIgnoreCase("траты")) {
                System.out.println("Всего израсходовано " + expense.getExpenses() + " руб");
            }
        }
    }

    private void createFinancialPlan(Budget budget) {
        System.out.println("Сколько счетов хотите создать?");
        int countOfAccounts = scanInt.nextInt();
        System.out.println("На что будем откладывать?");
        for (int i = 0; i < countOfAccounts; i++) {
            System.out.println("Введите наименование " + (i + 1) + " счета.");
            String goal = scanStr.nextLine();
            addNewGoals(budget, goal);
            System.out.println("Сколько денег уже отложено?");
            int accountBalance = scanInt.nextInt();
            addNewAccounts(new Account(accountBalance), budget);
            System.out.println("Какой процент от дохода перечислять на этот счет?");
            int percent = scanInt.nextInt();
            addPercentage(budget, percent);
        }
    }

    public String doCommand(String command) {
        try {
            System.out.println("Введите команду: \"Баланс\", \"зп\", \"Расход\", \"Траты\", или \"Выход\":");
            return command = scanStr.nextLine();
        } catch (Exception e) {
            return "баланс";
        }
    }

    public void distributeIncome(Budget budget, Income income) {
        for (int i = 0; i < budget.accountList.size(); i++) {
            int cash = returnCashValue(budget, i);
            cash += income.getSalary() * budget.distributionPercentageList.get(i) / 100;
            Account account = budget.accountList.get(i);
            account.setCash(cash);
            budget.accountList.set(i, account);
        }
    }

    public int returnCashValue(Budget budget, int index) {
        return budget.accountList.get(index).getCash();
    }

    public String returnGoalsValue(Budget budget, int i) {
        return budget.goalsList.get(i);
    }

    public void doExpense(Budget budget, Expense expense) {
        System.out.println("Из какой категории бюджета сделать расход:");
        for (int i = 0; i < budget.goalsList.size(); i++) {
            System.out.println((i + 1) + " " + returnGoalsValue(budget, i));
        }
        System.out.println("Введите цифру:");
        int numberOfAccount = scanInt.nextInt();
        numberOfAccount--;
        System.out.println("Какую сумму потратили?");
        int amountOfExpenses = scanInt.nextInt();
        expense.setExpenses(expense.getExpenses() + amountOfExpenses);
        Account account = budget.accountList.get(numberOfAccount);
        account.setCash(account.getCash() - amountOfExpenses);
        budget.accountList.set(numberOfAccount, account);
    }

    public void addNewAccounts(Account account, Budget budget) {
        budget.accountList.add(account);
    }

    public void addNewGoals(Budget budget, String goal) {
        budget.goalsList.add(goal);
    }

    public void addPercentage(Budget budget, int percent) {
        budget.distributionPercentageList.add(percent);
    }

    public void showBalance(Budget budget) {
        try (FileWriter writer = new FileWriter("balance history", true)) {
            int balance = 0;
            for (int i = 0; i < budget.accountList.size(); i++) {
                System.out.println(budget.goalsList.get(i) + ": " + returnCashValue(budget, i) + " руб");
                writer.write(budget.goalsList.get(i) + ": " + returnCashValue(budget, i) + " руб\n");
                balance += returnCashValue(budget, i);
            }
            System.out.println("Итого: " + balance + " руб");
            writer.write("Итого: " + balance + " руб\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}