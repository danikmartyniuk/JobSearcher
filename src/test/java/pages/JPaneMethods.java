package pages;

import utils.FilesWriter;

import javax.swing.*;
import java.io.IOException;

public class JPaneMethods {

    public JPaneMethods getKeyWords () throws IOException {
        FilesWriter.writeToFile(JOptionPane.showInputDialog(null, "Введите ключевые слова, связанные с ожидаемой работой:"));
        return this;
    }

    public JPaneMethods getMinSalary () throws IOException {
        FilesWriter.writeToFile(JOptionPane.showInputDialog(null, "Введите минимальную желаемую зарплату:"));
        return this;
    }

    public JPaneMethods needSalary () throws IOException {
        int x = JOptionPane.showConfirmDialog(null, "Вы хотите видеть вакансии без указания зарплаты?");
        if (x == 0) {
            FilesWriter.writeToFile("0");
        } else {
            FilesWriter.writeToFile("1");
        }
        return this;
    }

    public JPaneMethods getExp () throws IOException {
        String[] choices = {"Не имеет значения", "Нет опыта", "От 1 года до 3 лет", "От 3 до 6 лет", "Более 6 лет"};
        String input = (String) JOptionPane.showInputDialog(null, "Требуемый опыт работы?",
                "Опыт работы", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
        for (int i = 0; i < choices.length; i++) {
            if (choices[i].contains(input)) {
                FilesWriter.writeToFile(Integer.toString(i));
                break;
            }
        }
        return this;
    }

    public JPaneMethods setSchedule () throws IOException {
        FilesWriter.writeToFile(JOptionPane.showInputDialog(null, "Выберите удобный график работы:\n0. Полный день\n1. Сменный график\n2. Гибкий график\n" +
                "3. Удаленная работа\n4. Вахтовый метод\n Запишите номера выбранных опций через пробел:", "График работы", JOptionPane.QUESTION_MESSAGE));
        return this;
    }

    public JPaneMethods setTypesOfEmpl () throws IOException {
        FilesWriter.writeToFile(JOptionPane.showInputDialog(null, "Приемлимый для вас тип занятости:\n0. Полная занятость\n1. Частичная занятость\n2. Временная работа\n" +
                "3. Волонтерство\n4. Стажировка\n Запишите номера выбранных опций через пробел:", "Тип занятости", JOptionPane.QUESTION_MESSAGE));
        return this;
    }

    public void setVacanciesAge () throws IOException {
        String[] choices = {"За месяц", "За неделю", "За последние три дня", "За сутки"};
        String input = (String) JOptionPane.showInputDialog(null, "Какие вакансии вывести?",
                "Возраст вакансий", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
        for (int i = 0; i < choices.length; i++) {
            if (choices[i].contains(input)) {
                FilesWriter.writeToFile(Integer.toString(i));
                break;
            }
        }
    }

}
